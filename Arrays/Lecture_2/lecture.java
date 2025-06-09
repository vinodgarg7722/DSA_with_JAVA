import java.util.Arrays;
import java.util.Scanner;

/** 
 * public class lecture {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Enter Size of array u required");
 * 
 * int n = sc.nextInt();
 * int[] arr = new int[n];
 * 
 * System.out.println("Enter array Elements");
 * 
 * for(int i =0 ; i <arr.length;i++){
 * arr[i] = sc.nextInt();
 * }
 * 
 * System.out.println("\n ");
 * System.out.println("array elements are : ");
 * for(int i = 0 ; i<arr.length;i++){
 * System.out.println(arr[i]);
 * }
 * 
 * }
 * }
 * 
 */

/**
 * 
 * public class lecture {
 * 
 * static void printArray(int[] arr) {
 * for (int i = 0; i < arr.length; i++) {
 * System.out.print(arr[i] + " ");
 * }
 * System.out.println();
 * }
 * 
 * public static void main(String[] args) {
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * // System.out.println("Enter Size of array u required");
 * 
 * // int n = sc.nextInt();
 * 
 * int[] arr = new int[5];
 * 
 * // System.out.println("Enter array Elements");
 * 
 * // for (int i = 0; i < arr.length; i++) {
 * // arr[i] = sc.nextInt();
 * // }
 * 
 * arr[0] = 5;
 * arr[1] = 15;
 * arr[2] = 25;
 * arr[3] = 35;
 * arr[4] = 45;
 * 
 * System.out.println(" ");
 * 
 * // System.out.println("\n ");
 * System.out.println("Original Array:");
 * printArray(arr);
 * 
 * System.out.println(" ");
 * 
 * // trying to copy arr to arr_2
 * int[] arr_2 = arr;
 * System.out.println("copied Array:");
 * printArray(arr_2);
 * 
 * System.out.println(" ");
 * 
 * //changing some value of arr_2 :
 * arr_2[0] = 0;
 * arr_2[1] = 0;
 * 
 * System.out.println(" ");
 * 
 * // System.out.println("\n ");
 * System.out.println("Original Array after changing arr_2:");
 * printArray(arr);
 * 
 * System.out.println(" ");
 * 
 * // trying to copy arr to arr_2
 * 
 * System.out.println("copied Array after changing arr_2:");
 * printArray(arr_2);
 * 
 * System.out.println(" ");
 * 
 * }
 * }
 * 
 */

/** 
public class lecture {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    static void changeval(int a) {
        a = 1004;
    }

    public static void main(String[] args) {

        int a = 5;
        changeval(a);
        System.out.println(a); // 5 -> a's value is not change because of pass by value concept

        int[] arr = new int[3];

        arr[0] = 5;
        arr[1] = 15;
        arr[2] = 25;

        changeArray(arr);
        printArray(arr);

    }
}
*/

/**
 public class lecture {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    static void changeval(int a) {
        a = 1004;
    }

    public static void main(String[] args) {

        int a = 5;
        changeval(a);
        System.out.println("a after changeval(a): " + a); // Output: 5

        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 15;
        arr[2] = 25;

        // clone array
        int[] arr_2 = arr.clone();

        // change original array
        changeArray(arr);

        System.out.print("arr after changeArray: ");
        printArray(arr); // Output: 0 0 0

        System.out.print("arr_2 remains unchanged: ");
        printArray(arr_2); // Output: 5 15 25
    }
}

*/

/**
public class lecture {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    static void changeval(int a) {
        a = 1004;
    }

    public static void main(String[] args) {

        int a = 5;
        changeval(a);
        System.out.println("a after changeval(a): " + a); // Output: 5

        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 15;
        arr[2] = 25;

        // clone array
        int[] arr_2 = Arrays.copyOf(arr,arr.length);

        // change original array
        changeArray(arr);

        System.out.print("arr after changeArray: ");
        printArray(arr); // Output: 0 0 0

        System.out.print("arr_2 remains unchanged: ");
        printArray(arr_2); // Output: 5 15 25
    }
}

*/

public class lecture {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    static void changeval(int a) {
        a = 1004;
    }

    public static void main(String[] args) {

        int a = 5;
        changeval(a);
        System.out.println("a after changeval(a): " + a); // Output: 5

        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 15;
        arr[2] = 25;

        // clone array
        // int[] arr_2 = Arrays.copyOfRange(arr, 0, arr.length);
        int[] arr_2 = Arrays.copyOfRange(arr, 0, 2);

        // change original array
        changeArray(arr);

        System.out.print("arr after changeArray: ");
        printArray(arr); // Output: 0 0 0

        System.out.print("arr_2 remains unchanged: ");
        printArray(arr_2); // Output: 5 15 25
    }
}
