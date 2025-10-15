class Main {
    public static void main(String[] args) { 
    int arr[]={1,2,3,4,5,6};
    int l=0,sl=4;
    int temp=0,ans=0;
    for(int r=0;r<arr.length;r++){
        temp+=arr[r];
        if(r-l==sl){
            temp-=arr[l];
            l++;
        }
        if(r-l+1==sl)
        ans=Math.max(ans,temp);
    }
    
    System.out.println(ans);
     }
}