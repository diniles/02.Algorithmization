//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
package com.dl.arrays;

public class Task04 {
	public static void main(String[] args) {
		int n = 32;
		int[] array = new int[n];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int maxIndex = Integer.MIN_VALUE;
		int minIndex = Integer.MAX_VALUE;
		System.out.println("Array before:");
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * n) + 1;
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				maxIndex = i;
			}
			if (array[i] < min) {
				min = array[i];
				minIndex = i;
			}
		}
		array[maxIndex] = min;
		array[minIndex] = max;
		System.out.println("Array after:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

	}
}
