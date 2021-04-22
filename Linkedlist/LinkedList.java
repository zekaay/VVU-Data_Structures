public class LinkedList {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    Node head = null;
    Node tail = null;


    //addNode() will add a new node to the list
    public void putNode(int data) {
        //Create a new node
        Node freshNode = new Node(data);



        //Checks if the list is empty
        if(head == null) {
            //point head and tail to fresh node when list is empty
            head = freshNode;
            tail = freshNode;
        }
        else {
            
            tail.next = freshNode;
            //freshNode will become new tail of the list
            tail = freshNode;
        }
    }
    //add a new node to the beginning of the list
    public void addBegining(int data) {
        //Create a new node
        Node freshNode = new Node(data);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = freshNode;
            tail = freshNode;
        }
        else {
            //Node temp will point to head
            Node temp = head;
            //freshNode will become new head of the list
            head = freshNode;
            //Node temp(previous head) will be added after new head
            head.next = temp;
        }
    }
    / will display all the nodes 
    public void Show() {
        // point to head
         Node current= head;

        if(head == null) {
            System.out.println("You have an empty list");
            return;
        }
        System.out.println("The nodes in the Linked list are: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(initial.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void push(int newdata){
        Node freshnode =new Node(newdata);
        freshnode.next=head;
        head=freshnode;
    }
    public void insertAfter(Node previousnode, int data){

        if(previousnode ==null){
            System.out.println("The Node must not be empty");
            return;
        }
        Node freshnode=new Node(data);
        freshnode.next=prevnode.next;
        prevnode.next=freshnode;

    }

    public void clearNode(int key)
    {
        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    public void insertAtEnd(int data){

        Node new_node = new Node(data);

        if (head == null) {
            head = new Node(data);
            return;
        }

        new_node.next = null;

        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = new_node;

    }
}