
public class fibbonacci {

    static int fib(int n){

        // base case

        // if (n==0) {
        //     return 0;
        // }

        // if (n==0) {
        //     return 1;
        // }


        if (n==0 || n ==1) {
            return n;
        }

        // subproblem - recursive work

        // int prev = fib(n-1);
        // int prevPrev = fib(n-2);

        // // self work

        // int ans = prev + prevPrev;

        // return ans;

        return fib(n-1)+fib(n-2);



    }
    public static void main(String[] args) {
        // System.out.println(fib(8));

        for (int i = 0 ; i <= 10 ; i++){
            System.out.print(" " + fib(i));
        }
    }
}
