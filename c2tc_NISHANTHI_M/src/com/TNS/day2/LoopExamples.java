package com.TNS.day2;

public class LoopExamples {
    public static void main(String[] args) {
        
        // 1. For loop example
        System.out.println("For loop example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // 2. While loop example
        System.out.println("\nWhile loop example:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Iteration: " + j);
            j++;
        }

        // 3. Do-While loop example
        System.out.println("\nDo-While loop example:");
        int k = 1;
        do {
            System.out.println("Iteration: " + k);
            k++;
        } while (k <= 5);
    }
}
