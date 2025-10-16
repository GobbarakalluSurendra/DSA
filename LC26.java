class LC26 {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4,4,4};
        int n = nums.length;
        int j = 1;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                System.out.println(nums[i]);
                j++;
            }
        }
        System.out.println(nums[n - 1]); // print last unique element
    }
}
