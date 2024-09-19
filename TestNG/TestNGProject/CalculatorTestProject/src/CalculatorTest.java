import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;


public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }

    // Positive Tests
    @Test(groups = "positive")
    public void testSumPositive() {
        long result = calculator.sum(10L, 5L);
        Assert.assertEquals(result, 15L, "Sum result is incorrect.");
    }

    @Test(groups = "positive")
    public void testSubPositive() {
        long result = calculator.sub(10L, 5L);
        Assert.assertEquals(result, 5L, "Subtraction result is incorrect.");
    }

    @Test(groups = "positive")
    public void testMultPositive() {
        long result = calculator.mult(10L, 5L);
        Assert.assertEquals(result, 50L, "Multiplication result is incorrect.");
    }

    @Test(groups = "positive")
    public void testDivPositive() {
        long result = calculator.div(10L, 5L);
        Assert.assertEquals(result, 2L, "Division result is incorrect.");
    }

    @Test(groups = "positive")
    public void testSqrtPositive() {
        double result = calculator.sqrt(16.0);
        Assert.assertEquals(result, 4.0, "Square root result is incorrect.");
    }

    // Negative Tests
    @Test(groups = "negative", expectedExceptions = NumberFormatException.class)
    public void testDivByZero() {
        calculator.div(10L, 0L);
    }

    @Test(groups = "negative")
    public void testSubNegative() {
        long result = calculator.sub(5L, 10L);
        Assert.assertEquals(result, -5L, "Negative subtraction result is incorrect.");
    }

    @Test(groups = "negative")
    public void testMultNegative() {
        long result = calculator.mult(-10L, 5L);
        Assert.assertEquals(result, -50L, "Multiplication with negative number result is incorrect.");
    }

    @Test(groups = "negative")
    public void testSqrtNegative() {
        double result = calculator.sqrt(-16.0);
        Assert.assertEquals(result, Double.NaN, "Square root of negative number result is incorrect.");
    }

    @Test(groups = "negative")
    public void testIsPositiveNegative() {
        boolean result = calculator.isPositive(-5L);
        Assert.assertFalse(result, "IsPositive check for negative number failed.");
    }

    @DataProvider(name = "sumDataProvider")
    public Object[][] sumDataProvider() {
        return new Object[][] {
            {10L, 5L, 15L},
            {20L, 30L, 50L},
            {0L, 0L, 0L}
        };
    }

    @Test(dataProvider = "sumDataProvider", groups = "positive")
    public void testSumParameterized(long a, long b, long expected) {
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expected, "Sum with DataProvider result is incorrect.");
    }
}
