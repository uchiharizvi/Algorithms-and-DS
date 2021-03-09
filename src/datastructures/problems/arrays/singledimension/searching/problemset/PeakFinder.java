package datastructures.problems.arrays.singledimension.searching.problemset;

/**
 * Find Peak If it exists
 * A[1,5,7,2,5,7,8,6,4,6]
 **/
public class PeakFinder {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9, 3, 12, 13, 5};
        findPeak(arr);
    }

    private static void findPeak(int[] arr) {
        /**Algorithm(DnC)
         * 1) if arr[n/2] < arr[n/2-1], search left half
         * 2) else if (arr[n/2] < arr[n/2+1]), search right half
         * 3) else return a[n/2]
         * **/
        int size = arr.length;
            if(arr[size/2] < arr[size/2-1]) loop(arr, 1, size/2-1);
            else if (arr[size/2] < arr[size/2+1]) loop(arr, size/2, size);
            else System.out.println("Peak : " + arr[size/2]);
    }

    private static void loop(int[] arr, int lowerLimit, int upperLimit) {
        for(int i=lowerLimit; i<= upperLimit; i++) {
        }
    }
}
