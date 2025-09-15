class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        // Phase 1: Find a candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Verify the candidate (optional if you know a majority element always exists)
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        }

        return -1; // no majority element found
    }

    // Test the code
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + sol.majorityElement(nums));
    }
}
