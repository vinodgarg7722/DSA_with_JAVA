public class series_sum {

    static int printSum(int n){
        if (n==0) {
            return 0;
        }
        return printSum(n-1)+n;
    }
    public static void main(String[] args) {
        System.out.println(printSum(10));
    }
}
