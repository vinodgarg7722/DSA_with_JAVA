
import java.util.Scanner;

public class NonDecSquareArray {
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

    static void reverse(int[] ans){
        int i=0; 
        int j=ans.length-1;

        while (i<j) {
            Swap(ans, i, j);
            i++;
            j--;
        }
    }

    static int[]  sortSquares(int[] arr){

        int n = arr.length;
        int left = 0;
        int right = arr.length-1;
        int[] ans = new int[n];
        int k = 0;

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k] = arr[left]*arr[left];
                k++;
                left++;
            }else{
                ans[k++] = arr[right]*arr[right];
                right--;
            } 
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        printArray(arr);

        int[] ans = sortSquares(arr);
        System.out.println("Sorted Array");
        reverse(ans);
        printArray(ans);
}
}
