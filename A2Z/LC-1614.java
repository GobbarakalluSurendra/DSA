class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int count=0;
        int arr[]=new int[n];int i=0;
       for(char ch:s.toCharArray()){
        
        if(ch=='('){
            count++;
        }else if(ch==')'){
            count--;
        }
        arr[i]=count;
        i++;
       }
       int max=arr[0];
       for(int j:arr){
        
            max=Math.max(max,j);
        }
       
            
       return max;
        
    }
}