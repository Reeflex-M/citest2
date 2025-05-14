import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAddition() {
        assertEquals(10, Calculator.add(4, 6));
    }

    @Test
    public void testSubtraction() {
        assertEquals(6, Calculator.sub(12, 6));
    }
}

