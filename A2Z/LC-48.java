// class Solution {
//     public void rotate(int[][] matrix) {
//         int n = matrix.length;

//         // transpose
//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[j][i];
//                 matrix[j][i] = temp;
//             }
//         }

//         // reverse columns (using your idea of k)
//         for (int i = 0; i < n; i++) {
//             int k = n - 1;
//             for (int j = 0; j < k; j++) {
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[i][k];
//                 matrix[i][k] = temp;
//                 k--;
//             }
//         }
//     }
// }



//2nd method

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // create a temporary matrix to avoid overwriting
        int[][] temp = new int[n][n];

        // fill temp using correct rotation rule
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j] = matrix[n - j - 1][i];
            }
        }

        // copy temp back to original matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = temp[i][j];
            }
        }
    }
}