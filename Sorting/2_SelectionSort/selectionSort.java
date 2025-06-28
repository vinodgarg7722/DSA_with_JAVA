

public class selectionSort {

    static void selectionsort(int arr[]){
        int n  = arr.length;

        for(int i=0 ; i < n-1; i++){ // i represent the current index
            int min_index = i;


            // Find the minimum element in unsorted part of array
            for(int j = i+1 ; j < n-1; j++){

                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }

            }
            // Swap current element and minimum element -> current index i will have correct element 
            // a[min_index],a[i]
           
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

        }
    }
    public static void main(String[] args) {
        
        int [] arr = {7,4,5,1,3,2};
        selectionsort(arr);
        for(int i=0 ; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
