class swapNumberWithoutTemp {

    static void swap(int a, int b) {
        System.out.println("Original values before swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        a=a+b;
        b=a-b;
        a=a-b;

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