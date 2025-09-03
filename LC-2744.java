class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int ans = 0;
        int n = words.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // avoid double count
                String S1 = words[i];
                String S2 = words[j];

                // Reverse S2 manually
                String rev = "";
                for (int k = S2.length() - 1; k >= 0; k--) {
                    rev = rev + S2.charAt(k);
                }

                if (S1.equals(rev)) {
                    ans++;
                }
            }
        }
        return ans; // ✅ return instead of print
    }

    // Main method to test
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words = {"ab", "ba", "cd", "dc", "ee"};
        int result = sol.maximumNumberOfStringPairs(words);
        System.out.println(result); // should print 2
    }
}
