// class Solution {
//     public int[] findErrorNums(int[] nums) {
//         int n = nums.length;
//         int num = 0;
//         boolean b = false;

//         // Find duplicate
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (nums[i] == nums[j]) {
//                     num = nums[i];
//                     b = true;
//                 }
//                 if (b) {
//                     break; // exits only inner loop
//                 }
//             }
//             if (b) break; // exit outer loop also
//         }

//         // Find missing
//         int missing = 0;
//         for (int i = 1; i <= n; i++) {
//             boolean found = false;
//             for (int j = 0; j < n; j++) {
//                 if (nums[j] == i) {
//                     found = true;
//                     break;
//                 }
//             }
//             if (!found) {
//                 missing = i;
//                 break;
//             }
//         }

//         return new int[]{num, missing};
//     }

//     // Main method for testing
//     public static void main(String[] args) {
//         Solution sol = new Solution();

//         int[] nums = {1, 2, 2, 4};
//         int[] result = sol.findErrorNums(nums);

//         System.out.println("Duplicate: " + result[0]);
//         System.out.println("Missing: " + result[1]);
//     }
// }


//2ND METHOD

import java.util.*;

class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int du = -1;
        int n = nums.length;
        int missing = 0;

        // Find duplicate
        for (int i = 0; i < n; i++) {
            int m = nums[i];
            if (!hs.contains(m)) {
                hs.add(m);
            } else {
                du = m;
            }
        }

        // Find missing
        for (int i = 1; i <= n; i++) {
            if (!hs.contains(i)) {
                missing = i;
            }
        }

        return new int[]{du, missing};
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example test case
        int[] nums = {1, 2, 2, 4};
        int[] result = sol.findErrorNums(nums);

        System.out.println("Duplicate: " + result[0]);
        System.out.println("Missing: " + result[1]);
    }
}
