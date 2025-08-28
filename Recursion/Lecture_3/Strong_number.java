public class Strong_number {

    // Function to calculate factorial
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return  fact(n - 1)*n;
    }

    // Function to calculate sum of factorials of digits
    static int strong(int num) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        return fact(digit) + strong(num / 10);
    }

    public static void main(String[] args) {
        int num = 145;  // Example number
        int result = strong(num);

        if (result == num) {
            System.out.println(num + " is a Strong number");
        } else {
            System.out.println(num + " is NOT a Strong number");
        }
    }
}
