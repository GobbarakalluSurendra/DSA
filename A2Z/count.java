class Solution {
    public int countDigits(int n) {

        int count = 0;

        // Special case: if number is 0
        if (n == 0) {
            return 1;
        }

        while (n > 0) {
            n = n / 10;   // remove last digit
            count++;     // increase count
        }

        return count;
    }
}
