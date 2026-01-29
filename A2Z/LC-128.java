// class Solution {
//     public int longestConsecutive(int[] nums) {
//        int n = nums.length;

//         // Return 0 if array is empty
//         if (n == 0) return 0; 

//         // Sort the array to bring consecutive numbers together
//         Arrays.sort(nums); 

//         // Variable to track the last smaller element in sequence
//         int lastSmaller = Integer.MIN_VALUE; 

//         // Variable to store the current sequence length
//         int cnt = 0; 

//         // Variable to store the longest sequence length found
//         int longest = 1; 

//         // Iterate through the sorted array
//         for (int i = 0; i < n; i++) {
//             // Case 1: Current element is exactly one greater than lastSmaller → part of sequence
//             if (nums[i] - 1 == lastSmaller) {
//                 // Increment the sequence length
//                 cnt += 1; 
//                 // Update the last smaller element
//                 lastSmaller = nums[i]; 
//             } 
//             // Case 2: Current element is not consecutive and not a duplicate
//             else if (nums[i] != lastSmaller) {
//                 // Reset the sequence length count to 1
//                 cnt = 1; 
//                 // Update the last smaller element
//                 lastSmaller = nums[i]; 
//             }
//             // Update the longest sequence length if the current sequence is longer
//             longest = Math.max(longest, cnt); 
//         }
        
//         // Return the length of the longest consecutive sequence
//         return longest;
//     }
        
    
// }

//2nd method

class Solution {
    public int longestConsecutive(int[] nums) {
         int n = nums.length;

        // If the array is empty, no sequence exists
        if (n == 0) return 0;

        // Variable to store the longest sequence length found
        int longest = 1; 

        // HashSet to store unique elements for O(1) lookup
        Set<Integer> st = new HashSet<>();

        // Add all elements to the set to remove duplicates
        for (int i = 0; i < n; i++) {
            st.add(nums[i]);
        }

        /* Loop through each element in the set to find 
           the starting point of consecutive sequences */
        for (int it : st) {
            // If there is no number before 'it', it’s the start of a sequence
            if (!st.contains(it - 1)) {
                // Start the count for this sequence
                int cnt = 1; 
                // Store the current number
                int x = it; 

                // Keep checking for the next consecutive number
                while (st.contains(x + 1)) {
                    // Move to the next number in sequence
                    x = x + 1; 
                    // Increment the length of current sequence
                    cnt = cnt + 1; 
                }

                // Update the longest sequence length if needed
                longest = Math.max(longest, cnt);
            }
        }

        // Return the length of the longest sequence
        return longest;
    }
        
    
}