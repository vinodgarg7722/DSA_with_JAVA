public class Armstrong_number {

    static int arm(int num) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        return (digit * digit * digit) + arm(num / 10); 
    }

    public static void main(String[] args) {
        int num = 153;  
        int result = arm(num);

        if (result == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is NOT an Armstrong number");
        }
    }
}
