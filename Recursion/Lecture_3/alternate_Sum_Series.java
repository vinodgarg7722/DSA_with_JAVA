public class alternate_Sum_Series {
    static int series_sum(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return series_sum(n - 1) - n;
        } else {
            return series_sum(n - 1) + n;
        }

    }

    public static void main(String[] args) {
        System.out.println(series_sum(10));
    }

}
