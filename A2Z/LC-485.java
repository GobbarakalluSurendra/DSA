class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count=0;
        int max=0;
        for(int i:nums){
            if(i==1){
                max++;
                count=Math.max(count,max);
            }else{
               max=0;
            }
        }
        return count;
    }
}