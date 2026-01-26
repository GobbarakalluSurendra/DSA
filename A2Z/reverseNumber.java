import java.util.*;

class Solution {

    public int reverse(int x) {

        int rev = 0;

        while (x != 0) {

            int digit = x % 10;
            x = x / 10;

            // Overflow check
            if (rev > Integer.MAX_VALUE / 10 ||
               (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 ||
               (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            rev = rev * 10 + digit;
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Create object
        Solution obj = new Solution();

        System.out.println("reverse of number is: " + obj.reverse(n));
    }
}
