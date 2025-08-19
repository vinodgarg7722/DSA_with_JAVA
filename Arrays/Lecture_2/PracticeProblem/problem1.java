// // package DSA_with_JAVA.Arrays.Lecture_2.PracticeProblem;
import java.util.*;
import java.util.Scanner;

// Q1 - Given an unsorted array arr[] of size N having both negative and positive integers, place
// all negative elements at the end of array without changing the order of positive elements
// and negative elements

// N = 8
// arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
// 1 3 2 11 6 -1 -7 -5

// N = 4
// arr[] = {-3, -1, 0, -7}
// 0 -3 -1 -7


public class problem1 {

    static void relativeSortedArray(){
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6};
        int n = arr.length;

        int[] positive = new int[n];
        int[] negative = new int[n];
        int posIndex = 0, negIndex = 0;

        // Separate positives and negatives
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positive[posIndex++] = arr[i];
            } else {
                negative[negIndex++] = arr[i];
            }
        }

        // Combine back into original array
        int index = 0;
        for (int i = 0; i < posIndex; i++) {
            arr[index++] = positive[i];
        }
        for (int i = 0; i < negIndex; i++) {
            arr[index++] = negative[i];
        }

        // Print result
        System.out.println("Output:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        relativeSortedArray();
    }
}
