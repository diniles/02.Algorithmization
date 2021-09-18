//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.
package com.dl.arrays;

public class Task03 {
	public static void main(String[] args) {
		int n = 14;
		int[] array = new int[n];
		int negative = 0;
		int positive = 0;
		int zero = 0;

		for (int i = 0; i < array.length; i++) {
			if (i % 3 == 0) {
				array[i] = 0;
			} else if (i % 5 == 0) {
				array[i] = i * -1;
			} else {
				array[i] = (int) (Math.random() * n) + 1;
			}
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				zero++;
			} else if (array[i] < 0) {
				negative++;
			} else {
				positive++;
			}
		}
		System.out.printf("Negative elements: %d, positive elements: %d, zeroes: %d", negative, positive, zero);
	}

}
