/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */ //  1st method
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hs=new HashSet<>();
        ListNode temp=headA;
        while(temp!=null){
            hs.add(temp);
            temp=temp.next;
        }
         temp=headB;
        while(temp!=null){
            if(hs.contains(temp)){
                return temp;
            }
            temp=temp.next;
        }
        return null;
        
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a; // intersection node OR null
    }
}
