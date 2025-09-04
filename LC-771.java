class Solution {
    public static int numJewelsInStones(String jewels, String stones) {
        int n = jewels.length();
        int m = stones.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = jewels.charAt(i);
            for (int j = 0; j < m; j++) {
                char ch1 = stones.charAt(j);
                if (ch == ch1)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(numJewelsInStones(jewels, stones)); 
    }
}
