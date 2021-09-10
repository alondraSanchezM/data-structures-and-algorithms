//Java program implementation for Counting Sort
public class CountingSort {

	public int[] countingSort(int[] data) {
		int[] temp = new int[11];

		//Populate the temp array
		for (int i = 0; i < data.length; i++) { 
			temp[data[i]] = temp[data[i]] + 1;
		}

		int curr = 0;

		for (int i = 0; i < temp.length; i++) { // k iterations
			for (int j = 0; j < temp[i]; j++) { // n/k iterations for each (avg)
				data[curr] = i;
				curr++;
			}
		}
		return data;
	}
}
