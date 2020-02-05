package com.kavish.tutorials.dynamicprogramming.fibonacii;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;

public class FibonaciiSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for which you wish to print the Fibonacii Series : ");
        int n = scanner.nextInt();
        System.out.println("Enter your choice of Algorith you wish to proceed with : ");
        System.out.println("1) Recusrsion");
        System.out.println("2) Dynamic Programming");

        long result = 0;
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                Recursive recursive = new Recursive();
                result = recursive.print(n);
                System.out.println(result);
                break;
            }
            case 2: {
                DynamicStrategy dynamicProgram = new DynamicStrategy();
                result = dynamicProgram.print(n);
                System.out.println(result);
                break;
            }
        }
    }
}
