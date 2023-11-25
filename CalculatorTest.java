import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    static Calculator calculator = new Calculator();

    @Test
    public void testAddIntegers() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void testAddFloats() {
        assertEquals(4.0, calculator.add(2.0f, 2.0f), 0.001);
    }

    @Test
    public void testAddStrings() {
        assertEquals(4, calculator.add("2", "2"));
    }

    @Test
    public void testAddIntArray() {
        int[] arr = { 1, 2, 3 };
        assertEquals(6, calculator.add(arr));
    }

    @Test
    public void testAddStringArray() {
        String[] arr = { "1", "2", "3" };
        assertEquals(6, calculator.add(arr));
    }

    @Test
    public void testDivideFloats() {
        assertEquals(2.0, calculator.divide(4.0f, 2.0f), 0.001);
    }

    @Test
    public void testDivideStrings() {
        assertEquals(2.0, calculator.divide("4.0", "2.0"), 0.001);
    }

    @Test
    public void testDivideByZero() {
        assertEquals(0, calculator.divide("4.0", "0.0"), 0.001);
        // Note: This test assumes that the method should return 0 when dividing by zero
    }

    public static void main(String[] args) {

        System.out.println("Addition:");
        System.out.println("Integers: " + calculator.add(2, 3));
        System.out.println("Floats: " + calculator.add(2.5f, 3.5f));
        System.out.println("Strings: " + calculator.add("2", "3"));

        int[] intArray = { 1, 2, 3 };
        String[] stringArray = { "1", "2", "3" };

        System.out.println("Array of Integers: " + calculator.add(intArray));
        System.out.println("Array of Strings: " + calculator.add(stringArray));

        System.out.println("\nSubtraction:");
        System.out.println("Integers: " + calculator.minus(5, 3));
        System.out.println("Floats: " + calculator.minus(5.5f, 3.5f));
        System.out.println("Strings: " + calculator.minus("5", "3"));

        System.out.println("\nMultiplication:");
        System.out.println("Integers: " + calculator.multiply(2, 3));
        System.out.println("Floats: " + calculator.multiply(2.5f, 3.5f));
        System.out.println("Strings: " + calculator.multiply("2", "3"));

        System.out.println("\nDivision:");
        System.out.println("Floats: " + calculator.divide(6.0f, 3.0f));
        System.out.println("Strings: " + calculator.divide("6.0", "3.0"));

        System.out.println("\nHandling Division by Zero:");
        System.out.println("Divide by zero: " + calculator.divide("6.0", "0.0"));
    }
}
