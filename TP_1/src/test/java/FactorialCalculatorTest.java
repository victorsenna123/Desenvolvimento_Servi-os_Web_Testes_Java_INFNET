import org.junit.jupiter.api.Test;
import org.example.FactorialCalculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// TP 4,5,6
public class FactorialCalculatorTest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.factorial(0)); // 0! = 1
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, FactorialCalculator.factorial(5)); // 5! = 120
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, FactorialCalculator.factorial(1)); // 1! = 1
    }

    // TP 6
    @Test
    public void testFactorialOfNegativeNumber() {
        // Verifica se o método lança a exceção ArithmeticException
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            FactorialCalculator.factorial(-5);
        });
        // Verifica a mensagem da exceção
        assertEquals("Fatorial não é definido para números negativos.", exception.getMessage());
    }
}
