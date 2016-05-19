import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by nurudeenlawal on 5/19/16.
 */
public class CalculatorSpec {
    public double delta = 1e-15;

    @Test
    public void addTest() {
        Calculator calculator = new Calculator();
        double expectedSum = 4;
        double actualSum = calculator.add(2.0, 2.0);
        assertEquals("The expected value should be 2", expectedSum, actualSum, delta);
    }

    @Test
    public void subTest() {
        Calculator calculator = new Calculator();
        double expectedDif = 0;
        double actualDif = calculator.subtract(2, 2);
        assertEquals("The expected value is 0", expectedDif, actualDif, delta);
    }

    @Test
    public void multiTest() {
        Calculator calculator = new Calculator();
        double expectedProd = 8;
        double actualProd = calculator.multiply(2, 4);
        assertEquals("The expected value is 8", expectedProd, actualProd, delta);
    }

  /*  @Test(expected = DivisionByZeroException.class)
    public void divTest() {
        Calculator calculator = new Calculator();
        double expectedDiv = 3;
        try {
            double actualDiv = calculator.divide(6, 2);
        }catch (DivisionByZeroException);

        assertEquals("The expected value is 3", expectedDiv, actualDiv, delta);
    }*/
}
