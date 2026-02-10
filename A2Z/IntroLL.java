
class Main {
    public static void LLPrint(Node head){
    Node temp=head;
        while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
       

          }
    System.out.println("null");
    
      }

    public static int SearchLL(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
       Node node1=new Node("chinnu");
       Node node2=new Node("DSA");
       Node node3=new Node("Lets ");
       Node node4=new Node("Learn");
       node1.next=node2;
       node2.next=node3;
       node3.next=node4;
       

       Node head=node1;
       
       
    //    System.out.println(head.data);
    //     System.out.println(head.next.data);
    //     System.out.println(head.next.next.data);

    Node temp=head;
    // System.out.println(temp.data);
    // temp=temp.next;
    // System.out.println(temp.data);
    // temp=temp.next;
    // System.out.println(temp.data);
    // for(int i=0;i<3;i++){
    //     System.out.println(temp.data);
    //      temp=temp.next;
    // }
    LLPrint(head);
    System.out.println("Length or LL is:"+SearchLL(head));


    }
}
class Node{
    String data;
    Node next;
    Node(String data){
        this.data=data;
        this.next=null;
    }
}