package com.dl.arrays;

class Service {
	static int[] generateIntArray(int size) {
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * size + 1);
			System.out.print(array[i] + " ");
		}
		return array;
	}
}
