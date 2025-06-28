
public class BubbleSort {

    static void bubblesort(int[] a) {

        int n = a.length;

        // n-1 iteration/passes
        for (int i = 0; i < n - 1; i++) { // i=0 to i=n-2
            for (int j = 0; j < n - i - 1; j++) {

                // last i elements are already at correct sorted positions so no need to check
                // them

                if (a[j] > a[j + 1]) {
                    // swap - a[j],a[j+1]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }
        }

    }

    public static void main(String[] args) {
        
        int[] a = {7,6,5,4,3};
        bubblesort(a);
        for(int i : a){
            System.out.print(i + " ");
        }
        
    }
}