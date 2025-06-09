// Create the sum of all elements in the given array
// Input : arr[] = {1,5,3}
// Output : 9

package Lecture_1.problems.problem1;

class Innerproblem1 {

    // 1. Method that takes an array and returns sum
    int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // 2. Method that has its own array and directly prints the sum
    void sumOfArray() {
        int[] arr = {1, 4, 5, 6, 1};
        int sum = 0;
        for (int i = 0 ; i < arr.length ; i++) {
            sum += arr[i];
        }
        System.out.println("Sum (from internal array): " + sum);
    }
}

public class problem1 {
    public static void main(String[] args) {
        Innerproblem1 obj = new Innerproblem1();

        int[] arr = {1, 5, 3}; // Input array
        int result = obj.sumArray(arr); // Call method with external array
        System.out.println("Sum of array elements: " + result); // Output: 9

        obj.sumOfArray(); // Call method that uses internal array
    }
}
