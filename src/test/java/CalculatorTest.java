import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(1.11 ,2.22);
    }

    @Test
    public void canAdd(){
        assertEquals(3.33, calculator.add(), 0.01);
    }

    @Test
    public void canSubtract(){
        assertEquals(1.11, calculator.subtract(), 0.01);
    }

    @Test
    public void canMultiply(){
        assertEquals(2.46, calculator.multiply(), 0.01);
    }

    @Test
    public void canDivide(){
        assertEquals(2, calculator.divide(), 0.01);
    }
}
