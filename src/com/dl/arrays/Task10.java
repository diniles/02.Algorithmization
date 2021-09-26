//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
package com.dl.arrays;


public class Task10 {
    public static void main(String[] args) {
        int n = 32;
        
        int[] array = Service.generateIntArray(n);
        
        System.out.println("\nArray after:");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}
