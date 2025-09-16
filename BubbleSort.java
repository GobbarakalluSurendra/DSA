class Solution {
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 4, 6};
        int n = arr.length;

        for(int i = 0; i < n-1; i++) {
            int count = 0;  // count swaps in this pass

            for(int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }

            System.out.println("Pass " + (i+1) + " swaps = " + count);

            // ✅ If no swaps, array is already sorted
            if(count == 0) {
                break;
            }
        }

        System.out.println("Sorted array:");
        for(int i = n-1; i >=0; i--) {
            System.out.println(arr[i]);
        }
    }
}
