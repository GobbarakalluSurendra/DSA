// class LC766 {
//     public static void main(String[] args) {
//         int[][] mat = {
//             {1, 2, 3, 4},
//             {5, 1, 2, 3},
//             {9, 5, 1, 2}
//         };

//         Solution sol = new Solution();
//         System.out.println(sol.isToeplitzMatrix(mat));
//     }
// }

// class Solution {
//     public boolean isToeplitzMatrix(int[][] matrix) {
//         int r = matrix.length;
//         int c = matrix[0].length;

//         for (int i = 0; i < r - 1; i++) {
//             for (int j = 0; j < c - 1; j++) {
//                 if (matrix[i][j] != matrix[i + 1][j + 1]) {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// }


// USING FOR LOOP

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for (int i = 0; i < r - 1; i++) {
            for (int j = 0; j < c - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}

public class LC766{
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] mat1 = {
            {1, 2, 3, 4},
            {5, 1, 2, 3},
            {9, 5, 1, 2}
        };

        int[][] mat2 = {

            {1, 2},
            {2, 2}
        };

        System.out.println(sol.isToeplitzMatrix(mat1)); // true
        System.out.println(sol.isToeplitzMatrix(mat2)); // false
    }
}
