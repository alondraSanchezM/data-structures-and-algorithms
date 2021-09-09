//Java program implementation for Merge Sort
public class MergeSort{

    int[] mSort(int[] data) {
		mergeSort(data, 0, data.length-1);
        return data;
	}	

    private void mergeSort(int a[], int start, int end){
        if(start<end){
            int middle = (int) Math.floor((start+end)/2);
            mergeSort(a,start,middle);
            mergeSort(a,middle+1,end);
            merge(a,start,middle,end);
        }
    }

    private void merge(int[] data, int start, int mid, int end) {
		int sizeOfLeft = mid-start+1;
		int sizeOfRight = end - mid;
		int[] left = new int[sizeOfLeft];
		int[] right = new int[sizeOfRight];

		for (int i = 0; i < sizeOfLeft; i++) 
			left[i] = data[start + i]; 
		for (int j = 0; j < sizeOfRight; j++) 
			right[j] = data[mid + 1 + j];
		
		int i = 0, j = 0;

		for (int k = start; k <= end; k++) {
			if ((j >= sizeOfRight) || (i < sizeOfLeft && left[i] <= right[j])) {
				data[k] = left[i];
				i++;
			} else {
				data[k] = right[j];
				j++;
			}
		}
    }
}
