class Main {

    public static void LLPrint(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static int SearchLL(Node head) {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
    public static int search(Node head,String key){
        Node temp=head;
        int index=0;
        while(temp!=null){
            if(temp.data.equals(key)){
                return index;
            }
            index=index+1;
            temp=temp.next;
        }
        return -1;
    }
    public static void main(String[] args) {

        Node node1 = new Node("chinnu");
        Node node2 = new Node("DSA");
        Node node3 = new Node("Lets ");
        Node node4 = new Node("Learn");

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Node head = node1;

        LLPrint(head);
        System.out.println("Length of LL is: " + SearchLL(head));
        System.out.println("Serach Operations:"+search(head, "chinnu"));
    }
}

class Node {

    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}
