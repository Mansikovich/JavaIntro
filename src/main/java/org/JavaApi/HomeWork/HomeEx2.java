package org.JavaApi.HomeWork;

import java.util.Scanner;

public class HomeEx2 {
    public static void main(String[] args) {
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("zadanie2(n, scanner) = " + zadanie2(n, scanner));


    }

    /**
     * @apiNote Дана последовательность N целых чисел.
     Найти количество положительных чисел, после которых следует отрицательное число.
     * @param n int
     * @param scanner scanner
     * @return count
     */
    private static int zadanie2(int n, Scanner scanner) {
        int summa = 0;
        int a = 0;
        int b = 0;
        a = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            b = scanner.nextInt();
            if (a > 0 && b < 0) summa += a;

        }
        scanner.close();
        return summa;
    }

}
