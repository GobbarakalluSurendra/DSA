import java.util.*;

// Node class for Doubly Linked List
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Solution {

    // Function to find tail of DLL
    public static Node findTail(Node head) {
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }

    // Function to find pairs with given sum k
    public static List<int[]> findPairs(Node head, int k) {

        List<int[]> ans = new ArrayList<>();

        if (head == null)
            return ans;

        Node left = head;
        Node right = findTail(head);

        // Two pointer approach
        while (left != null && right != null && left != right && right.next != left) {

            int sum = left.data + right.data;

            if (sum == k) {
                ans.add(new int[]{left.data, right.data});
                left = left.next;
                right = right.prev;
            }
            else if (sum < k) {
                left = left.next;
            }
            else {
                right = right.prev;
            }
        }

        return ans;
    }
}