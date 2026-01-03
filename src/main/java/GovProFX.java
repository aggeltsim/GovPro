import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import Percentage.percentage.Runner;
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;



public class GovProFX extends Application {

    // Model class for TableView
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

    // Historical Data for Predictions
    static double[] years = {2021, 2022, 2023, 2024, 2025, 2026};
    static double[][] dapanes = { 
        {3766000, 4097337, 3811641, 4059900, 3974293, 4146883}, 
        {143500000, 134251607, 134030043, 140477275, 147343837, 156551972}, 
        {34251000, 40536272, 36372937, 37886945, 35723136, 38447884}, 
        {2986769000.0, 2973891093.0, 3172953535.0, 3245029336.0, 3282162880.0, 3487669947.0}, 
        {288237000, 246668455, 252308235, 357219091, 359936589, 404757288}, 
        {5495900000.0, 5937190083.0, 5103551488.0, 5362408267.0, 5252784805.0, 5916035799.0}, 
        {4256596000.0, 4276649036.0, 4651583743.0, 5278434922.0, 6150311996.0, 6568225405.0}, 
        {533261000, 531100091, 506425467, 547747086, 557774970, 569191096}, 
        {5605100000.0, 5363728191.0, 5436589608.0, 5733987212.0, 5660668349.0, 5665485468.0}, 
        {359100000, 383427915, 409992485, 350395832, 493075321, 546993897}, 
        {747475497000.0, 690153192000.0, 669349030000.0, 919467234000.0, 1068139883000.0, 1438513680000.0} 
    };

        
    @Override
    public void start(Stage primaryStage) {
        start(primaryStage, false); // default behavior: show splash
    }

    /**
     * Overloaded start method for tests.
     * @param primaryStage Stage to show
     * @param skipSplash if true, directly loads main UI (skipping fade/splash)
     */
    public void start(Stage primaryStage, boolean skipSplash) {
        if (skipSplash) {
            showMainApp(primaryStage);
            primaryStage.show();
            return;
        }

        // ----- Original splash screen code -----
        Image backgroundImg = new Image(getClass().getResourceAsStream("/images/GovProbackground.png"));
        BackgroundImage bg = new BackgroundImage(
                backgroundImg,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false)
        );
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/images/govpro_icon.png")));

        StackPane splashPane = new StackPane();
        splashPane.setBackground(new Background(bg));
        splashPane.setPadding(new Insets(20));

        Button startButton = new Button("Start Here ▶");
        startButton.setStyle("""
            -fx-background-color: #32809aff;
            -fx-text-fill: white;
            -fx-font-size: 18px;
            -fx-padding: 10 25 10 25;
            -fx-background-radius: 10;
        """);

        VBox splashContent = new VBox(20, startButton);
        splashContent.setAlignment(Pos.CENTER);
        splashContent.setTranslateY(200);
        splashPane.getChildren().add(splashContent);

        Scene splashScene = new Scene(splashPane, 1100, 650);

        primaryStage.setTitle("🏛️ GovPro Budget System 2025");
        primaryStage.setScene(splashScene);
        primaryStage.show();

