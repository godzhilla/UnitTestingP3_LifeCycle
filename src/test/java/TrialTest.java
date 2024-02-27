import org.example.Trial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrialTest {

    @Test
    void testTrialMethod() {
        Trial trial = new Trial();
        Assertions.assertNull(null);
        Assertions.assertNotNull("0");
        Assertions.assertEquals("book", "book");
        Assertions.assertSame("book", "book");
    }


}
