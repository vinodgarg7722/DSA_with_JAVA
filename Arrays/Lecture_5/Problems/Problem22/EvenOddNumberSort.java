import java.util.Scanner;

public class EvenOddNumberSort {
    static void printArray(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void Swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortArrayByParity(int[] arr){

        int left = 0;
        int right = arr.length-1;

        while (left<right) {
            if (arr[left] % 2  == 1  && arr[right] % 2 == 0) {
                Swap(arr, left, right);
                left++;
                right--;
            }
            
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
                right--;
            }
        }
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

        System.out.println("Original array:");
        printArray(arr);

        sortArrayByParity(arr);
        System.out.println("Sorted Array");
        printArray(arr);
}
}
