import java.util.Scanner;
import java.util.Arrays;

public class KthLargestSmallest {

    // static void smallestAndLargestElement(int[] arr){
    //     Arrays.sort(arr);
    //     for(int i = 0 ; i<arr.length ; i++ ){
    //         System.out.println(arr[i]);
    //     }

    // }

    static int[] smallestAndLargestElement(int[] arr, int k)
    {
        Arrays.sort(arr);
        int [] ans = {arr[k-1] , arr[arr.length-k]};
        
        return ans;
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

        // System.out.println("Enter x");
        // int x = sc.nextInt();

        // System.out.println("True -> array sorted | False -> array not sorted  : "+ isSorted(arr));

        // smallestAndLargestElement(arr);

        int k = 2 ;

        int[] ans = smallestAndLargestElement(arr,k);
        System.out.println("smallest:" + ans[0]);
        System.out.println("largest:" + ans[1]);
        

    }
    
}
