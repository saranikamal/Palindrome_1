package palindrome;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Scanner;
import java.util.Stack;

public class Utils {

    private final long MAX = Long.MAX_VALUE;

    /**
     * Method to get a positive integer number from user
     * @return user input
     */
    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("Please enter a positive integer number: ");
            try {
                input = scanner.nextLine();
                if (NumberUtils.isDigits(input) && input.charAt(0) != '-'
                        && NumberUtils.isDigits(input) && Long.parseLong(input) < MAX)
                    break;
            } catch (NumberFormatException exception) {
                System.out.println("Number was too big for calculation, please try again.");
            }
        }
        return input;
    }

    /**
     * Method to reverse user input using Stack data structure. This way of reversing user input is not
     * mathematical, so can be also be used if we decide to reverse a non-numeric input later in our project, i.e.
     * making project to be more open to extension and more closed to modification.
     * @param input
     * @return reversed user input
     */
    public String reverseInput(String input) {
        Stack<Character> stack = new Stack();
        String reversedInput = "";
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        while (!stack.empty()) {
            reversedInput += stack.pop();
        }
        return reversedInput;
    }

    /**
     * Method to calculate the accumulation of user input and its reversed value
     * @param input
     * @param reversedInput
     * @return accumulation of user input and the reversed user input
     */
    public String accumulate(String input, String reversedInput) {
        long originalNumber = Long.parseLong(input);
        long reversedNumber = Long.parseLong(reversedInput);
        return String.valueOf(originalNumber + reversedNumber);
    }
}
