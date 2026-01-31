class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        int m = n / 3;

        int count = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > m) {
                    list.add(nums[i - 1]);
                }
                count = 1;
            }
        }

        // last element check
        if (count > m) {
            list.add(nums[n - 1]);
        }

        return list;
    }
}
