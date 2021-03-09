package datastructures.problems.arrays.singledimension.searching.linear;

import datastructures.problems.arrays.singledimension.sorting.Print;

import java.util.Random;
import java.util.Scanner;

/**
 * if element Found at last  O(n) to O(1)
 * if element Not found O(n) to O(n/2)
 **/
public class LinearSearchImproved {
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
        int result = search(arr, value);
        int place = result+1;
        if (result > 0) System.out.println("The value is present at " + place + " position");
        else System.out.println("Value is non existent");
    }

    private static int search(int[] arr, int searchValue) {
        /**Improvements**/
        int left = 0;
        int len = arr.length;
        int right = len - 1;
        int position = -1;
        //loop from left to right
        while(left<right){
            if (arr[left] == searchValue) return left;
            if(arr[right] == searchValue) return right;
            left++;
            right--;
        }
        return position;
    }
}
