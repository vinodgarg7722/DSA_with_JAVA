// Q4. Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method
// for calculating the minimum element.
// Output:
// -4

import java.util.*;

public class problem4 {

    static void min() {

        Integer[] arr = { 2, -3, 5, 8, 1, 0, -4 };

        List<Integer> list = Arrays.asList(arr);

        int min = Collections.min(list);

        System.out.println("Minimum element: " + min); // Output: -4
    }

    public static void main(String[] args) {

        min();

    }
}
