public class GCD_WhileLoop {

    static int gcd(int x , int y){
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }

        return y;
    }
    public static void main(String[] args) {
        int x=17;
        int y=13;

        System.out.println(gcd(x, y));

    }
}
 