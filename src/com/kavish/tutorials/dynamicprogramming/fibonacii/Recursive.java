package com.kavish.tutorials.dynamicprogramming.fibonacii;

public class Recursive {
    public int print(int n) {

        int result = 1;
        if (n == 1 || n == 2)
            return result;
         else
            return print(n - 1) + print(n - 2);
    }
}
