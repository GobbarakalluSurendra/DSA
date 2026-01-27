// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int x=n,pal=0;
    while(n>0){
        int rem=n%10;
         pal=pal*10+rem;
        n/=10;
        
    }
    return pal;
    }
}
