public class Main {
    public static void main(String[] args) {
        LinkedList LLt = new LinkedList();


        //Add nodes to the list
        LLt .addNode(8);
        LLt .addNode(10);
        LLt .addNode(12);
        LLt .addNode(16);
        LLt .addNode(9);
        LLt .addNode(14);

        //Display current list
        LLt .show();

        LLt .addBegining15);
        LLt .display();

        //Displays current list after removing
        System.out.println("\nList After node 9 has been deleted");
        LLt .clearNode(9);
        LLt .show();

        //Displays current after inserting 
        System.out.println("\nList after inserting 30 after node 10");
        LLt .insertAtEnd( LLt .head.next.next, 30);
        LLt .show();

        //Displays current after 
        LLt .insertAtEnd(45);
        LLt .display();


    }
}