public class DoubleLinkedNode{
    private int data;
    private DoubleLinkedNode nextNode;
    private DoubleLinkedNode lastNode;

    public DoubleLinkedNode(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }

    public DoubleLinkedNode getNextNode(){
        return nextNode;
    }

    public DoubleLinkedNode getLastNode(){
        return lastNode;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setNextNode(DoubleLinkedNode nextNode){
        this.nextNode = nextNode;
    }

    public void setLastNode(DoubleLinkedNode lastNode){
        this.lastNode = lastNode;
    }

    public String toString(){
        return " " + this.data;
    }
}