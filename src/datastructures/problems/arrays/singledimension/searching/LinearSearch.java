package datastructures.problems.arrays.singledimension.searching;

import datastructures.problems.arrays.singledimension.sorting.Print;

import java.util.Random;
import java.util.Scanner;
/**The time complexity of the above algorithm is O(n). **/
public class LinearSearch {
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
        String place = String.valueOf(result);
        if(result >0) System.out.println("The value is present at " + place + " position");
        else System.out.println("Value is non existent");
    }

    private static int search(int[] arr, int value) {
        int len = arr.length;
        int i=0;
        while(i<len){
            if(arr[i] == value) return i+1;
            i++;
        }
        return -1;
    }
}