        startButton.setOnAction(e -> {
            FadeTransition fade = new FadeTransition(Duration.seconds(1.2), splashPane);
            fade.setFromValue(1.0);
            fade.setToValue(0.0);
            fade.setInterpolator(Interpolator.EASE_BOTH);
            fade.setOnFinished(ev -> showMainApp(primaryStage));
            fade.play();
        });
    }

    protected void showMainApp(Stage primaryStage) {
    initializeData();

    primaryStage.setTitle("🏛️ GovPro Budget System 2025");

    VBox menuBox = new VBox(15);
    menuBox.setPadding(new Insets(20));
    menuBox.setStyle("-fx-background-color: #2c3e50;");
    menuBox.setPrefWidth(260);

    Label menuTitle = new Label("MANAGEMENT");
    menuTitle.setStyle("-fx-text-fill: white; -fx-font-weight: bold; -fx-font-size: 16;");

    Button btnRead = createMenuButton("View Budget Table");
    Button btnAmend = createMenuButton("Make Changes");
    Button btnPredict = createMenuButton("Forecasting Engine");
    Button btnStats = createMenuButton("Statistics Dashboard");
    Button btnPercent = createMenuButton("Percentage Calculator");// Μέσα στη μέθοδο showMainApp του GovProFX.java

    menuBox.getChildren().addAll(menuTitle, btnRead, btnAmend, btnPredict, btnStats, btnPercent);

    setupTable();
    StackPane contentArea = new StackPane(table);
    contentArea.setPadding(new Insets(20));

    btnRead.setOnAction(e -> table.setVisible(true));
    btnAmend.setOnAction(e -> showAmendDialog());
    btnPredict.setOnAction(e -> showPredictDialog());
    btnStats.setOnAction(e -> showStatistics());
    btnPercent.setOnAction(e -> { new Thread(() -> {
        try {
            Percentage.percentage.Runner.main(new String[0]);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }).start();
});

    BorderPane root = new BorderPane();
    root.setLeft(menuBox);
    root.setCenter(contentArea);

    Scene mainScene = new Scene(root, 1100, 650);
    primaryStage.setScene(mainScene);
}


    private void setupTable() {
        TableColumn<BudgetEntry, String> codeCol = new TableColumn<>("Code");
        codeCol.setCellValueFactory(new PropertyValueFactory<>("code"));
        codeCol.setPrefWidth(100);

        TableColumn<BudgetEntry, String> nameCol = new TableColumn<>("Description");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        nameCol.setPrefWidth(450);

        TableColumn<BudgetEntry, BigDecimal> amountCol = new TableColumn<>("Amount (€)");
        amountCol.setCellValueFactory(new PropertyValueFactory<>("amount"));
        amountCol.setPrefWidth(250);

        amountCol.setCellFactory(tc -> new TableCell<>() {
            @Override
            protected void updateItem(BigDecimal amount, boolean empty) {
                super.updateItem(amount, empty);
                if (empty || amount == null) {
                    setText(null);
                    setStyle("");
                } else {
                    NumberFormat nf = NumberFormat.getInstance(Locale.GERMANY);
                    setText(nf.format(amount));
                    setStyle("-fx-alignment: CENTER-RIGHT; -fx-padding: 0 10 0 0;");
                }
            }
        });

        table.setRowFactory(tv -> new TableRow<BudgetEntry>() {
            @Override
            protected void updateItem(BudgetEntry item, boolean empty) {
                super.updateItem(item, empty);
                if (item == null || empty) {
                    setStyle("");
                } else if ("SECTION".equals(item.getCode())) {
                   setStyle("-fx-background-color: #f3f5f5ff; -fx-font-weight: bold;");
                    this.setTextFill(Color.WHITE);
                } else {
                    try {
                        int codeInt = Integer.parseInt(item.getCode());
                        if (codeInt >= 11 && codeInt <= 571) {
                            setStyle("-fx-background-color: #e8f5e9;"); // Incomes
                        } else if (codeInt >= 1001) {
                            setStyle("-fx-background-color: #e3f2fd;"); // Entities
                        } else {
                            setStyle("-fx-background-color: #ffebee;"); // Expenses
                        }
                    } catch (NumberFormatException ex) {
                        setStyle(""); 
                    }
                }
            }
        });

        table.getColumns().clear();
        table.getColumns().addAll(codeCol, nameCol, amountCol);
        table.setItems(masterData);
        table.setPlaceholder(new Label("No data loaded."));
    }

    protected void showAmendDialog() {
        Stage dialog = new Stage();
        dialog.initModality(Modality.NONE);
        dialog.setTitle("🔧 Amend Budget Entry");

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        ComboBox<String> combo = new ComboBox<>();
        masterData.forEach(entry -> {
            if (!"SECTION".equals(entry.getCode()))
                combo.getItems().add(entry.getCode() + " - " + entry.getName());
        });
        combo.setMaxWidth(Double.MAX_VALUE);
        
        TextField txtNewValue = new TextField();
        txtNewValue.setPromptText("Enter new amount...");

        Button btnSave = new Button("Commit Changes ✅");
        btnSave.setMaxWidth(Double.MAX_VALUE);
        btnSave.setOnAction(e -> {
            int idx = combo.getSelectionModel().getSelectedIndex();
            if (idx >= 0) {
                try {
                    BigDecimal val = new BigDecimal(txtNewValue.getText().replace(",", "."));
                    // Προσοχή: Εδώ βρίσκουμε το σωστό αντικείμενο βάσει του κωδικού
                    String selectedCode = combo.getValue().split(" - ")[0];
                    masterData.stream()
                        .filter(ent -> ent.getCode().equals(selectedCode))
                        .findFirst()
                        .ifPresent(ent -> ent.setAmount(val));
                    
                    table.refresh();
                    dialog.close();
                } catch (Exception ex) {
                    txtNewValue.setStyle("-fx-border-color: red;");
                }
            }
        });

        layout.getChildren().addAll(new Label("Select Account:"), combo, new Label("New Amount:"), txtNewValue, btnSave);
        dialog.setScene(new Scene(layout, 400, 250));
        dialog.show();
    }

        private void showPredictDialog() {
    Stage dialog = new Stage();
    dialog.initModality(Modality.NONE);
    dialog.setTitle("📈 Budget Forecasting System");
    Prediction p = new Prediction();    
    // --- Δεδομένα ---
    double[][] dapanes = {
        {3766000, 4097337, 3811641, 4059900, 3974293, 4146883},
        {143500000, 134251607, 134030043, 140477275, 147343837, 156551972},
        {34251000, 40536272, 36372937, 37886945, 35723136, 38447884},
        {2986769000L, 2973891093L, 3172953535L, 3245029336L, 3282162880L, 3487669947L},
        {288237000, 246668455, 252308235, 357219091, 359936589, 404757288},
        {5495900000L, 5937190083L, 5103551488L, 5362408267L, 5252784805L, 5916035799L},
        {4256596000L, 4276649036L, 4651583743L, 5278434922L, 6150311996L, 6568225405L},
        {533261000, 531100091, 506425467, 547747086, 557774970, 569191096},
        {5605100000L, 5363728191L, 5436589608L, 5733987212L, 5660668349L, 5665485468L},
        {359100000, 383427915, 409992485, 350395832, 493075321, 546993897},
        {747475497000L, 690153192000L, 669349030000L, 919467234000L, 1068139883000L, 1438513680000L}
    };
    double[] years = {2021, 2022, 2023, 2024, 2025, 2026};
    String[] entities = {
        "Presidency of the Republic", "Hellenic Parliament", "Presidency of Governance",
        "Ministry of Interior", "Ministry of Exterior", "Ministry of Defence",
        "Ministry of Health", "Ministry of Justice", "Ministry of Education",
        "Ministry of Sport", "Ministry of Finance"
    };

    // --- Κεντρική Διάταξη ---
    VBox root = new VBox(20);
    root.setPadding(new Insets(25));
    root.setStyle("-fx-background-color: linear-gradient(to bottom right, #ffffff, #e6e9f0);");
    root.setPrefWidth(600);

    Label headerLabel = new Label("Financial Analytics & Prediction");
    headerLabel.setStyle("-fx-font-size: 22px; -fx-font-weight: bold; -fx-text-fill: #2c3e50;");
    Separator separator = new Separator();

    // --- Επιλογή τύπου πρόβλεψης ---
    ComboBox<String> modeBox = new ComboBox<>();
    modeBox.getItems().addAll("📊 Predict Value for Given Year", "🕒 Predict When Value Will Be Reached");
    modeBox.setPromptText("Select Prediction Type");

    // --- Επιλογή Υπουργείου ---
    ComboBox<String> comboEntity = new ComboBox<>(FXCollections.observableArrayList(entities));
    comboEntity.setPromptText("Select Ministry/Entity");

    // --- Πεδία εισαγωγής ---
    TextField txtYear = new TextField();
    txtYear.setPromptText("Enter Target Year (e.g. 2028)");

    TextField txtDesiredValue = new TextField();
    txtDesiredValue.setPromptText("Enter Desired Value (€)");

    // --- Περιοχή αποτελεσμάτων ---
    Label lblResults = new Label("Results:");
    lblResults.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
    TextArea resultArea = new TextArea();
    resultArea.setEditable(false);
    resultArea.setPrefHeight(200);

    // --- Κουμπιά ---
    Button btnRun = new Button("Run Prediction");
    Button btnClear = new Button("Clear Results");
    HBox actionButtons = new HBox(10, btnRun, btnClear);
    actionButtons.setAlignment(Pos.CENTER);

    // --- Containers ---
    VBox dynamicFields = new VBox(10);
    dynamicFields.setAlignment(Pos.CENTER_LEFT);

    // αλλάζει δυναμικά τι εμφανίζεται ανάλογα με το mode
    modeBox.setOnAction(e -> {
        dynamicFields.getChildren().clear();
        if (modeBox.getValue().contains("Value for Given Year")) {
            dynamicFields.getChildren().addAll(new Label("Target Year:"), txtYear);
        } else {
            dynamicFields.getChildren().addAll(new Label("Desired Value (€):"), txtDesiredValue);
        }
    });

    // --- Λογική κουμπιών ---
    btnRun.setOnAction(e -> {
        int idx = comboEntity.getSelectionModel().getSelectedIndex();
        if (idx < 0 || modeBox.getValue() == null) {
            resultArea.appendText("Please select a prediction type and an entity.\n");
            return;
        }

        if (modeBox.getValue().contains("Value for Given Year")) {
            try {
                int year = Integer.parseInt(txtYear.getText());
                double predicted = p.getValueForGivenYear(years, dapanes[idx], year);
                resultArea.appendText(String.format(
                    "📊 [%s]\nPredicted spending for %d: €%,.2f\n\n",
                    entities[idx], year, predicted));
            } catch (NumberFormatException ex) {
                resultArea.appendText("Invalid year input.Try giving a year (e.g. 2045).\n");
            }
        } else {
            try {
                double value = Double.parseDouble(txtDesiredValue.getText());
                String est = p.getYearandMonthforGivenValue(years, dapanes[idx], value);
                resultArea.appendText(String.format(
                    "🕒 [%s]\nEstimated time when spending reaches €%,.2f: %s\n\n",
                    entities[idx], value, est));
            } catch (NumberFormatException ex) {
                resultArea.appendText("Invalid value input.Try giving a number (e.g. 4566778.54).\n");
            }
        }
    });

    btnClear.setOnAction(e -> resultArea.clear());

    // --- Συναρμολόγηση ---
    VBox formBox = new VBox(15,
            new Label("Prediction Type:"), modeBox,
            new Label("Select Entity:"), comboEntity,
            dynamicFields,
            lblResults, resultArea,
            actionButtons);
    formBox.setAlignment(Pos.CENTER_LEFT);

    root.getChildren().addAll(headerLabel, separator, formBox);

    Scene scene = new Scene(root);
    dialog.setScene(scene);
    dialog.show();
    }
    
    //For Statistics
    private void showStatistics() {
    Stage statsStage = new Stage();
    statsStage.initModality(Modality.NONE);
    statsStage.setTitle("📊 Budget Statistics");

    VBox root = new VBox(15);
    root.setPadding(new Insets(20));
    root.setStyle("-fx-background-color: linear-gradient(to bottom right, #ffffff, #e6e9f0);");

    Label header = new Label("Government Budget Statistics");
    header.setStyle("-fx-font-size: 22px; -fx-font-weight: bold; -fx-text-fill: #2c3e50;");
    root.getChildren().add(header);

    // --- Επιλογή Έτους ---
    HBox yearBox = new HBox(10);
    yearBox.setAlignment(Pos.CENTER_LEFT);
    Label yearLabel = new Label("Select Year:");
    ComboBox<Integer> yearCombo = new ComboBox<>();
    yearCombo.getItems().addAll(2022, 2023, 2024);
    yearCombo.getSelectionModel().selectFirst();
    yearBox.getChildren().addAll(yearLabel, yearCombo);
    root.getChildren().add(yearBox);

    // --- Επιλογή Τύπου ---
    HBox typeBox = new HBox(10);
    typeBox.setAlignment(Pos.CENTER_LEFT);
    Label typeLabel = new Label("Select Type:");
    ComboBox<String> typeCombo = new ComboBox<>();
    typeCombo.getItems().addAll("Income", "Expense");
    typeCombo.getSelectionModel().selectFirst();
    typeBox.getChildren().addAll(typeLabel, typeCombo);
    root.getChildren().add(typeBox);

    // --- Περιοχή αποτελεσμάτων με Scroll ---
    ScrollPane scrollPane = new ScrollPane();
    scrollPane.setFitToWidth(true);
    scrollPane.setPrefHeight(400);

    VBox outputBox = new VBox(5);
    outputBox.setPadding(new Insets(10));
    scrollPane.setContent(outputBox);
    root.getChildren().add(scrollPane);

    // --- Κουμπιά ---
    HBox buttons = new HBox(10);
    buttons.setAlignment(Pos.CENTER);
    Button btnShow = new Button("Show");
    Button btnClear = new Button("Clear");
    buttons.getChildren().addAll(btnShow, btnClear);
    root.getChildren().add(buttons);

    // --- Λογική κουμπιών ---
    btnShow.setOnAction(e -> {
        outputBox.getChildren().clear();

        int year = yearCombo.getValue();
        BudgetDataManager.BudgetType type = typeCombo.getValue().equals("Income") ?
                BudgetDataManager.BudgetType.INCOME : BudgetDataManager.BudgetType.EXPENSE;

        BigDecimal[] data = BudgetDataManager.getBudgetData(year, type);
        if (data == null) {
            outputBox.getChildren().add(new Label("No data for year " + year));
            return;
        }

        String[] categories = type == BudgetDataManager.BudgetType.INCOME ?
                new String[]{"Taxes", "Social Contributions", "Transfers", "Sales of goods and services",
                        "Other Current Income", "Fixed Assets", "Debt Securities", "Equity Securities",
                        "Currency Liabilities", "Debt Securities (Liabilities)", "Loans", "Financial Derivatives"} :
                new String[]{"Employee Benefits", "Social Benefits", "Transfers", "Purchases of goods and services",
                        "Subsidies", "Interest", "Other expenses", "Credits under distribution", "Fixed Assets",
                        "Valuables", "Loans", "Equity Securities", "Debt Securities", "Loans", "Financial Derivatives"};

        for (int i = 0; i < data.length; i++) {
            String name = (i < categories.length) ? categories[i] : "Category " + (i + 1);
            BigDecimal percent = data[i].multiply(new BigDecimal("100")).setScale(2, RoundingMode.HALF_UP);

            Label line = new Label(String.format("%-40s : %6s%%", name, percent));
            line.setStyle("-fx-font-family: Arial; -fx-font-size: 14;");
            outputBox.getChildren().add(line);
        }
    });

    btnClear.setOnAction(e -> outputBox.getChildren().clear());

    Scene scene = new Scene(root, 650, 600);
    statsStage.setScene(scene);
    statsStage.show();
}



    private Button createMenuButton(String text) {
        Button btn = new Button(text);
        btn.setMaxWidth(Double.MAX_VALUE);
        btn.setAlignment(Pos.BASELINE_LEFT);
        btn.setStyle("-fx-background-color: transparent; -fx-text-fill: #ecf0f1; -fx-font-size: 14; -fx-cursor: hand;");
        btn.setOnMouseEntered(e -> btn.setStyle("-fx-background-color: #34495e; -fx-text-fill: #ecf0f1; -fx-font-size: 14;"));
        btn.setOnMouseExited(e -> btn.setStyle("-fx-background-color: transparent; -fx-text-fill: #ecf0f1; -fx-font-size: 14;"));
        return btn;
    }

    private void initializeData() {
        masterData.add(new BudgetEntry("SECTION", "REVENUE & INCOMES", null));
        Object[][] rawIncomes = {
            {"11", "Taxes", new BigDecimal("62055000000")}, // 1
        {"111", "Taxes on Services and Products", new BigDecimal("33667000000")},
        {"112", "Taxes and Duties on Imports", new BigDecimal("362000000")},
        {"113", "Regular Property Taxes", new BigDecimal("2353000000")},
        {"114", "Other Production Taxes", new BigDecimal("355000000")},
        {"115", "Income Tax", new BigDecimal("23719000000")},
        {"116", "Capital Taxes", new BigDecimal("232000000")},
        {"119", "Other Current Taxes", new BigDecimal("1367000000")},
        {"12", "Social Contributions", new BigDecimal("60000000")},
        {"122", "Other Social Contributions", new BigDecimal("60000000")},
        {"13", "Transfers", new BigDecimal("8131000000")},
        {"131", "Current Domestic Transfers", new BigDecimal("322000000")},
        {"132", "Current Transfers from Organizations and Member States", 
        new BigDecimal("15000000")},
        {"133", "Current Transfers from Foreign Entities", new BigDecimal("8000000")},
        {"134", "Domestic Investment Grants", new BigDecimal("35000000")},
        {"135", "Investment Grants from the EU", new BigDecimal("7645000000")},
        {"139", "Other Capital Transfers", new BigDecimal("106000000")},
        {"14", "Sales of Goods and Services", new BigDecimal("2405000000")},
        {"141", "Goods Sales", new BigDecimal("2000000")},
        {"142", "Provision of Services", new BigDecimal("338000000")},
        {"143", "Rents", new BigDecimal("1418000000")},
        {"144", "Supplies", new BigDecimal("445000000")},
        {"145", "Administrative Fees", new BigDecimal("199000000")},
        {"149", "Other Sales", new BigDecimal("3000000")},
        {"15", "Other Current Income", new BigDecimal("2775000000")},
        {"151", "Interest Income", new BigDecimal("588000000")},
        {"152", "Distributed Corporate Income", new BigDecimal("356000000")},
        {"153", "Natural Resource Rents", new BigDecimal("75000000")},
        {"156", "Fines, Penalties and Assessments", new BigDecimal("1102000000")},
        {"159", "Expense Reimbursements", new BigDecimal("654000000")},
        {"31", "Fixed Assets", new BigDecimal("37000000")},
        {"311", "Buildings and Related Infrastructure", new BigDecimal("37000000")},
        {"43", "Debt Securities", new BigDecimal("11000000")},
        {"432", "Long-term Debt Securities", new BigDecimal("11000000")},
        {"44", "Loans", new BigDecimal("20000000")},
        {"442", "Long-term Loans", new BigDecimal("20000000")},
        {"45", "Equity and Investment Fund Shares", new BigDecimal("467000000")},
        {"451", "Listed Shares", new BigDecimal("239000000")},
        {"452", "Unlisted Shares", new BigDecimal("228000000")},
        {"52", "Currency and Deposit Liabilities", new BigDecimal("66000000")},
        {"521", "Currency in Circulation Liabilities", new BigDecimal("66000000")},
        {"53", "Debt Securities (Liabilities)", new BigDecimal("25973000000")},
        {"531", "Short-term Debt Securities", new BigDecimal("17000000000")},
        {"532", "Long-term Debt Securities", new BigDecimal("8973000000")},
        {"54", "Loans", new BigDecimal("1202027000000")},
        {"541", "Short-term Loans", new BigDecimal("1200000000000")},
        {"542", "Long-term Loans", new BigDecimal("2027000000")},
        {"57", "Financial Derivatives", new BigDecimal("800000000")},
        {"571", "Financial Derivatives", new BigDecimal("800000000")}
        };
        addRows(rawIncomes);

        masterData.add(new BudgetEntry("SECTION", "PUBLIC EXPENDITURES", null));
        Object[][] rawExpenses = {
        {"21", "Employee Benefits", new BigDecimal("14889199000")}, // 1
        {"22", "Social Benefits", new BigDecimal("425136000")},
        {"23", "Transfers", new BigDecimal("34741365000")},
        {"24", "Purchases of Goods and Services", new BigDecimal("2039542000")},
        {"25", "Subsidies", new BigDecimal("80630000")},
        {"26", "Interest", new BigDecimal("7701101000")},
        {"27", "Other Expenses", new BigDecimal("101553000")},
        {"29", "Credits Under Allocation", new BigDecimal("17283053000")},
        {"31", "Fixed Assets", new BigDecimal("2609600000")},
        {"33", "Valuables", new BigDecimal("85000")},
        {"44", "Short-Term Loans", new BigDecimal("3741000000")},
        {"45", "Equity and Investment Fund Shares", new BigDecimal("1755112000")},
        {"53", "Debt Securities (Liabilities)", new BigDecimal("19375000000")},
        {"54", "Long-Term Loans", new BigDecimal("1203165130000")}
        };
        addRows(rawExpenses);

        masterData.add(new BudgetEntry("SECTION", "GOVERNMENT ENTITIES", null));
        Object[][] rawEntities = {
        {"1001", "Presidency of the Republic", new BigDecimal("4638000")}, //1
        {"1003", "Hellenic Parliament", new BigDecimal("171950000")},
        {"1004", "Presidency of the Government", new BigDecimal("41689000")},
        {"1007", "Ministry of Interior", new BigDecimal("3830276000")},
        {"1009", "Ministry of Foreign Affairs", new BigDecimal("420237000")},
        {"1011", "Ministry of National Defense", new BigDecimal("6130000000")},
        {"1015", "Ministry of Health", new BigDecimal("7177424000")},
        {"1017", "Ministry of Justice", new BigDecimal("650803000")},
        {"1020", "Ministry of Education, Religious Affairs", new BigDecimal("6606000000")},
        {"1022", "Ministry of Culture", new BigDecimal("575419000")},
        {"1024", "Ministry of National Economy", new BigDecimal("1246518464000")},
        {"1029", "Ministry of Rural Development and Food", new BigDecimal("1281403000")},
        {"1031", "Ministry of Environment and Energy", new BigDecimal("2341227000")},
        {"1032", "Ministry of Labor and Social Security", new BigDecimal("18678084000")},
        {"1034", "Ministry of Social Cohesion", new BigDecimal("3989553000")},
        {"1036", "Ministry of Development", new BigDecimal("818045000")},
        {"1039", "Ministry of Infrastructure and Transport", new BigDecimal("2694810000")},
        {"1041", "Ministry of Shipping and Island Policy", new BigDecimal("651864000")},
        {"1045", "Ministry of Tourism", new BigDecimal("189293000")},
        {"1053", "Ministry of Digital Governance", new BigDecimal("1073928000")},
        {"1055", "Ministry of Migration and Asylum", new BigDecimal("475871000")},
        {"1057", "Ministry of Citizen Protection", new BigDecimal("2285820000")},
        {"1060", "Ministry of Climate Crisis and Civil Protection", new BigDecimal("1221116000")},
        {"1901", "Decentralized Administration of Attica", new BigDecimal("13091000")},
        {"1902", "Decentralized Administration of Thessaly-Central Greece", 
        new BigDecimal("10579000")},
        {"1903", "Decentralized Administration of Epirus-Western Greece", 
        new BigDecimal("9943000")},
        {"1904", "Decentralized Administration of Peloponnese", new BigDecimal("14918000")},
        {"1905", "Decentralized Administration of the Aegean", new BigDecimal("6188000")},
        {"1906", "Decentralized Administration of Crete", new BigDecimal("6497000")},
        {"1907", "Decentralized Administration of Macedonia - Thrace", new BigDecimal("18376000")}
        };
        addRows(rawEntities);
    }

    private void addRows(Object[][] rows) {
        for (Object[] row : rows) {
            masterData.add(new BudgetEntry(row[0].toString(), row[1].toString(), (BigDecimal) row[2]));
        }
    }
    public ObservableList<BudgetEntry> getMasterData() {
        return masterData;
    }

    public static void main(String[] args) {
        launch(args);
    }
}