// import java.util.*;
//  class F1{
//     public static void Sum(int a,int b){
//         int sum1=a+b;
//         System.out.println("Sum of Two number is :"+sum1);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         Sum(a,b);
//     }
// }

//Question--1--->Enter 3 numbers from the user & make a function to print their average.
// import java.util.*;
// class F1{
//     public static int Sum(int a,int b,int c){
//         int sum1=a+b+c;
        
//         return sum1/3;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();
        
//         System.out.println("Average of Three number is :"+Sum(a,b,c));
//     }
// }

// Write a function to print the sum of all odd numbers from 1 to n.
// import java.util.*;
// class F1{
//     public static int Sum(int n){

//         int add=0;
//         for(int i=1;i<=n;i++){
//             if(i%2!=0){
//                 add +=i;
//             }
//         }
       
        
//         return add;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
        
        
//         System.out.println("Sum Of Odd Numbers :"+Sum(n));
//     }
// }

//Write a function which takes in 2 numbers and returns the greater of those two.
// import java.util.*;
// class Solution{
//     public static int GreaterNumber(int a,int b){
//         if(a>b){
//             return a;
//         }
//         else{
//             return b;
//         }
       
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         System.out.println("Greater Number Is:"+GreaterNumber(a,b));
        
//     }
// }
//Write a function that takes in the radius as input and returns the circumference of a circle
// import java.util.*;
//  class F1{
// public static float circumference(float r){
//     float value=2*3.14f*r;
//     return value ;
// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     float r=sc.nextFloat();
//     System.out.println("CircumFerence of Circle is :"+circumference(r));
// }
//  }

// 
// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.*;
// class Solution{
//     public static String Vote(int age){
//         if(age>=18){
//             return "Eligible to vote";
//         }
//         else{
//             return "Not Eligible to Vote";
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int age=sc.nextInt();
//         System.out.println(Vote(age));
//     }
// }

// Write an infinite loop using do while condition.
// class Solution{
//     public static void main(String[] args) {
//         int a=0;
//         do { 
        
//             System.out.println("Chinnu");
//             a--;
//         } while (a<0);
//     }
// }

// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered

//import java.util.*;

// class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int positive = 0, negative = 0, zero = 0;

//         System.out.print("Enter how many numbers: ");
//         int n = sc.nextInt();

//         for (int i = 0; i < n; i++) {
//             int num = sc.nextInt();

//             if (num > 0)
//                 positive++;
//             else if (num < 0)
//                 negative++;
//             else
//                 zero++;
//         }

//         System.out.println("Positive: " + positive);
//         System.out.println("Negative: " + negative);
//         System.out.println("Zero: " + zero);
//     }
// }
// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
// import java.util.*;
// class Solution{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int n=sc.nextInt();
//         System.out.print("a to the power of n:"+Math.pow(a,n));
//     }
//}

// Write a function that calculates the Greatest Common Divisor of 2 numbers. 

// import java.util.*;
// import java.util.*;

// class GCD {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int gcd = 1;

//         for (int i = 1; i <= a && i <= b; i++) {
//             if (a % i == 0 && b % i == 0) {
//                 gcd = i;
//             }
//         }

//         System.out.println("GCD = " + gcd);
//     }
// }

// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

import java.util.*;
class Solution{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=sc.nextInt();
        int next=0;
        System.out.print(a+" "+b+" ");
        for(int i=1;i<=n;i++){
           next =(a+b);
             System.out.print(next+" ");
            a=b;
            b=next;
          
        }
    }
}