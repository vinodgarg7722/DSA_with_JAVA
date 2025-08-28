import java.util.Scanner;

public class fact_Recursive {
    static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Negative numbers not allowed!");
        } else {
            int result = fact(n);
            System.out.println("Factorial is: " + result);
        }
        sc.close();
    }
}