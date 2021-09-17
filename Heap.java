import java.util.Arrays;

// Heap using arrays
public class Heap{
	private Integer[] heapData;
	private int currentPosition = -1;
	
	public Heap(int size) {
		this.heapData = new Integer[size];
	}
	
	//Time Complexity O(log n)
	public void insert(int item) {
		if (isFull()) 
			throw new RuntimeException("Heap is full");
		this.heapData[++currentPosition] = item;
		fixUp(currentPosition);
	}
	
	//Time Complexity O(log n)
	public int deleteRoot() {
		int result = heapData[0];
		heapData[0] = heapData[currentPosition--];
		heapData[currentPosition+1] = null;
		fixDown(0, -1);
		return result;
	}
	
	private void fixDown(int index, int upto) {
		if (upto < 0) upto = currentPosition;
		while (index <= upto) {
			int leftChild = 2 * index + 1;
			int rightChild = 2 * index + 2;
			if (leftChild <= upto) {
				int childToSwap;
				if (rightChild > upto)
					childToSwap = leftChild;
				else
					childToSwap = (heapData[leftChild] > heapData[rightChild]) ? leftChild : rightChild;
				
				if (heapData[index] < heapData[childToSwap]) {
					int tmp = heapData[index];
					heapData[index] = heapData[childToSwap];
					heapData[childToSwap] = tmp;
				} else 
					break;

				index = childToSwap;
			} else 
				break;
		}
	}
	
	private void fixUp(int index) {
		int i = (index-1)/2; 
		while (i >= 0 && heapData[i] < heapData[index]) {
			int tmp = heapData[i];
			heapData[i] = heapData[index];
			heapData[index] = tmp;
			index = i;
			i = (index-1)/2;
		}
	}
	
	private boolean isFull() {
		return currentPosition == heapData.length-1;
	}
	
	//Time Complexity O(n log n)
	public void heapSort() {
		for (int i=0; i < currentPosition; i++) {
			int tmp = heapData[0]; // max element
			heapData[0] = heapData[currentPosition-i]; // bring last element to the root
			heapData[currentPosition-i] = tmp; // put max at the last of unsorted part
			fixDown(0, currentPosition-i-1);
		}
	}
	
	@Override
	public String toString() {
		return Arrays.deepToString(this.heapData);
	}
	
	public static void main(String[] args) {
		Heap heap = new Heap(10);
		heap.insert(30);
		heap.insert(55);
		heap.insert(57);
		heap.insert(78);
		heap.insert(18);
		heap.insert(3);
		heap.insert(58);
		heap.insert(24);

		heap.heapSort();
		System.out.println(heap);

		System.out.println(heap.deleteRoot());

		heap.heapSort();
		System.out.println(heap);
	}
}
