import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;

import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SplashScreenTest extends ApplicationTest {

    private GovProFx app;

     @Override
    public void start(Stage stage) {
    app = new GovProFx();
    app.start(stage, true); // skip splash for tests
    }

    @Test
    void testAmendDialogHasCommitButton() {
        interact(() -> app.showAmendDialog());
        Button commit = lookup("Commit Changes ✅").queryButton();
        assertNotNull(commit);
    }

    @Test
    void testMainUIButtonExists() {
        interact(() -> app.showMainApp(new Stage()));
        Button btnRead = lookup("View Budget Table").queryButton();
        assertNotNull(btnRead);
    }
}

