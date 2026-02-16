class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        
    }
}

//Second Approach

class Solution {
    public ListNode middleNode(ListNode head) {
       ListNode temp=head;
       int count=0;
       while(temp!=null){
        count++;
        temp=temp.next;
       }
       int midnode=(count/2)+1;
       temp=head;
       while(temp!=null){
        midnode=midnode-1;
        if(midnode==0)
        break;
        temp=temp.next;


       }
       return temp;
        
    }
}