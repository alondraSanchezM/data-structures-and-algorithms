public class DoubleLinkedList{
    private DoubleLinkedNode head;

    public void insertAtHead(int data){
        DoubleLinkedNode newNode = new DoubleLinkedNode(data);
        newNode.setNextNode(this.head);
        if(this.head != null){
            this.head.setLastNode(newNode);
        }
        this.head = newNode;
    }

    public int length(){
        if(head == null)
            return 0;
        int length = 0;
        DoubleLinkedNode current = this.head;

        while(current !=null){
            length++;
            current = current.getNextNode();
        }
        return length;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        DoubleLinkedNode current = this.head;

        while(current != null){
            sb.append("Node data");
            sb.append(current);
            sb.append("\n");

            current = current.getNextNode();
        }
        return sb.toString();
    }

}