class Solution {
    public int search(int[] nums, int target) {
        
        int n=nums.length;
        int out=-1;
        for(int i=0;i<n;i++){
            if(target==nums[i]){
                out=i;
            }
        }
        return out;
    }
}