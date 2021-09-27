//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
package com.dl.arraysofarrays;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 5;
		int n = 5;
		System.out.println("Initial matrix");
		int[][] matrix = Service.generateMatrix(m, n);
		System.out.println("----------");

		for (int i = 1; i < matrix.length; i += 2) {
			if (matrix[i][0] > matrix[i][matrix[i].length - 1]) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

}
