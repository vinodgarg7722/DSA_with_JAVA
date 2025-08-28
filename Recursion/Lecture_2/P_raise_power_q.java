public class P_raise_power_q {

    static int P_raisepower_q(int x, int y) {

        if (y == 0) {
            return 1;
        }

        return P_raisepower_q(x, y - 1) * x;
    }

    public static void main(String[] args) {
        System.out.println(P_raisepower_q(2, 3));
    }
}
