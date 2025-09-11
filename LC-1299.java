class Solution{
    public static void main(String[] args) {
        int arr[]={17,18,5,4,6,1};
        int n=arr.length;
        int arr1[]=new int[n];
        for(int i=0;i<n-1;i++){
            int max=arr[i+1];
            for(int j=i+1;j<n;j++){
                int temp=arr[j];
                max=Math.max(max,temp);
            }
            arr1[i]=max;
           
        }
         arr1[n-1]=-1;
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

    }
}