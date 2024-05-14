package class_activity_5A;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void itShouldAddTwoNumber() {
        SimpleCalculator calculator = new SimpleCalculator();
        int actual = calculator.addTwoNumbers(2,2);
        assertEquals(4, actual);
    }
    @Test
    void itShouldPrintHelloWorld(){
        SimpleCalculator cal = new SimpleCalculator();

        String actual = cal.hello();
        String expected = "hello world";
        assertEquals(actual, expected);
    }
}