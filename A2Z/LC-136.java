import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}

//Second Method
class Solution {
    public int singleNumber(int[] nums) {
       int xor=0;
       for(int i:nums){
        xor ^=i;
       }
       return xor;
    }
}
