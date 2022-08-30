import org.junit.jupiter.api.Test;
import palindrome.FindPalindrome;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FindPalindromeTest {

    private FindPalindrome findPalindrome = new FindPalindrome();

    @Test
    void isPalindrome_test() {
        assertTrue(findPalindrome.isPalindrome("121"));
        assertTrue(findPalindrome.isPalindrome("66666"));
        assertFalse(findPalindrome.isPalindrome("465"));
    }

    @Test
    void countNumberOfCalculations_hasPalindrome_test() {
        assertEquals(3, findPalindrome.countNumberOfCalculations("95"));
    }

    @Test
    void countNumberOfCalculations_doesNotHavePalindrome_test() {
        assertEquals(findPalindrome.countNumberOfCalculations("196"), 0);
        assertEquals(findPalindrome.countNumberOfCalculations("295"), 0);
        assertEquals(findPalindrome.countNumberOfCalculations("790"), 0);
    }
}