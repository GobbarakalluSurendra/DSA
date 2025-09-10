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

// class Solution{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n;i++){
//             for(int j=n-i-1;j>0;j--){
//                 System.out.print(" ");
//             }
             
//             for(int k=0;k<i*2+1;k++){
//                 System.out.print("*");
//             }
//              System.out.println();
//         }
//         System.out.println();
//     }
// }
// OUTPUT:
//     *
//    ***
//   *****
//  *******
// *********
// class Solution{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print(" ");
//             }
             
//             for(int k=0;k<n*2-i*2-1;k++){
//                 System.out.print("*");
//             }
//              System.out.println();
//         }
//         System.out.println();
//     }
// }
// OUTPUT:
// *********
//  *******
//   *****
//    ***
//     *
// class Solution{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=n-1;i>=0;i--){
//             for(int j=n-i-1;j>0;j--){
//                 System.out.print(" ");
//             }
             
//             for(int k=0;k<i*2+1;k++){
//                 System.out.print("*");
//             }
//              System.out.println();
//         }
//         System.out.println();
//     }
// }
// OUTPUT:
// *********
//  *******
//   *****
//    ***
//     *
// class Solution{
//     public static void main(String[] args) {
//         int n=5;
//       
//         for(int i=0;i<n;i++){
//             for(int j=n-i-1;j>0;j--){
//                 System.out.print(" ");
//             }
             
//             for(int k=0;k<i*2+1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
          
//         }
//            for(int l=n-2;l>=0;l--){
//             for(int j=n-l-1;j>0;j--){
//                 System.out.print(" ");
//             }
             
//             for(int k=0;k<l*2+1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//              }
        

//     }
// }
// OUTPUT:
//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *


//    class Solution{
//     public static void main(String[] args) {
//         int n=5;
      
       
//            for(int l=n-1;l>=0;l--){
//             for(int j=n-l-1;j>0;j--){
//                 System.out.print(" ");
//             }
             
//             for(int k=0;k<l*2+1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//              }
//               for(int i=1;i<n;i++){
//             for(int j=n-i-1;j>0;j--){
//                 System.out.print(" ");
//             }
             
//             for(int k=0;k<i*2+1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
          
//         }
        

//     }
// }
// OUTPUT:
// *********
//  *******
//   *****
//    ***
//     *
//    ***
//   *****
//  *******
// *********
// class Solution{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n-i-1;j++){
//                 System.out.print(" ");
//             }
//              for(int k=0;k<i*2+1;k++){
//                 if(k==0||k==i*2||i==n-1){
//                 System.out.print("*");
//                 }
//             else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// OUTPUT:
//     *
//    * *
//   *   *
//  *     *
// *********

// class Solution{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=n-1;i>=0;i--){
//             for(int j=0;j<n-i-1;j++){
//                 System.out.print(" ");
//             }
//              for(int k=0;k<i*2+1;k++){
//                 if(k==0||k==i*2||i==n-1){
//                 System.out.print("*");
//                 }
//             else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// OUTPUT:
// *********
//  *     *
//   *   *
//    * *
//     *

//class Solution{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-i-1;j++){
//                 System.out.print(" ");
//             }
//              for(int k=0;k<i*2+1;k++){
//                 if(k==0||k==i*2){
//                 System.out.print("*");
//                 }
//             else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//                 for(int i=n-1;i>=0;i--){
//             for(int j=0;j<n-i-1;j++){
//                 System.out.print(" ");
//             }
//              for(int k=0;k<i*2+1;k++){
//                 if(k==0||k==i*2){
//                 System.out.print("*");
//                 }
//             else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// OUTPUT:
//     *
//    * *
//   *   *
//  *     *
// *       *
//  *     *
//   *   *
//    * *
//     *

// class Solution{
//     public static void main(String[] args) {
//         int n=6;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<i+1;j++){
//                 System.out.print(j+1);
//             }
//             System.out.println();
//         }
//     }
// }
// OUTPUT:
// 1
// 12
// 123
// 1234
// 12345
// 123456
class Solution{
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n;i++){
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
OUTPUT:
     1
    21
   321
  4321
 54321
654321