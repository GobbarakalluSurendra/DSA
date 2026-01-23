// import java.util.*;

// class LC217 {
//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 1};

//         // Create an object to call the non-static method
//         LC217 obj = new LC217();
//         System.out.println(obj.containsDuplicate(arr));
//     }

//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == nums[i - 1]) {
//                 return true;  // duplicate found
//             }
//         }
//         return false;
//     }
// }
import java.util.HashMap;
import java.util.Scanner;

class Solution {

    // Method to check duplicates
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            if (map.containsKey(n)) {
                return true;   // duplicate found
            }
            map.put(n, 1);      // store element
        }
        return false;          // no duplicates
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        boolean result = obj.containsDuplicate(nums);

        System.out.println("Contains Duplicate: " + result);
    }
}
