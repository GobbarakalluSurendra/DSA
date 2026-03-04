class Solution {
    static boolean isEven(int n) {
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
        
    }
}

// /Second Method
class Main {
    public static void main(String[] args) {
    int a=9;
    if((a & 1)==0){
        System.out.println("Even");
    }
    else{
        System.out.println("Odd");
    }
    }
}