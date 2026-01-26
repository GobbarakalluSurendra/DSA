class Solution{
    public static void main(String[] args) {
        int n=371;
        int rem=0,sum=0,x=n;
        while(n>0){
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;

        }
        if(sum==x){
            System.out.println(x+" is a Armstrong Number");
        }
        else{
                        System.out.println(x+" is  not a Armstrong Number");

        }
        
    }
}