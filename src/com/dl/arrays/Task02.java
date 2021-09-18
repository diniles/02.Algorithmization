//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.
package com.dl.arrays;

public class Task02 {
	public static void main(String[] args) {
		int n = 12;
		int z = 6;
		int[] array = new int[n];

		System.out.println("Initial array");
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
			System.out.print(array[i] + " ");
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] > z) {
				array[i] = z;
			}
		}
		System.out.println("\nArray after change");
		for (int i : array) {
			System.out.print(array[i] + " ");
		}
	}

}
