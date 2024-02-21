import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Daiva Gikariene
 */
class FizzBuzzTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(standardOut);
    }

    @Test
    public void changeList_fromAndToAreProvidedZero_returnZero() {

        FizzBuzz testFizzBuzz = new FizzBuzz();

        int testFrom = 0;
        int testTo = 0;

        testFizzBuzz.addCondition("Test", List.of(2, 3));
        testFizzBuzz.changeList(testFrom, testTo);
        testFizzBuzz.printChangedList();

        assertEquals("0", outputStreamCaptor.toString().trim());
    }

    @Test
    public void changeList_fromIsProvided105_returnFizzBuzzJazz() {

        FizzBuzz testFizzBuzz = new FizzBuzz();

        int testFrom = 105;
        int testTo = 105;

        testFizzBuzz.addCondition("FizzBuzzJazz", List.of(3, 5, 7));
        testFizzBuzz.changeList(testFrom, testTo);
        testFizzBuzz.printChangedList();

        assertEquals("FizzBuzzJazz", outputStreamCaptor.toString().trim());
    }

}