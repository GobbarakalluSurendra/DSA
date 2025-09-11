class Solution {
    public static  int maximumDifference(int[] nums) {
        int n=nums.length;
        int maxdiff=0;
        int low=nums[0];
        for(int i=1;i<n-1;i++){
          //  for(int j=i+1;j<n;j++){
                int diff=nums[i]-low;
                if(diff>maxdiff)
                maxdiff=diff;
                if(nums[i]<low)
                low=nums[i];
           // }

        }
       if(maxdiff>0)
       return maxdiff;
       else
       return -1;
        
    }
    public static void main(String[] args) {
        int nums[]={7,1,5,4};
        System.out.println(maximumDifference(nums));
    }
}