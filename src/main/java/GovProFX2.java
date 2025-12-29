import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GovProFX2 extends Application {

    // Δεδομένα μετασχηματισμένα σε Objects για τον TableView
    public static class BudgetEntry {
        private String code;
        private String name;
        private BigDecimal amount;

        public BudgetEntry(String code, String name, BigDecimal amount) {
            this.code = code;
            this.name = name;
            this.amount = amount;
        }
        public String getCode() { return code; }
        public String getName() { return name; }
        public BigDecimal getAmount() { return amount; }
        public void setAmount(BigDecimal amount) { this.amount = amount; }
    }

    private ObservableList<BudgetEntry> masterData = FXCollections.observableArrayList();
    private TableView<BudgetEntry> table = new TableView<>();

   @Override
   public void start(Stage primaryStage) {
      // --- Background Image ---
      Image bgImage = new Image(getClass().getResource("/images/GovProbackground.png").toExternalForm());
      ImageView bgView = new ImageView(bgImage);
      bgView.setFitWidth(1000);
      bgView.setFitHeight(600);
      bgView.setPreserveRatio(false);

      // --- StackPane για welcome screen ---
      StackPane startPane = new StackPane();
      startPane.getChildren().add(bgView);

      // --- Welcome Message ---
      VBox welcomeBox = new VBox(20);
      welcomeBox.setAlignment(Pos.BOTTOM_CENTER);

      Button goButton = new Button("Start here →");
      goButton.setStyle("-fx-font-family: 'Dancing Script'; -fx-font-size: 20px; -fx-background-color: rgba(21, 185, 7, 0.8); -fx-text-fill: white;");

      welcomeBox.getChildren().addAll(goButton);
      startPane.getChildren().add(welcomeBox);

      Scene startScene = new Scene(startPane, 1000, 600);
      primaryStage.setScene(startScene);
      primaryStage.setTitle("🏛️ GovPro Budget System 2025");
      primaryStage.show();

      // --- Όταν πατηθεί το κουμπί, πάμε στο Dashboard ---
      goButton.setOnAction(e -> {
      primaryStage.setScene(createDashboardScene(primaryStage));
    });
}
    // Δημιουργεί dashboard με αριστερό menu και δεξιά περιεχόμενο
    private Scene createDashboardScene(Stage primaryStage) {
        // --- Left Menu ---
        VBox menuBox = new VBox(15);
        menuBox.setPadding(new Insets(20));
        menuBox.setStyle("-fx-background-color: #2c3e50;");
        menuBox.setPrefWidth(250);

        Button btnRead = new Button("📋 Προβολή Προϋπολογισμού");
        Button btnAmend = new Button("🔧 Τροποποίηση");
        Button btnPredict = new Button("📈 Πρόβλεψη Λογαριασμού");
        Button btnStats = new Button("📊 Στατιστικά");

        for (Button b : new Button[]{btnRead, btnAmend, btnPredict, btnStats}) {
            b.setMaxWidth(Double.MAX_VALUE);
            b.setStyle("-fx-font-size: 14px; -fx-text-fill: white; -fx-background-color: #34495e;");
        }

        menuBox.getChildren().addAll(btnRead, btnAmend, btnPredict, btnStats);

        // --- Center Content Pane ---
        StackPane contentPane = new StackPane();
        contentPane.setPadding(new Insets(20));

        // --- TableView ---
        setupTable();
        if (table.getItems().isEmpty()) initializeData();
        table.setVisible(false); // εμφανίζεται μόνο όταν πατήσει btnRead
        contentPane.getChildren().add(table);

        // --- Button Actions ---
        btnRead.setOnAction(e -> {
            table.setVisible(true);
        });

        btnAmend.setOnAction(e -> showAmendDialog());
        btnPredict.setOnAction(e -> showPredictDialog());
        btnStats.setOnAction(e -> {
            VBox statsBox = new VBox(new Label("Στατιστικά θα εμφανιστούν εδώ"));
            statsBox.setAlignment(Pos.CENTER);
            contentPane.getChildren().setAll(statsBox);
        });

        // --- Layout ---
        BorderPane root = new BorderPane();
        root.setLeft(menuBox);
        root.setCenter(contentPane);

        return new Scene(root, 1000, 600);
    }

    private void setupTable() {
        TableColumn<BudgetEntry, String> codeCol = new TableColumn<>("Κωδικός");
        codeCol.setCellValueFactory(new PropertyValueFactory<>("code"));
        codeCol.setPrefWidth(100);

        TableColumn<BudgetEntry, String> nameCol = new TableColumn<>("Περιγραφή");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        nameCol.setPrefWidth(400);

        TableColumn<BudgetEntry, BigDecimal> amountCol = new TableColumn<>("Ποσό (€)");
        amountCol.setCellValueFactory(new PropertyValueFactory<>("amount"));
        amountCol.setPrefWidth(200);

        // Custom formatting για τα νούμερα στον πίνακα
        amountCol.setCellFactory(tc -> new TableCell<>() {
            @Override
            protected void updateItem(BigDecimal item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) setText(null);
                else setText(NumberFormat.getInstance(Locale.GERMANY).format(item));
            }
        });

        table.getColumns().addAll(codeCol, nameCol, amountCol);
        table.setItems(masterData);
    }

    private void showAmendDialog() {
        Stage dialog = new Stage();
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.setTitle("🔧 Τροποποίηση Ποσού");

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        ComboBox<String> combo = new ComboBox<>();
        masterData.forEach(entry -> combo.getItems().add(entry.getCode() + " - " + entry.getName()));
        
        TextField txtNewValue = new TextField();
        txtNewValue.setPromptText("Εισάγετε νέο ποσό...");

        Button btnSave = new Button("Αποθήκευση ✅");
        btnSave.setMaxWidth(Double.MAX_VALUE);
        btnSave.setOnAction(e -> {
            int idx = combo.getSelectionModel().getSelectedIndex();
            if (idx >= 0) {
                try {
                    BigDecimal val = new BigDecimal(txtNewValue.getText().replace(",", "."));
                    masterData.get(idx).setAmount(val);
                    table.refresh();
                    dialog.close();
                } catch (Exception ex) {
                    txtNewValue.setStyle("-fx-border-color: red;");
                }
            }
        });

        layout.getChildren().addAll(new Label("Επιλογή Λογαριασμού:"), combo, new Label("Νέο Ποσό:"), txtNewValue, btnSave);
        dialog.setScene(new Scene(layout, 400, 250));
        dialog.show();
    }

    private void showPredictDialog() {
        Stage dialog = new Stage();
        dialog.initModality(Modality.NONE); // Επιτρέπει να δουλεύεις και στο πίσω παράθυρο
        dialog.setTitle("📈 Πρόβλεψη");
        
        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(30));
        root.getChildren().add(new Label("Εδώ θα μπει η λογική των προβλέψεων..."));
        
        dialog.setScene(new Scene(root, 300, 200));
        dialog.show();
    }

    private Button createMenuButton(String text) {
        table.setVisible(false);
        Button btn = new Button(text);
        btn.setMaxWidth(Double.MAX_VALUE);
        btn.setAlignment(Pos.BASELINE_LEFT);
        btn.setStyle("-fx-background-color: transparent; -fx-text-fill: #ecf0f1; -fx-font-size: 14; -fx-cursor: hand;");
        // Hover effect
        btn.setOnMouseEntered(e -> btn.setStyle("-fx-background-color: #34495e; -fx-text-fill: #ecf0f1; -fx-font-size: 14;"));
        btn.setOnMouseExited(e -> btn.setStyle("-fx-background-color: transparent; -fx-text-fill: #ecf0f1; -fx-font-size: 14;"));
        return btn;
    }

    private void initializeData() {
        // Μετατροπή του Object[][] data σε ObservableList
        // (Χρησιμοποιώ τα δεδομένα που μου έδωσες)
        masterData.add(new BudgetEntry("11", "Taxes", new BigDecimal("62055000000")));
        masterData.add(new BudgetEntry("111", "Taxes on Services", new BigDecimal("33667000000")));
        // ... πρόσθεσε και τα υπόλοιπα εδώ ...
    }

    public static void main(String[] args) {
        launch(args);
    }
}