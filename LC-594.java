import java.util.*;
class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        int ans = 0;
        int low = nums[0];  // (not needed but kept since you had it)

        for (int i = 0; i < n; i++) {
            count = 0; // reset count for each new i
            for (int j = i + 1; j < n; j++) {
                if (nums[j] - nums[i] == 0 || nums[j] - nums[i] == 1) {
                    count++;
                } else {
                    break;
                }
                if (nums[j] - nums[i] == 1) { // only update ans when diff=1
                    ans = Math.max(ans, count + 1);
                }
            }
        }
        return ans;
    }
      public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        Solution obj = new Solution();
        int result = obj.findLHS(nums);
        System.out.println("Longest Harmonious Subsequence length = " + result);
    }

}
