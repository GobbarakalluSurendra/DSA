

// class Solution{
//     public static void main(String[] args) {
//         int colors[]={1,8,3,8,3};
//         //int temp=colors[0];
//         int temp1=0;
//         for(int i=0;i<colors.length;i++){
//             for(int j=i+1;j<colors.length;j++){
//                 if(colors[i]!=colors[j]){
//                 int diff=Math.abs(i-j);  
//                 temp1=Math.max(temp1,diff);
//                 }
            
           
//             }
//         }
//         System.out.println(temp1);
//     }
// }

class Solution {
    public int maxDistance(int[] colors) {
        
         int max=0;
         int n=colors.length;
        for(int i=0;i<colors.length-1;i++){
            //for(int j=i+1;j<colors.length;j++){
                if(colors[i]!=colors[n-1]){
               // int diff=Math.abs(i-j);
                max=Math.max(max,n-1-i);  
                break;
                }
            
           
            //}
        } 
        for(int i=n-1;i>=1;i--){
            if(colors[0]!=colors[i]){
                max=Math.max(max,i);
                break;
            }
        }
        return max;
    }
}