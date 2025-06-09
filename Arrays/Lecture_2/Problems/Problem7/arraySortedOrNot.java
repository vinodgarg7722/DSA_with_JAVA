import java.util.Scanner;

public class arraySortedOrNot {

    static boolean isSorted(int[] arr){
        boolean check = true;

        for(int i = 1 ; i < arr.length;i++){
            /*
             i = 0
             arr[0] < arr[-1]
             therefore int i = 1
             */
            if(arr[i] < arr[i-1]){
                //not sorted
                check =false;
                break;
            }
        }

        return check;
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

        System.out.println("True -> array sorted | False -> array not sorted  : "+ isSorted(arr));

    }
    
}
