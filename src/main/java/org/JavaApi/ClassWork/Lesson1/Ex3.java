package org.JavaApi.ClassWork.Lesson1;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("zadanie3(str) = " + zadanie3(str));
        scanner.close();
    }

    private static String zadanie3(String str) {
        String up = str.substring(0, str.length()/2);
        String down = str.substring(str.length()/2);
        return down + up;

    }
}
