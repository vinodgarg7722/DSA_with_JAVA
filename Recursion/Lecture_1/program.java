// package Lecture_1;
import java.util.Scanner;

public class program {

    static void PI(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }

        PI(n - 1);
        System.out.print(n);
    }

    static void DI(int n){
        if (n==1) {
            System.out.print(" "+n);
            return;
        }
        System.out.print(" "+n);
        DI(n-1);
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value of n:");
        int n = sc.nextInt();

        // PI(n);
        DI(n);

    }
}