//Java program implementation for Insertion Sort
class InsertionSort{
    int[] insertion(int a[]){
        int current, j;
        for (int i = 1; i < a.length; ++i){   
           current = a[i];
           j = i-1;
           while(j>=0 && a[j]>current){
               //si fuera a[j]>= current seria un ordenamiento inestable
               a[j+1] = a[j];
               j = j-1;
           }
           a[j+1] = current;
        }
        return a;
    }
}