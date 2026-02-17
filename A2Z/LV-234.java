/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {

    // Function to reverse a linked list
    private ListNode reverse(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

        return head;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Step 1: find middle (slow-fast)
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: reverse second half
        ListNode secondHalf = reverse(slow.next);

        // Step 3: compare both halves
        ListNode firstHalf = head;
        ListNode temp = secondHalf;

        while (temp != null) {
            if (firstHalf.val != temp.val) {
                reverse(secondHalf); // restore list
                return false;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        // Step 4: restore list
        reverse(secondHalf);

        return true;
    }
}
