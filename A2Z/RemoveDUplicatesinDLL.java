class Solution{
    public static ListNode removeDupliactesListNode(ListNode head){
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            ListNode nextnode=temp.next;
            while(nextnode !=null &&  nextnode.val==temp.data){
                ListNode duplicate=nextnode;
                nextnode=nextnode.next;
            }
            temp.next=nextnode;
            if(nextnode!=null){
                nextnode.prev=temp;
                
            }
            temp=temp.next;


        }
        return head;
    }
}