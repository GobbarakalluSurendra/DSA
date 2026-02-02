import java.util.*;
public class Solution {
    // Function to reverse digits of a number
    public int reverseNumber(int n) {
        // Variable to store reversed number
        int revNum = 0;

        // Loop until all digits are processed
        while (n > 0) {
            // Get the last digit
            int lastDigit = n % 10;

            // Append it to the reversed number
            revNum = revNum * 10 + lastDigit;

            // Remove the last digit from n
            n = n / 10;
        }

        // Return the reversed number
        return revNum;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int num = 12345;
        System.out.println(obj.reverseNumber(num));  // Output: 54321
    }
}
