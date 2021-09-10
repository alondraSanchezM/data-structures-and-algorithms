public class BinarySearchTree{
    private TreeNode root;

    public void insert(int data){
        if(root == null)
            this.root = new TreeNode(data);
        else 
            //search for the correct place to insert
            root.insert(data); 
    }

    public TreeNode find(int data){
        if(root != null)
            return root.find(data);

        return null;
    }

    public void delete(Integer data) {
		TreeNode current = this.root;
		TreeNode parent = this.root;
		boolean isLeftChild = false;

        //The tree is empty
		if (current == null)
			return; 

		while (current != null && current.getData() != data) {
			parent = current;
			if (data < current.getData()) {
				current = current.getLeftChild();
				isLeftChild = true;
			} else {
				current = current.getRightChild();
				isLeftChild = false;
			}
		}

        //If we don't found the node
		if (current == null)
			return;

		//Case 1: Node to be deleted is a leaf
		if (current.getLeftChild() == null && current.getRightChild() == null) {
			if (current == root) {
				root = null;
			} else {
				if (isLeftChild)
					parent.setLeftChild(null);
				else
					parent.setRightChild(null);
			}
		}
		
        //Case 2: Node to be deleated has one child
        //Current has a LeftChild
		else if (current.getRightChild() == null) {
			if (current == root) 
				root = current.getLeftChild();
			else if (isLeftChild) 
				parent.setLeftChild(current.getLeftChild());
			else
				parent.setRightChild(current.getLeftChild());
        //Current has a RightChild
		} else if (current.getLeftChild() == null) {
			if (current == root) 
				root = current.getRightChild();
			else if (isLeftChild) 
				parent.setLeftChild(current.getRightChild());
			else
				parent.setRightChild(current.getRightChild());
		}
		//Case 3: Node to be deleted has two childen
		else {
			TreeNode successor = getSuccessor(current);
			if (current == root)
				root = successor;
			else if (isLeftChild) 
				parent.setLeftChild(successor);
		    else 
				parent.setRightChild(successor);
			successor.setLeftChild(current.getLeftChild());
		}
	}

    private TreeNode getSuccessor(TreeNode node) {
		TreeNode parentOfSuccessor = node;
		TreeNode successor = node;
		TreeNode current = node.getRightChild();

		while (current != null) {
			parentOfSuccessor = successor;
			successor = current;
			current = current.getLeftChild();
		}
		if (successor != node.getRightChild()) {
			parentOfSuccessor.setLeftChild(successor.getRightChild());
			successor.setRightChild(node.getRightChild());
		}
		return successor;
	}

    public void traverseInOrder() {
		if (this.root != null)
			this.root.traverseInOrder();
		System.out.println();
	}

    public void traversePreOrder() {
		if (this.root != null)
			this.root.traversePreOrder();
		System.out.println();
	}

    public void traversePostOrder() {
		if (this.root != null)
			this.root.traversePostOrder();
		System.out.println();
	}

    public static void main(String[] args) {
		int[] sample = {234,23,67,3,26,86,45,77,1,4};
		BinarySearchTree bst = new BinarySearchTree();

		for (int x : sample) 
			bst.insert(x);

        bst.traverseInOrder();

        int n = 3;
        if(bst.find(n) == null)
		    System.out.println("The value isn't in the tree");
        else
            System.out.println("The value " + n + " is in the tree");
            
		bst.delete(77);
        
		bst.traverseInOrder();
        bst.traversePreOrder();
        bst.traversePostOrder();
	}
}