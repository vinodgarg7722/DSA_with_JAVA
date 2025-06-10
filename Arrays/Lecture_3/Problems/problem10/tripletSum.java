import java.util.Scanner;

public class tripletSum {
    static int tripletsum(int[] arr, int Target) {

        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) { // one number pick

            for (int j = i + 1; j < n; j++) {

                for (int k = j + 1; k < n; k++) {

                    if (arr[i] + arr[j] + arr[k] == Target) {
                        ans++;
                    }

                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter" + n + "elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target sum");
        int target = sc.nextInt();

        System.out.println(tripletsum(arr, target));
    }
}
