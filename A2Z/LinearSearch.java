class Solution {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,80};
        int n=arr.length;
        int target=80;
        for(int i=0;i<n;i++){
            if(target==arr[i]){
                System.out.println(i);
            }
        }
    }
}