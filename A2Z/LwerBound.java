
// class LowerBoundFinder {

//     // Function to find the lower bound index
//     public int lowerBound(int[] arr, int x) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] >= x) {
//                 return i;  // First index where element >= x
//             }
//         }
//         return arr.length;  // If x is greater than all elements
//     }

//     public static void main(String[] args) {
//         int[] arr = {3, 5, 8, 15, 19};
//         int x = 8;

//         LowerBoundFinder lb = new LowerBoundFinder();
//         System.out.println("Lower Bound index: " + lb.lowerBound(arr, x));
//     }
// }

class LowerBoundFinder {
    // Function to find the lower bound index using binary search
    public int lowerBound(int[] arr, int x) {
        int low = 0;                  // Start index
        int high = arr.length - 1;    // End index
        int ans = arr.length;         // Default value if not found

        while (low <= high) {
            int mid = (low + high) / 2;  // Find mid index

            if (arr[mid] >= x) {
                ans = mid;            // Store possible answer
                high = mid - 1;       // Move left
            } else {
                low = mid + 1;        // Move right
            }
        }
        return ans;  // Return the lower bound index
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};  // Sorted array
        int x = 9;                      // Target value

        LowerBoundFinder finder = new LowerBoundFinder();     // Create object
        int ind = finder.lowerBound(arr, x);                  // Find lower bound

        System.out.println("The lower bound is the index: " + ind);  // Print result
    }
}
