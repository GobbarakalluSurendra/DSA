import java.util.HashMap;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> hm = new HashMap<>();

        // Count frequency of each stone
        for (int i = 0; i < stones.length(); i++) {
            char ch = stones.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        int ans = 0;
        // Check if jewel exists in stones and add its frequency
        for (int i = 0; i < jewels.length(); i++) {
            char ch = jewels.charAt(i);
            if (hm.containsKey(ch)) {
                ans += hm.get(ch);
            }
        }

        return ans;
    }

    // main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(sol.numJewelsInStones(jewels, stones)); 
        // Output: 3
    }
}
