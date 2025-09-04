// class Solution{
//     public static void main(String args[]){
//         int n=5;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
// output:
// * * * * * 
// * * * * *
// * * * * *
// * * * * *
// * * * * *

// class Solution{
//     public static void main(String args[]){
//         int n=5;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print("*");
//                 if(j!=n-1)
//                 System.out.print("-");
//             }
//             System.out.println();
//         }
//     }
// }
// OUTPUT:
// *-*-*-*-*
// *-*-*-*-*
// *-*-*-*-*
// *-*-*-*-*
// *-*-*-*-*



// class Solution {
//     public static void main(String[] args) {
//         int n=19;
//         int m=3;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print("*");
//                 if(j!=m-1)
//                 System.out.print("-");
//             }
//             System.out.println();
//         }
        
//     }
// }

// output:
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*

// class Solution {
//     public static void main(String[] args) {
//         int n=3;
//         int m=19;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print("*");
//                 if(j!=m-1)
//                 System.out.print("-");
//             }
//             System.out.println();
//         }
        
//     }
// }

// OUTPUT:
// *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
// *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
// *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*


// class Solution{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if(i==0||i==n-1|| j==0 ||j==n-1){
//                     System.out.print("* ");
//                 }
//                else{
//                 System.out.print("  ");
//                }}
//             System.out.println(" ");
//         }
//     }
// }

// OUTPUT:

// * * * * *  
// *       *
// *       *
// *       *
// * * * * *

// class Solution{
//     public static void main(String[] args) {
//         int n=4;
//         int m=15;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(i==0||i==n-1|| j==0 ||j==m-1){
//                     System.out.print("* ");
//                 }
//                else{
//                 System.out.print("  ");
//                }}
//             System.out.println(" ");
//         }
//     }
// }

// OUTPUT:

// * * * * * * * * * * * * * * *  
// *                           *
// *                           *
// * * * * * * * * * * * * * * *


// class Main {
//     public static void main(String[] args) {
//        int n=5;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i;j++){
//                System.out.print(" ");
//            }
//            for(int k=0;k<n;k++){
//                System.out.print("*");
//            }
//         //   for(int l=0;l<i;l++){
//         //       System.out.print("*");
//         //   }
//            System.out.println();
//        }
        
//     }
// }
// OUTPUT:
//      *****
//     *****
//    *****
//   *****
//  *****


// class Main {
//     public static void main(String[] args) {
//        int n=5;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i;j++){
//                System.out.print(" ");
//            }
//            for(int k=0;k<n;k++){
//                System.out.print("*");
//            }
//           for(int l=0;l<i;l++){
//               System.out.print("*");
//           }
//            System.out.println();
//        }
        
//     }
// }

// OUTPUT:
//      *****
//     ******
//    *******
//   ********
//  *********