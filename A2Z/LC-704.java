// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         k = k % n; // handle k > n

//         for (int j = 0; j < k; j++) {
//             int temp = nums[0]; // store first element

//             // shift elements to the left
//             for (int i = 1; i < n; i++) {
//                 nums[i - 1] = nums[i];
//             }

//             nums[n - 1] = temp; // put first element at the end
//         }
//     }
// }


class Solution {
    public int search(int[] nums, int target) {
      int n = nums.length; // size of the array
        int low = 0, high = n - 1;

        // Keep searching until low crosses high
        while (low <= high) {
            int mid = (low + high) / 2; // Find the middle index
            if (nums[mid] == target) return mid;       // Target found
            else if (target > nums[mid]) low = mid + 1; // Search in right half
            else high = mid - 1;                        // Search in left half
        }
        return -1; // Target not found
    }
}