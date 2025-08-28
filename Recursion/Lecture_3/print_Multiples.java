
public class print_Multiples {
    static void print_multiples(int p,int k){
        if (k==1) {
            System.out.println(p);
            return;
        }

        print_multiples(p,k-1);
        System.out.println(p*k);

    }

    public static void main(String[] args) {
        print_multiples(5, 4);
    }
}
