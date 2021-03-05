package datastructures.dynamicprogramming.fibonacii;

public class DynamicStrategy {
    public long print(int n) {
        long[] dynamicArray = new long[n + 1];
        int result = 1;

        if (n == 1 || n == 2) {
            return result;
        } else {
            dynamicArray[1] = 1;
            dynamicArray[2] = 1;
            for (int i = 3; i <= n; i++) {
                dynamicArray[i] = dynamicArray[i - 1] + dynamicArray[i - 2];
            }
        }
        return dynamicArray[n];
    }
}
