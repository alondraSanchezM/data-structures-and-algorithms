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
        int arrayB[] = b.bubbleSort(arr);

        SelectionSort s = new SelectionSort();
        int arrayS[] = s.selection(arr);  

        InsertionSort i = new InsertionSort();
        int arrayI[] = i.insertion(arr);

        System.out.println("\nThe sorted array with BubbleSort is:");
        printArray(arrayB);

        System.out.println("\nThe sorted array with SelectionSort is:");
        printArray(arrayS);

        System.out.println("\nThe sorted array with InsertionSort is:");
        printArray(arrayI);

    }
}