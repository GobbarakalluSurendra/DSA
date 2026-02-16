//Using HashSet
public class Solution {
    public ListNode detectCycle(ListNode head) {
         HashSet<ListNode> hs=new HashSet<>();
        ListNode temp=head;

        while(temp!=null){
            if(hs.contains(temp)){
                return temp;
            }
            hs.add(temp);
            temp=temp.next;
        }
        return null;
        
    }
}

//Using HashMap
 public class Solution {
    public ListNode detectCycle(ListNode head) {
         HashMap<ListNode,Integer> hs=new HashMap<>();
        ListNode temp=head;

        while(temp!=null){
            if(hs.containsKey(temp)){
                return temp;
            }
            hs.put(temp,1);
            temp=temp.next;
        }
        return null;
    }
}

//Using TortoiseHare Method
public class Solution {
    public ListNode detectCycle(ListNode head) {
         ListNode fast=head;
       ListNode slow=head;
       while(fast !=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            slow=head;
            while(slow !=fast){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }
       }
        return null;
        
    }
}