
//     public static void main(String[] args) {
//     int arr[]={1,3,4,5};
//     int n=arr.length;
//     for(int i=0;i<n;i++){
//         for(int j=i;j<n;j++){
//             for(int k=i;k<=j;k++){x
//                             System.out.print(arr[k]+" ");

//             }
//                         System.out.println();

//         }
//     }
//     }
// }

// class Main{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6};
//         int n=arr.length;
//         int sl=2;
//         int ans=0;
//         for(int i=0;i<n-sl;i++){
//             int j=i+sl;
//             int temp=0;
//             for(int k=i;k<=j;k++){
//                 temp+=arr[k];

//             }
//             ans=Math.max(ans,temp);
//         }
//         System.out.println(ans);
//     }
// }
class Main{
    public static void main(String[] args) {
        int arr[]={5,9,1,8,7};
        int n=arr.length;
        int sl=3;
        int ans=0;
        for(int i=0;i<n-sl;i++){
            int j=i+sl-1;
            int temp=0;
            for(int k=i;k<=j;k++){
                temp+=arr[k];
            }
            ans=Math.max(ans,temp);
        }
        System.out.println(ans);
    }
}
