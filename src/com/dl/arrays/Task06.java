//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.
package com.dl.arrays;

public class Task06 {
    public static void main(String[] args) {
        double sumOfPrimeIndex = 0;
        int n = 7;
        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.round(Math.random() * n + 1);
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if (isPrime(i)) {
                sumOfPrimeIndex += array[i];
                System.out.print("\naddded index: " + i);
            }
        }
        System.out.println("\n" + sumOfPrimeIndex);
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0)
                    return false;
            }

        }
        return true;
    }

}
