import java.util.*;

class Solution {
    // Function to find all divisors
    public List<Integer> getDivisors(int N) {
        // Create list to store divisors
        List<Integer> res = new ArrayList<>();

        // Loop from 1 to N
        for (int i = 1; i <= N; i++) {
            // Check if i is a divisor of N
            if (N % i == 0) {
                // Add i to the result
                res.add(i);
            }
        }
        // Return the list of divisors
        return res;
    }



    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Input number
        int N = 36;

        // Call the function to get divisors
        List<Integer> result = sol.getDivisors(N);

        // Print the result
        System.out.print("Divisors of " + N + ": ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
