//Дана последовательность целых чисел a1,a2,....an
//Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min(a1,a2,...an)
package com.dl.arrays;

import java.util.Arrays;

public class Task08 {
    public static void main(String[] args) {
        int n = 19;
        int[] array = new int[n];

        fillArray(array, n);

        int min = Integer.MAX_VALUE;
        for (int j : array) {
            if (min > j) min = j;
        }

        System.out.printf("Minimal number is: %d\n", min);

        int[] arr = returnArray(array, min);
        System.out.println("Result array is:\n" + Arrays.toString(arr));
    }

    static void fillArray(int[] array, int n) {
        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * n) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static int[] returnArray(int[] array, int n) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (n != array[i]) result[i] = array[i];
        }
        return result;
    }

}
