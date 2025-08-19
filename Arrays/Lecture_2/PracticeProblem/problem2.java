public class problem2 {

    static boolean isPresent(int[] arr, int size, int key) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) return true;
        }
        return false;
    }

    static void findUnionCount(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] union = new int[n + m]; // max possible size
        int index = 0;

        // Step 1: Add all elements of a[]
        for (int i = 0; i < n; i++) {
            if (!isPresent(union, index, a[i])) {
                union[index++] = a[i];
            }
        }

        // Step 2: Add elements of b[] if not already present
        for (int i = 0; i < m; i++) {
            if (!isPresent(union, index, b[i])) {
                union[index++] = b[i];
            }
        }

        // Print the count of union
        System.out.println("Number of elements in union: " + index);

        // (Optional) Print union elements
        System.out.print("Union elements: ");
        for (int i = 0; i < index; i++) {
            System.out.print(union[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3};

        findUnionCount(a, b);

        int[] a2 = {10, 20, 30};
        int[] b2 = {20, 30, 40, 50};

        findUnionCount(a2, b2);
    }
}
