public class LinkedList{
    private Node head;

    //Insert a new Node at the head is 0(n)
    public void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    //Length of a linkedlist
    public int length(){
        int length = 0;
        Node current = this.head;

        while(current !=null){
            length++;
            current = current.getNextNode();
        }
        return length;
    }

    //Deleting the head node
    public void deleteFromHead(){
        this.head = this.head.getNextNode();
    }

    //Searching an item 
    public Node find(int data){
        Node current = this.head;

        while(current!=null){
            if(current.getData() == data){
                return current;
            }
            current = current.getNextNode();
        }
        return null;
    }

    public String toString(){
        String result = "{";
        Node current = this.head;

        while(current !=null){
            result += current.toString() + ",";
            current = current.getNextNode();
        }

        result +="}";
        return result;
    }
}