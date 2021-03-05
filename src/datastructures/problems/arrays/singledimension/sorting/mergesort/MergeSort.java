package datastructures.problems.arrays.singledimension.sorting.mergesort;

import java.util.Random;
import java.util.Scanner;

/**
 * Merge MergeSortGeeks Example
 **/
public class MergeSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter size of Test case : ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int a = 0; a < size; a++) {
            arr[a] = rand.nextInt(size);
        }
        System.out.println("Array : ");
        printArray(arr);
        MergeSort mergeSort = new MergeSort();

        mergeSort.sort(arr, 0, arr.length - 1);
        System.out.println("Sorted : ");
        printArray(arr);
    }

    private void sort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int m = left + (right - left) / 2;
            // Sort first and second halves
            sort(arr, left, m);
            sort(arr, m + 1, right);
            // Merge the sorted halves
            merge(arr, left, m, right);
        }
    }

    /**
     * // Merge two sub arrays L and M into arr
     **/
    private static void merge(int[] arr, int left, int middle, int right) {
        //Create L ← A[p..q] and M ← A[q+1..r]
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] L = new int[n1];
        int[] M = new int[n2];

        for (int i = 0; i < n1; ++i) L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j) M[j] = arr[middle + 1 + j];

        //Maintain current index of sub-arrays and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = left;

        // Until we reach either end of either L or M, pick larger among
        //elements L and M and place them in the correct position at A[p..r]
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = M[j];
                j++;
            }
            k++;
        }
        // When we run out of elements in either L or M,
        // pick up the remaining elements and put in A[p..r]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = M[j];
            j++;
            k++;
        }
    }

    // Print the array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
