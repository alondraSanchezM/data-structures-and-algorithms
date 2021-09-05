
class Node{
    private int data;
    private Node nextNode;

    public Node(int data){
        this.data = data;
    }

    public int getData(){
        return this.data;
    }

    public Node getNextNode(){
        return this.nextNode;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }

    public String toString(){
        return "Data: " + this.data;
    }
}

//https://practice.geeksforgeeks.org/explore/?company%5B%5D=Oracle&company%5B%5D=IBM&company%5B%5D=Intel&page=1&company%5B%5D=Oracle&company%5B%5D=IBM&company%5B%5D=Intel