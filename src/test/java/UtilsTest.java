import org.junit.jupiter.api.Test;
import palindrome.Utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UtilsTest {

    private Utils utils = new Utils();

    @Test
    void reverseInput_test() {
        String input1 = "121";
        String input2 = "480";
        String input3 = "4&5";
        assertEquals(utils.reverseInput(input1), "121");
        assertEquals(utils.reverseInput(input2), "084");
        assertEquals(utils.reverseInput(input3), "5&4");
    }

    @Test
    void accumulate() {
        String input = "121";
        String reversedInput = utils.reverseInput(input);
        assertEquals("242", utils.accumulate(input, reversedInput));
    }
}