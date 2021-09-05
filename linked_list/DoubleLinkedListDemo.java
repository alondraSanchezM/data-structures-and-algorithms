public class DoubleLinkedListDemo{
    public static void main(String[] args) {
        DoubleLinkedList dLl = new DoubleLinkedList();

        dLl.insertAtHead(5);
        dLl.insertAtHead(10);
        dLl.insertAtHead(2);
        dLl.insertAtHead(13);
        dLl.insertAtHead(23);

        System.out.println(dLl);
    }
}