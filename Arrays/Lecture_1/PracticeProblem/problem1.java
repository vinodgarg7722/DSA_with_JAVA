// Q1. Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array.
// Output:
// 2
// 6
// 0
// 4


public class problem1 {
    public static void main(String[] args) {

        int arr[] = { 2, 6, -5, -1, 0, 4, -9 };

        for (int val : arr) {
            if (val >= 0) {
                System.out.println(val);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                System.out.println(arr[i]);
            }
        }

        // int i = arr.length;
        // while (i > 0) {
        //     if (arr[i] >= 0) {
        //         System.out.println(arr[i]);

        //     }
        //     i++;
        // }
    }
}