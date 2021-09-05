//Java program implementation for Selection Sort
class SelectionSort{
    int[] selection(int a[]){
        //Recorre el algoritmo marcando el min valor
        for (int i = 0; i < a.length-1; i++){   
            int min = i;
            for (int j = i+1; j < a.length; j++)
                if (a[j] < a[min])
                 min = j;
 
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;   
        }
        return a;
    }
}