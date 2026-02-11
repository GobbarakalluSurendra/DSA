class Main {

    // Global head declaration
    static Node head;

    // Print Linked List
    public static void LLPrint() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Count nodes in Linked List
    public static int SearchLL() {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Search element in Linked List
    public static int search(String key) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data.equals(key)) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }

    // Insert at End
    public static void InsertAtEnd(String key) {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(key);
    }

    // Insert at Start
    public static void addAtStart(String key) {
        Node newnode = new Node(key);
        newnode.next = head;
        head = newnode;
    }

    // Insert at Middle (by index)
    public static void addAtMiddle(String data, int index) {

        if (index == 0) {
            addAtStart(data);
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node newnode = new Node(data);
        newnode.next = temp.next;
        temp.next = newnode;
    }
    //Deletion At start
    public static void DeleteAtStart(){
        if(head==null){
        return ;
        }
       
        if(head.next!=null)
        head=head.next;
    }
    //Delete at End
    public static void DeleteAtEnd(){
        Node temp=head;
        if(temp==null){
            return;
        }
        if(temp.next==null){
            temp=null;
            return;
        }
        while(temp.next!=null && temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    //Delete at Specific Position
    public static void DeleteAtIndex(int targetindex){
        if(targetindex==0){
            DeleteAtStart();
            return;
        }
        if(head==null){
            return;
        }
        if(targetindex<0 ||head==null){
            return;
        }
        Node temp=head;
        for(int i=0;i<targetindex-1;i++){
            temp=temp.next;
            if(temp.next==null){
                return;
            }
        }
        temp.next=temp.next.next;
    }
    //Delete By Value
    public static void deleteByValue(String key) {

    // Case 1: empty list
    if (head == null) {
        return;
    }

    // Case 2: value at first node
    if (head.data.equals(key)) {
        head = head.next;
        return;
    }

    // Case 3: search in rest of list
    Node temp = head;

    while (temp.next != null && !temp.next.data.equals(key)) {
        temp = temp.next;
    }

    // value not found
    if (temp.next == null) {
        System.out.println("Value not found in Linked List");
        return;
    }

    // delete node
    temp.next = temp.next.next;
}
    //Reverse a linked list
    public static void reverseLL() {

    Node prev = null;
    Node curr = head;
    Node next = null;

    while (curr != null) {

        next = curr.next;   // store next node
        curr.next = prev;   // reverse link
        prev = curr;        // move prev forward
        curr = next;        // move curr forward
    }

    head = prev;   // update head
}


    public static void main(String[] args) {

        // Creating nodes
        Node node1 = new Node("chinnu");
        Node node2 = new Node("DSA");
        Node node3 = new Node("Lets");
        Node node4 = new Node("Learn");

        // Linking nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Assign head
        head = node1;

        // Print initial list
        System.out.println("Initial Linked List:");
        LLPrint();

        // Length
        System.out.println("Length of LL: " + SearchLL());

        // Search element
        System.out.println("Search 'chinnu' at index: " + search("chinnu"));

        // Insert at end
        InsertAtEnd("Kick");
        System.out.println("After inserting at end:");
        LLPrint();

        // Insert at start
        addAtStart("JAVA");
        System.out.println("After inserting at start:");
        LLPrint();

        // Insert at middle
        addAtMiddle("Hello", 2);
        System.out.println("After inserting at middle:");
        LLPrint();

        //Delete At start
        DeleteAtStart();
        System.out.println("After Delete At Start:");
        LLPrint();

         //Delete At End
        DeleteAtEnd();
        System.out.println("After Delete At End:");
        LLPrint();

        //Delete at Specific Position
        DeleteAtIndex(2);
        System.out.println("After Delete At SPecific index:");
        LLPrint();

        //Delete By Value
        deleteByValue("chinnu");
        System.out.println("After Delete BY Value:");
        LLPrint();

        //Reverse a linked list
        reverseLL();
        System.out.println("After Reversing a linked list:");
        LLPrint();




    }
}

// Node class
class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}
