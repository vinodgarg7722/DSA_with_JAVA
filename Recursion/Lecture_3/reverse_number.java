public class reverse_number {
    public static void rev_num(int num)
    {
        // base condition to end recursive calls
        if (num < 10) {
            System.out.println(num);
            return;
        }
        else {
            // print the unit digit of the given number
            System.out.print(num % 10);
            // calling function for remaining number other than unit digit
            rev_num(num/10);
        }
    }
    public static void main(String[] args) {
        rev_num(1234);
    }
}
