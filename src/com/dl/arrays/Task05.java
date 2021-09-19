//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
package com.dl.arrays;

public class Task05 {
    public static void main(String[] args) {
        int number=5;
        int n=19;
        int[] array=new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * n) + 1;
            if (array[i]>number)
            System.out.print(array[i] + " ");
        }
    }
}
