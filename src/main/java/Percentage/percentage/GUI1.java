package Percentage.percentage;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import java.math.BigDecimal;
import java.util.Map;

public class GUI1 extends Application {
    protected TextField codeAField, codeBField;
    protected Label resultLabel;
    protected TextArea csvDisplayArea;
    protected AudioClip successSound; 
    protected AudioClip errorSound;   
    protected AudioClip hoverSound;   
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
        try { 
            this.amounts = loader.loadAmounts(); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        }
    }

    @Override
    public void start(Stage primaryStage) {
        // Τίτλος Παραθύρου
        primaryStage.setTitle("Greek Budget Analyzer 2025");

        csvDisplayArea = new TextArea();
        csvDisplayArea.setEditable(false);
        csvDisplayArea.setFont(javafx.scene.text.Font.font("Monospaced", 12));
        logic.setupContextMenu();

        // Ήχοι (παραμένουν οι ίδιοι)
        successSound = new AudioClip(getClass().getResource("/sounds/instant-win.wav").toExternalForm());
        errorSound = new AudioClip(getClass().getResource("/sounds/game-notification.wav").toExternalForm());
        hoverSound = new AudioClip(getClass().getResource("/sounds/game-notification.wav").toExternalForm());

        successSound.setVolume(0.6);
        errorSound.setVolume(0.4);
        hoverSound.setVolume(0.2);

        // Κουμπί Υπολογισμού
        Button calculateButton = new Button("Calculate Now");
        calculateButton.setStyle("-fx-background-color: #27ae60; -fx-text-fill: white; -fx-font-weight: bold; -fx-padding: 10 20;");
        calculateButton.setOnMouseEntered(e -> {
            hoverSound.stop(); 
            hoverSound.play();
        });

        // Ιστορικό
        historyItems = FXCollections.observableArrayList();
        ListView<String> historyListView = new ListView<>(historyItems);
        VBox historyBox = new VBox(5, new Label("Previous Calculations:"), historyListView);
        historyBox.setPrefWidth(280);
        historyBox.setPadding(new Insets(10));

        // Πεδία Εισαγωγής με Prompt Text (Αγγλικά)
        codeAField = new TextField(); 
        codeAField.setPromptText("e.g. 11101");
        
        codeBField = new TextField();
        codeBField.setPromptText("e.g. 11 (Total)");
        
        logic.setupKeyboardEvents();

        calculateButton.setOnAction(e -> logic.processCalculation());

        // Label Αποτελέσματος
        resultLabel = new Label("Waiting for data to process...");
        resultLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 13px; -fx-text-fill: #2c3e50;");
        resultLabel.setWrapText(true);
        resultLabel.setMaxWidth(550);
        resultLabel.setMinHeight(Region.USE_PREF_SIZE);

        GridPane inputGrid = new GridPane();
        inputGrid.setHgap(15); inputGrid.setVgap(10);
        inputGrid.setPadding(new Insets(20));
        inputGrid.add(new Label("Code A:"), 0, 0);
        inputGrid.add(codeAField, 1, 0);
        inputGrid.add(new Label("Code B:"), 0, 1);
        inputGrid.add(codeBField, 1, 1);
        inputGrid.add(calculateButton, 2, 1);
        
        inputGrid.add(resultLabel, 1, 2, 2, 1); 

        BorderPane root = new BorderPane();
        root.setCenter(csvDisplayArea);
        root.setRight(historyBox);
        root.setBottom(inputGrid);

        Scene scene = new Scene(root, 1050, 680);
        primaryStage.setScene(scene);
        primaryStage.show();

        logic.showInstructions();
        logic.loadCsvToDisplay();
    }
}
