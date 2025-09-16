// class Solution {
//     public static int numIdenticalPairs(int[] nums) {
//         int n = nums.length;
//         int count = 0;
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (nums[i] == nums[j]) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         int nums[] = {1, 2, 3, 1, 1, 3};

//         int n = numIdenticalPairs(nums);   // ✅ Direct call (because static)
//         System.out.println(n);  // Expected output: 4
//     }
// }



//USING HASHMAP
// import java.util.*;

// class Solution {
//     public int numIdenticalPairs(int[] nums) {
//         HashMap<Integer, Integer> hm = new HashMap<>();

//         // Count frequency of each number
//         for (int n : nums) {
//             hm.put(n, hm.getOrDefault(n, 0) + 1);
//         }

//         int count = 0;

//         // For each frequency, calculate pairs
//         for (int val : hm.values()) {
//             if (val >= 2) {
//                 count += (val * (val - 1)) / 2;
//             }
//         }

//         return count;
//     }

//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int nums[] = {1, 2, 3, 1, 1, 3};
//         System.out.println(sol.numIdenticalPairs(nums));  // Output: 4
//     }
// }


//USING HashMap with Maths
import java.util.*;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans = 0;

        for (int n : nums) {
            if (hm.containsKey(n)) {
                ans += hm.get(n);
                hm.put(n, hm.get(n) + 1);
            } else {
                hm.put(n, 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int nums[] = {1, 2, 3, 1, 1, 3};
        System.out.println(sol.numIdenticalPairs(nums));  // Output: 4
    }
}
