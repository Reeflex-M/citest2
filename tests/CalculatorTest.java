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

    @Test
    public void testMultiplication() {
        assertEquals(24, Calculator.mul(4, 6));
    }

    @Test
    public void testDivision() {
        assertEquals(2, Calculator.div(12, 6));
    }

    @Test
    public void testModulo() {
        assertEquals(0, Calculator.mod(12, 6));
    }

    @Test
    public void testPower() {
        assertEquals(1296, Calculator.pow(6, 4));
    }

    @Test
    public void testSquareRoot() {
        assertEquals(3, Calculator.sqrt(9));
    }

}
