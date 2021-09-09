public class SortingAlgorithms{

    private static void printArray(int array[]){
        for(int i=0; i<array.length; i++)
            System.out.print(array[i]+" ");
    }

    public static void main(String[] args) {
        int arr[] = {5,2,6,8,1,4};

        System.out.println("The unsorted array is:");
        printArray(arr);

        //Time Complexity: O(n^2).

        BubbleSort b = new BubbleSort();
        System.out.println("\nThe sorted array with BubbleSort is:");
        printArray(b.bubbleSort(arr.clone()));
        
        SelectionSort s = new SelectionSort();
        System.out.println("\nThe sorted array with SelectionSort is:");
        printArray(s.selection(arr.clone()));

        InsertionSort i = new InsertionSort();
        System.out.println("\nThe sorted array with InsertionSort is:");
        printArray(i.insertion(arr.clone()));

        //Time Complexity: O(n log n)

        MergeSort m = new MergeSort();
        System.out.println("\nThe sorted array with MergeSort is:");
		printArray(m.mSort(arr.clone()));
    }
}