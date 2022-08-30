package palindrome;

public class FindPalindrome {

    private final long MAX = Long.MAX_VALUE;
    private Utils utils = new Utils();
    private int calculationCounter = 1;

    /**
     * A method to only check if any given input is palindrome or not. This method works with String class to
     * give more flexibility.
     * @param input
     * @return
     */
    public boolean isPalindrome(String input) {
        String reversedInput = utils.reverseInput(input);
        if (input.equals(reversedInput))
            return true;
        else return false;
    }

    /**
     * Method to find the first Palindrome after reverse-addition
     * and the number of calculation(s) done to achieve the Palindrome.
     * @param input
     * @return
     */
    public int countNumberOfCalculations(String input) {
        String reversedInput = utils.reverseInput(input);
        String sum = utils.accumulate(input, reversedInput);
        while (!isPalindrome(sum) && Long.parseLong(sum) < MAX) {
            try {
                sum = utils.accumulate(sum, utils.reverseInput(sum));
                calculationCounter++;
            } catch (NumberFormatException exception) {
                System.out.println("This number does not have palindrome(is Lychrel), " +
                        "or it is too large for final palindrome calculation!");
                return 0;
            }
        }
        System.out.println("Number " + sum + " is a palindrome, and it is achieved after " +
                calculationCounter + " calculation(s)");
        return calculationCounter;
    }
}