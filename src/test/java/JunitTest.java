import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JunitTest {

    @Test
    void testSayHello() {
        Junit hello = new Junit();
        String result = hello.sayHello("GovPro");
        assertEquals("Hello, GovPro!" , result);
    }
    
}
