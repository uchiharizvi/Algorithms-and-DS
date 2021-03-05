package datastructures.problems.arrays.singledimension.sorting.quicksort;

import datastructures.problems.arrays.singledimension.sorting.Print;

import java.util.Random;
import java.util.Scanner;

/**
 * QuickSort-Recursive
 **/
public class QuickSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter size of Test case : ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int a = 0; a < size; a++) {
            arr[a] = rand.nextInt(1000);
        }
        System.out.println("Array : ");
        Print.printArray(arr);
        long start = System.currentTimeMillis();
        sort(arr, 0, arr.length - 1);
        long end = System.currentTimeMillis();
        System.out.println("Sorted : ");
        Print.printArray(arr);
        System.out.println("Time Taken : " + (end - start) + "ms");
    }

    private static void sort(int[] arr, int low, int high) {
        /**low - starting index
         * high - ending index**/
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);//Before pi
            sort(arr, pi + 1, high);//After pi
        }
    }

    /**
     * This function takes last element as pivot, places
     * the pivot element at its correct position in sorted
     * array, and places all smaller (smaller than pivot)
     * to left of pivot and all greater elements to right
     * of pivot
     **/
    private static int partition(int[] arr, int low, int high) {
        //Pivot element to be placed at right
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (arr[j] <= pivot) {
                i++;
                //swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap arr[i+1] and arr[high]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

}
