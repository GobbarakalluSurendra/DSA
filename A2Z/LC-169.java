// class Solution {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
//         HashSet<Integer> set = new HashSet<>();

//         for (int i = 0; i < n; i++) {
//             set.add(nums[i]);
//         }

//         for (int val : set) {
//             int count = 0;
//             for (int i = 0; i < n; i++) {
//                 if (nums[i] == val) {
//                     count++;
//                 }
//             }
//             if (count > n / 2) {
//                 return val;
//             }
//         }

//         return -1; // will never happen as majority element always exists
//     }
// }

//2nd method

class Solution {
    public int majorityElement(int[] nums) {
     Arrays.sort(nums);
    // int m=nums[n/2];
         int n=nums.length/x2;

     return nums[n];
    }
}
