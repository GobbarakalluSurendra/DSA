class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder clean = new StringBuilder();

        // Step 1: Clean the sentence
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                clean.append(Character.toLowerCase(c));
            }
        }

        // Step 2: Convert to String
        String original = clean.toString();

        // Step 3: Reverse
        String reversed = new StringBuilder(original).reverse().toString();

        // Step 4: Compare
        if (original.equals(reversed)) {
                return true;  
                      } else {
                    return false;        }
    }
}
