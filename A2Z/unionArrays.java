
import java.util.HashSet;


class Solution {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {3, 4, 5};

        HashSet<Integer> list = new HashSet<>();

        for (int i : arr1) {
            list.add(i);
        }

        for (int i : arr2) {
            list.add(i);
        }

        for (int i : list) {
            System.out.println(i);
        }
    }
}
