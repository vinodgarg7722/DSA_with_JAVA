
class swapNumbers {

    static void swap(int a, int b) {
        System.out.println("Original values before swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        int temp = a; // temp = 9
        a = b; // a=3
        b = temp; // b=9

        System.out.println("Original values after swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {

        int a = 9;
        int b = 3;

        swap(a, b);

    }
}