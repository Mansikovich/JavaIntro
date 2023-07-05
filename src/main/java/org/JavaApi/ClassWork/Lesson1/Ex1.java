package org.JavaApi.ClassWork.Lesson1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        System.out.println("subtractProductAndSum(n) = " + substractProductAndSum(n));
        scanner.close();
    }
    private static int substractProductAndSum(int n) {
    int sum = 0, pr = 1;
    while ( n != 0) {
        pr *= n % 10;
        sum += n % 10;
        n = n / 10;
    }
    return pr - sum;
    }
    }
