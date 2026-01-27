// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
           int x=n,pal=0;
    while(n>0){
        int rem=n%10;
         pal=pal+rem*rem*rem;
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