//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
package com.dl.arrays;

public class Task01 {
	static int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	static int k = 3;

	public static void main(String[] args) {
		System.out.println(sumElements(array, k));
	}

	public static int sumElements(int[] array, int element) {
		int sumOfElements = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % element == 0) {
				sumOfElements += array[i];
			}
		}
		return sumOfElements;
	}

}
