// import java.util.*;

// class Solution {
//     // Function to find quadruplets with sum = target
//     public List<List<Integer>> fourSum(int[] arr, int target) {
//         // Get size of array
//         int n = arr.length;
//         // Use set to avoid duplicate quadruplets
//         Set<List<Integer>> set = new HashSet<>();

//         // First loop - pick first element
//         for (int i = 0; i < n; i++) {
//             // Second loop - pick second element
//             for (int j = i + 1; j < n; j++) {
//                 // Third loop - pick third element
//                 for (int k = j + 1; k < n; k++) {
//                     // Fourth loop - pick fourth element
//                     for (int l = k + 1; l < n; l++) {
//                         // Calculate sum of four numbers
//                         long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];
//                         // If sum matches target
//                         if (sum == target) {
//                             // Create quadruplet
//                             List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
//                             // Sort to maintain uniqueness
//                             Collections.sort(temp);
//                             // Add to set
//                             set.add(temp);
//                         }
//                     }
//                 }
//             }
//         }
//         // Convert set to list and return
//         return new ArrayList<>(set);
//     }

//     public static void main(String[] args) {
//         // Input array
//         int[] arr = {1, 0, -1, 0, -2, 2};
//         // Target sum
//         int target = 0;

//         // Create object
//         Solution obj = new Solution();
//         // Get result
//         List<List<Integer>> ans = obj.fourSum(arr, target);

//         // Print result
//         for (List<Integer> quad : ans) {
//             System.out.println(quad);
//         }
//     }
// }

class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
                int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();

        // Step 1: Sort array
        Arrays.sort(arr);

        // Step 2: First loop for first number
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            // Step 3: Second loop for second number
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;

                // Step 4: Two pointers
                int left = j + 1, right = n - 1;
                while (left < right) {
                    long sum = (long) arr[i] + arr[j] +
                               arr[left] + arr[right];

                    if (sum == target) {
                        ans.add(Arrays.asList(arr[i], arr[j],
                                              arr[left], arr[right]));

                        while (left < right && arr[left] == arr[left + 1]) left++;
                        while (left < right && arr[right] == arr[right - 1]) right--;

                        left++;
                        right--;
                    }
                    else if (sum < target) left++;
                    else right--;
                }
            }
        }
        return ans;
    }
}

