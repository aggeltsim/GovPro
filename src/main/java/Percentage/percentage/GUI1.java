package Percentage.percentage;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.math.BigDecimal;
import java.util.Map;

public class GUI1 extends Application {
    protected TextField codeAField, codeBField;
    protected TextArea csvDisplayArea;
    protected Label resultLabel;
    protected Loader loader;
    protected Calculator calculator;
    protected Map<String, BigDecimal> amounts;
    protected ObservableList<String> historyItems;
    protected GUI2 logic;

    @Override
    public void init() {
        this.loader = new Loader();
        this.calculator = new Calculator();
        this.logic = new GUI2(this);
        try { this.amounts = loader.loadAmounts(); } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Αναλυτής Ελληνικού Προϋπολογισμού 2025");

        csvDisplayArea = new TextArea();
        csvDisplayArea.setEditable(false);
        logic.setupContextMenu();

        historyItems = FXCollections.observableArrayList();
        ListView<String> historyListView = new ListView<>(historyItems);
        VBox historyBox = new VBox(5, new Label("Προηγούμενοι Υπολογισμοί:"), historyListView);
        historyBox.setPrefWidth(280);
        historyBox.setPadding(new Insets(10));

        codeAField = new TextField(); 
        codeBField = new TextField();
        logic.setupKeyboardEvents();

        Button calculateButton = new Button("Υπολογισμός Τώρα");
        calculateButton.setStyle("-fx-background-color: #27ae60; -fx-text-fill: white; -fx-font-weight: bold; -fx-padding: 10 20;");
        calculateButton.setOnAction(e -> logic.processCalculation());

        resultLabel = new Label("Περιμένω δεδομένα...");
        resultLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 14px; -fx-text-fill: #2c3e50;");

        GridPane inputGrid = new GridPane();
        inputGrid.setHgap(15); inputGrid.setVgap(10);
        inputGrid.setPadding(new Insets(20));
        inputGrid.add(new Label("Τι θέλετε να εξετάσετε (Α):"), 0, 0);
        inputGrid.add(codeAField, 1, 0);
        inputGrid.add(new Label("Με τι το συγκρίνετε (Β):"), 0, 1);
        inputGrid.add(codeBField, 1, 1);
        inputGrid.add(calculateButton, 2, 1);
        inputGrid.add(resultLabel, 1, 2);

        BorderPane root = new BorderPane();
        root.setCenter(csvDisplayArea);
        root.setRight(historyBox);
        root.setBottom(inputGrid);

        Scene scene = new Scene(root, 1050, 680);
        primaryStage.setScene(scene);
        primaryStage.show();

        logic.showVividInstructions();
        logic.loadCsvToDisplay();
    }
}