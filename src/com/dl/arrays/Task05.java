//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
package com.dl.arrays;

public class Task05 {
    public static void main(String[] args) {
        int n = 19;
        int[] array = new int[n];
        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * n) + 1;
            System.out.print(array[i] + " ");
        }
        
        System.out.println("\nNow printing only numbers a[i] > i");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.printf("[%d] - [%d]\n", i, array[i]);
            } else {
                System.out.printf("[%d] - skipped\n", i);
            }
        }
    }
}
