public class LinkedListDemo{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
    
        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(2);
        list.insertAtHead(12);
        list.insertAtHead(19);
        list.insertAtHead(20);

        list.deleteFromHead();

        System.out.println(list);
        System.out.println("There are " + list.length() + " nodes in this Linked List");

        System.out.println("Found "+list.find(2));
        System.out.println("Found "+list.find(1));

    }
}