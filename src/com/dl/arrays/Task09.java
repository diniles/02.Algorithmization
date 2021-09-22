//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.
package com.dl.arrays;

public class Task09 {
    public static void main(String[] args) {
        int n = 16;
        int[] array = new int[n];

        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * n) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.printf("\nMinimal most common number is: %d", minInArray(array));
    }

    static int minInArray(int[] array) {
        int[] popArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    popArray[i]++;
                }
            }
        }

        int valResult = array[0];
        int popResult = popArray[0];
        for (int i = 0; i < popArray.length; i++) {
            if (popArray[i] > popResult) {
                popResult = popArray[i];
                valResult = array[i];
            }
            if ((popResult == popArray[i]) && (array[i] < valResult)) {
                valResult = array[i];
            }
        }
        return valResult;
    }
}
