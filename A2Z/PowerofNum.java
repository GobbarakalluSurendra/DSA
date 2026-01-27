class Solution {
    public int reverseExponentiation(int n) {
        int original = n;
        int rev = 0;

        // Reverse the number
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }

        // Calculate original ^ reverse
        int result = 1;
        for (int i = 1; i <= rev; i++) {
            result *= original;
        }

        return result;
    }
}
