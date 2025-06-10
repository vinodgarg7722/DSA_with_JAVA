import java.util.Scanner;

public class firstRepeatingNumber {

    // Method 1: Return the first repeating number (last seen among multiple)
    // static int repeatnumberMethod1(int[] arr) {
    //     int ans = -1;
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[i] == arr[j]) {
    //                 ans = arr[i];
    //                 break;
    //             }
    //         }
            
    //     }
    //     return ans;
    // }

    // Method 2: Return as soon as first repetition is found
    static int repeatnumberMethod2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call both methods
        // int res1 = repeatnumberMethod1(arr);
        int res2 = repeatnumberMethod2(arr);

        // System.out.println("Using Method 1: First Repeated Number is: " + (res1 != -1 ? res1 : "None"));
        System.out.println("Using Method 2: First Repeated Number is: " + (res2 != -1 ? res2 : "None"));
    }
}
