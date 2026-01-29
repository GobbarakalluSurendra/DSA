// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxSum = nums[0];
//         int currentSum = nums[0];
//         int start=0,end=0;

//         for (int i = 1; i < nums.length; i++) {
//             currentSum = Math.max(nums[i], currentSum + nums[i]);
//             start=i;

//             maxSum = Math.max(maxSum, currentSum);
//             end=i;
//         }

//         return maxSum;
//     }
// }

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        int start = 0, end = 0;
        int tempStart = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                tempStart = i;   // new subarray starts
            } else {
                currentSum = currentSum + nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        // print subarray
        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        return maxSum;
    }
}

