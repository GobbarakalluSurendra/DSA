import java.util.*;

class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> hm = new HashMap<>();
        int temp = 97;
        int n = key.length();
        for (int i = 0; i < n; i++) {
            char ch = key.charAt(i);
            if (ch != ' ' && !hm.containsKey(ch)) {
                hm.put(ch, (char)temp);
                temp++;
            }
        }
        String ans = "";
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            //System.out.println(ch);
            if (ch != ' ') {
                char val = hm.get(ch);
                ans += val;
            } else {
                ans += ' ';
            }
        }
        return ans;
    }

    // ✅ Main function to test
    public static void main(String[] args) {
        Solution sol = new Solution();
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        String decoded = sol.decodeMessage(key, message);
        System.out.println("Decoded Message: " + decoded);
    }
}
