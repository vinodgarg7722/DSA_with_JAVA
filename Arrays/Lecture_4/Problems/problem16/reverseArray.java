// import java.util.Scanner;
// import java.util.Arrays;

// public class reverseArray {
//     static int[] reversearray(int arr[]) {
//         int n = arr.length;
//         int[] rev_arr = new int[n];
//         int j = 0;

//         for(int i = n - 1; i >= 0; i--) {
//             rev_arr[j++] = arr[i];
//         }

//         return rev_arr;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter size of the array:");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter the elements:");
//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println();

//         System.out.println("Original array: " + Arrays.toString(arr));
//         System.out.println("Reversed array: " + Arrays.toString(reversearray(arr)));

//         sc.close();
//     }
// }

// public class reverseArray {
//     static int[] reversearray(int arr[]) {
//         int n = arr.length;
//         int[] rev_arr = new int[n];
//         int j = 0;

//         for(int i = n - 1; i >= 0; i--) {
//             rev_arr[j++] = arr[i];
//         }

//         return rev_arr;
//     }

//     static void printArray(int[] arr){
//         for(int i=0 ; i<arr.length ; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println(" ");
//     }

//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5};
//         int[] ans = reversearray(arr);
//         printArray(arr);
//         printArray(ans);

//     }
// }

// public class reverseArray {
//     static int[] reversearray(int arr[]) {
//         int n = arr.length;
//         int[] rev_arr = new int[n];
//         int j = 0;

//         // for(int i = n - 1; i >= 0; i--) {
//         //     rev_arr[j++] = arr[i];
//         // }

//         int i = n-1;
//         while (i>=0) {
//             rev_arr[j++] = arr[i--];
//         }

//         return rev_arr;
//     }

//     static void printArray(int[] arr){
//         for(int i=0 ; i<arr.length ; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println(" ");
//     }
//      public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5};
//         int[] ans = reversearray(arr);
//         printArray(arr);
//         printArray(ans);

//     }
// }

public class reverseArray {

    static void swapInArray(int[]arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;
    }
    static void reversearray(int arr[]) {
        
        int i = 0 , j = arr.length-1;

        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }


    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        printArray(arr);

        reversearray(arr);
       
        printArray(arr);

    }
}
