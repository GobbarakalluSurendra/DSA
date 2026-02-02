class Solution {
    // Function to print the alternating pattern of 1's and 0's
    public void pattern11(int N) {
        int start;
        
        // Outer loop for the number of rows
        for (int i = 0; i < N; i++) {
            for(int j=0;j<=i;j++)
            // If the row index is even, print 1 first
            if ((i+j)%2 == 0) System.out.print("1");
        
            else System.out.print("0");
        

           

            // Move to the next line after each row is printed
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5;
        sol.pattern11(N); // Print the pattern
    }
}
