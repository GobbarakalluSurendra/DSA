// import java.util.*;
// class Solution {
//     public boolean isPalindrome(int x) {
//         if(x<0){
//             return false;
//         }
//         int n=x;
//         int revNum=0;
//         while(n>0){
//             int d=n%10;
//             revNum=revNum*10+d;
//             n=n/10;
//         }
//         if(revNum==x){
//             return true;
//         }else{
//             return false;
//         }

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         // Create object
//         Solution obj = new Solution();

//         System.out.println(n+" Palindrome or not: " + obj.isPalindrome(n));
//     }

// }

class Solution {
    public boolean isPalindrome(int n) {
    // code here
    int x=n,pal=0;
    while(n>0){
        int rem=n%10;
         pal=pal*10+rem;
        n/=10;
        
    }
    if(pal==x){
        return true;
    }
    else{
        return false;
    }
        
    }
}