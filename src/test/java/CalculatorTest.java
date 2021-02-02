import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void sum() {
        int expected = 15;
        int result = calculator.sum(10, 5);
        assertEquals(expected, result);


    }

    @Test
    public void minus() {
        int expected = 10;
        int result = calculator.minus(20, 10);
        assertEquals(expected, result);
    }

    @Test
    public void div() {
        Calculator calculator = new Calculator();
        double expected = 10;
        double result = calculator.div(50, 5);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void multip() {
        Calculator calculator = new Calculator();
        double expected = 100;
        double result = calculator.multi(10, 10);
        assertEquals(expected, result, 0.01);
    }

}