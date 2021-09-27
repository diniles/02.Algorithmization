package com.dl.arraysofarrays;

abstract class Service {
	static int[][] generateMatrix(int m, int n) {
		int[][] array = new int[m][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) Math.round(Math.random() * (m * n) + 1);
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		return array;
	}
}
