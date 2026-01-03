package Percentage.percentage;
import javafx.application.Application;

public class Runner {
    public static void main(String[] args) {
    javafx.application.Platform.runLater(() -> {
        try {
            GUI1 gui = new GUI1();
            gui.init();
            gui.start(new javafx.stage.Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }
      });
    }
}