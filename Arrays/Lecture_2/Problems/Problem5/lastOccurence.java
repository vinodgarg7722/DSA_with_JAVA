5
import java.util.Scanner;

public class lastOccurence {
    static int lastOccurence(int[] arr, int x) {

        int lastindex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastindex = i;
            }
        }

        return lastindex;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n (size of element want) : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + "elements: ");
        for(int i= 0 ; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter x");
        int x = sc.nextInt();

        System.out.println("LastOccurence of X: "+ lastOccurence(arr, x));

    }
}
