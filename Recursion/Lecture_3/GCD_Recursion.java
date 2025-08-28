public class GCD_Recursion {
    static int gcd_recursion(int x,int y){

        if (y == 0) {
            return x;
        }

        return gcd_recursion(y,x%y);

        

    }
    public static void main(String[] args) {

        System.out.println(gcd_recursion(24, 15));
        System.out.println(gcd_recursion(3, 0));
        System.out.println(gcd_recursion(5, 7));
        
        int lcm=(24*15)/gcd_recursion(24,15);

        System.out.println("Lcm of 24 and 15 is :"+lcm);

        
    }
}
