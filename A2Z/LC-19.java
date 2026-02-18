class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp = head;
        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;

        }
        slow.next=slow.next.next;
        return head;
        
      
        
    }
}

//2nd apporoch
class Solution {

    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;

        // Step 1: reverse list
        ListNode revHead = reverse(head);

        // Step 2: delete nth node from start
        if(n == 1){
            revHead = revHead.next;
        } else {
            ListNode temp = revHead;
            for(int i = 1; i < n-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        // Step 3: reverse again
        return reverse(revHead);
    }
}

//3rd Apporach
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;

        // count total nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // if deleting first node
        if (count == n) {
            return head.next;
        }

        // move to node before the one to delete
        int steps = count - n;
        temp = head;
        for (int i = 1; i < steps; i++) {
            temp = temp.next;
        }

        // delete node
        temp.next = temp.next.next;

        return head;
    }
}