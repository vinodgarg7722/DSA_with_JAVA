
public class lexicographicalOrderStrings {

    static void sortFruits(String arr[]){
        int n  = arr.length;

        for(int i=0 ; i < n-1; i++){ // i represent the current index
            int min_index = i;


            // Find the minimum element in unsorted part of array
            for(int j = i+1 ; j < n; j++){

                if (arr[j].compareTo(arr[min_index]) < 0) {
                    min_index = j;
                }

            }
            // Swap current element and minimum element -> current index i will have correct element 
            // a[min_index],a[i]
           
            String temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

        }
    }
    public static void main(String[] args) {
        
        String [] arr = {"kiwi","apple","papaya","mango"};
        sortFruits(arr);
        for(int i=0 ; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
