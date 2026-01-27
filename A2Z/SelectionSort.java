import java.util.*;
class Solution{
    public static void main(String args[]){
        int arr[]={10,23,4,51,37,46};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++ ){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}