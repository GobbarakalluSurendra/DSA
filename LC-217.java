import java.util.*;

class LC217 {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 1};

        // Create an object to call the non-static method
        LC217 obj = new LC217();
        System.out.println(obj.containsDuplicate(arr));
    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;  // duplicate found
            }
        }
        return false;
    }
}
