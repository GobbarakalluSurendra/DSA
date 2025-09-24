// class Main {
//     public static void main(String[] args) {
//         int[][] arr = { {1, 3, 4}, {5, 6, 7}, {8, 9, 10} };

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 if (i == j) {
//                     System.out.println(arr[i][j]); // Print diagonal elements
//                 }
//             }
//         }
//     }
// }

// OUTPUT:
// 1
// 6
// 10
//SECOND METHOD

// class Main {
//     public static void main(String[] args) {
//         int[][] arr = { {1, 3, 4}, {5, 6, 7}, {8, 9, 10} };

//         for (int i = 0; i < arr.length; i++) {
            
//                     System.out.println(arr[i][i]); // Print diagonal elements
    

//         }
//     }
// }
// OUTPUT:
// 1
// 6
// 10

//REVERSE DIAGONAL ELEMENTS

// class Main {
//     public static void main(String[] args) {
//         int[][] arr = { {1, 3, 4}, {5, 6, 7}, {8, 9, 10} };
//         int c=arr[0].length;

//         for (int i = 0; i < arr.length; i++) {
            
//                     System.out.println(arr[i][c-i-1]); // Print diagonal elements
    

//         }
//     }
// }
// OUTPUT:

// 4
// 6
// 8

// USING WHILE LOOP TO PRINT DIAGONAL ELEMENTS

// class Main {
//     public static void main(String[] args) {
//         int[][] arr = { {1, 3, 4}, {5, 6, 7}, {8, 9, 10} };
//         int r=arr.length;
//         int c=arr[0].length;
//         int i=0;
//         int j=0;
//         while(i<r&&j<c)
//         {
//             System.out.println(arr[i][j]);
//             i=i+1;
//             j=j+1;
            
//         }
       
//     }
// }

// 1
// 6
// 10

// REverse diagonal elemnts using WHile loop
// class Main {
//     public static void main(String[] args) {
//         int[][] arr = { {1, 3, 4}, {5, 6, 7}, {8, 9, 10} };
//         int r=arr.length;
//         int c=arr[0].length;
//         int i=0;
//         //int j=0;
//         while(i<r)
//         {
//             System.out.println(arr[i][c-i-1]);
//             i=i+1;
//             //j=j+1;
            
//         }
       
//     }
// }

// OUTPUT:
// 4
// 6
// 8

// class Main {
//     public static void main(String[] args) {
//         int[][] arr = { {1, 3, 4,10}, {5, 6, 7,11}, {8, 9, 10,12} };

//         for (int i = 0; i <arr.length; i++) {
//             int j=i+1;
//                     System.out.println(arr[i][j]); // Print diagonal elements
    

//         }
//     }
// }

// OUTPUT:
// 3
// 7
// 12
// class Main {
//     public static void main(String[] args) {
//         int[][] arr = { {1, 3, 4,10}, {5, 6, 7,11}, {8, 9, 10,12} };
//         int r=arr.length;
//         int c=arr[0].length;
//         int i=0;
        
//         while(i<=c)
//         {
//             int j=i+2;
//             System.out.println(arr[i][j]);
//             i=i+1;
           
            
//         }
       
//     }
// }

//CHECK IF DIAGONAL elements are same or not
class Main {
    public static void main(String[] args) {
        int[][] arr = { {1, 3, 4, 11}, {5, 6, 7, 12}, {8, 9, 10, 13} };
        int r = arr.length;
        int c = arr[0].length;
        int i = 0, j = 0;

        boolean chinnu = true;   // ✅ declare before loop
        int temp = arr[0][0];    // ✅ take first element as reference

        while (i < r && j < c) {
            if (arr[i][j] != temp) {        // check if different
                chinnu = false;
                break;
            }
            i++;
            j++;
        }

        System.out.println(chinnu);
    }
}
