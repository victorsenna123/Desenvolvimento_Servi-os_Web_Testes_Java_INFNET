import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.example.NumberUtils;

public class NumberUtilsTest {

    @Test
    public void testIsEven() {
        assertTrue(NumberUtils.isEven(4));  // 4 é par
        assertFalse(NumberUtils.isEven(5)); // 5 não é par
    }
}
