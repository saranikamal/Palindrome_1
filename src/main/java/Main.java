import palindrome.FindPalindrome;
import palindrome.Utils;

/**
 * Palindrome_1 project is developed mostly using String class and utilising String class methods.
 */
public class Main {

    /**
     * Main method to run the application
     */
    public static void main(String[] args) {
        FindPalindrome findPalindrome = new FindPalindrome();
        Utils utils = new Utils();
        findPalindrome.countNumberOfCalculations(utils.getUserInput());
    }
}
