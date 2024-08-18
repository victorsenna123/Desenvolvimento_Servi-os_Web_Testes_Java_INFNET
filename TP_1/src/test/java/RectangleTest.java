import org.example.Rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// TP 7 E 8

public class RectangleTest {

    @Test
    public void testGetArea() {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        assertEquals(50.0, rectangle.getArea(), 0.001);
    }

    @Test
    public void testGetPerimeter() {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        assertEquals(30.0, rectangle.getPerimeter(), 0.001); // 2 * (5 + 10) = 30
    }
}
