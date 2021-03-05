package datastructures.problems.arrays.singledimension.searching;

import datastructures.problems.arrays.singledimension.sorting.Print;
import datastructures.problems.arrays.singledimension.sorting.quicksort.QuickSort;

import java.util.Random;
import java.util.Scanner;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter size of Test case : ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int a = 0; a < size; a++) {
            arr[a] = rand.nextInt(100);
        }
        System.out.println("Array : ");
        Print.printArray(arr);
        System.out.println("Enter Value to Search : ");
        int value = scan.nextInt();
        QuickSort sort = new QuickSort();
        sort.sort(arr,0,arr.length-1);
        int result = binarySearch(arr, 0, arr.length - 1, value);
        String place = String.valueOf(result);
        if (result > 0) System.out.println("The value is present at " + place + " position");
        else System.out.println("Value is non existent");
    }

    private static int binarySearch(int[] arr, int left, int right, int value) {
        if (right >= left) {
            int interval = left + (right - left) / 2;
            if (arr[interval] == value) return interval;
            //recursive functions
            if (arr[interval] > value) return binarySearch(arr, left, interval - 1, value);
            return binarySearch(arr, interval + 1, right, value);
        }
        return -1;
    }

}
