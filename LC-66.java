class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Loop from last digit to first
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // Done, no carry needed
            }
            // If it's 9, set it to 0 and continue to next left digit
            digits[i] = 0;
        }

        // If all digits were 9, we need a new array (e.g., 999 + 1 = 1000)
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
