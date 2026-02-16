//Using HashMAp
import java.util.*;
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Integer> hs=new HashMap<>();
        ListNode temp=head;

        while(temp!=null){
            if(hs.containsKey(temp)){
                return true;
            }
            hs.put(temp,1);
            temp=temp.next;
        }
        return false;
        
    }
}

//Using HashSet
import java.util.*;
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hs=new HashSet<>();
        ListNode temp=head;

        while(temp!=null){
            if(hs.contains(temp)){
                return temp;
            }
            hs.add(temp);
            temp=temp.next;
        }
        return false;
        
    }
}

//Using TortoiseHare Method
public class Solution {
    public boolean hasCycle(ListNode head) {
       
       ListNode fast=head;
       ListNode slow=head;
       while(fast !=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            return true;
        }
       }
        return false;
    }
}