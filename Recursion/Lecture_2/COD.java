public class COD {

    static int countOfDigit(int num) {
        if (num < 0) {
            return 0;
        }
        if (num < 10) {
            return 1;
        }

        return countOfDigit(num / 10) + 1;

    }

    public static void main(String[] args) {

        System.out.println(countOfDigit(123456789));
    }
}
