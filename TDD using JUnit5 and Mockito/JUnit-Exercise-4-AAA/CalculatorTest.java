import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    // Setup method - runs before each test
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator object created.");
    }

    // Teardown method - runs after each test
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown: Calculator object destroyed.");
    }

    @Test
    public void testAddition() {

        //ARRAnge
        int num1 = 10;
        int num2 = 5;

        // Act
        int result = calculator.add(num1, num2);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {

        // Arrange
        int num1 = 10;
        int num2 = 5;

        // Act
        int result = calculator.subtract(num1, num2);

        // Assert
        assertEquals(5, result);
    }
}
