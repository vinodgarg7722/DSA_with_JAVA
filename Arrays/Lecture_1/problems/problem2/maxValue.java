class ArrayExample {
    void maxValue() {
        int[] arr = {10, 5, 3, 6, 2, 8};
        int ans = arr[0]; // Better: start from first element instead of 0

        for (int i = 1; i < arr.length; i++) {
            if (ans < arr[i]) {
                ans = arr[i];
            }
        }

        System.out.println("Maximum value in array is: " + ans);
    }
}

public class maxValue {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.maxValue();
    }
}
