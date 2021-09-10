public class TreeNode{
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data){
        this.data = data;
    }

    public TreeNode find(int data) {
		if (this.data == data)
			return this;
		if (data < this.data && leftChild != null)
			return leftChild.find(data);
		if (rightChild != null)
			return rightChild.find(data);
		return null;
	}

	public void insert(int data) {
		if (data >= this.data) { // insert in right subtree
			if (this.rightChild == null)
				this.rightChild = new TreeNode(data);
			else
				this.rightChild.insert(data);
		} else { // insert in left subtree
			if (this.leftChild == null)
				this.leftChild = new TreeNode(data);
			else
				this.leftChild.insert(data);
		}
	}

    public void traverseInOrder() {
		if (this.leftChild != null)
			this.leftChild.traverseInOrder();
		System.out.print(this + " ");
		if (this.rightChild != null)
			this.rightChild.traverseInOrder();
	}

    public void traversePreOrder() {
        System.out.print(this + " ");
		if (this.leftChild != null)
			this.leftChild.traversePreOrder();
		if (this.rightChild != null)
			this.rightChild.traversePreOrder();
	}

    public void traversePostOrder() {
		if (this.leftChild != null)
			this.leftChild.traversePostOrder();
		if (this.rightChild != null)
			this.rightChild.traversePostOrder();
        System.out.print(this + " ");
	}

    public int getData(){
        return data;
    }

    public TreeNode getLeftChild(){
        return leftChild;
    }

    public TreeNode getRightChild(){
        return rightChild;
    }

    public void setLeftChild(TreeNode leftChild){
        this.leftChild = leftChild;
    }

    public void setRightChild(TreeNode rightChild){
        this.leftChild = leftChild;
    }

	public String toString() {
		return String.valueOf(this.data);
	}

}