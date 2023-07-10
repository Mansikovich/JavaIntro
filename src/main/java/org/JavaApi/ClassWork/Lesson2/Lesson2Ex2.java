package org.JavaApi.ClassWork.Lesson2;

public class Lesson2Ex2 {
    public static void main (String[] args) {
        int[] array = {2, 3, 5, 8, 5, 6, 2};
        System.out.println(palindrome(array));
    }

    /**
     * @apiNote Дан массив целых чисел. Верно ли, что массив является симметричным.
     * @param array входной массив
     * @return результат
     */
    private static boolean palindrome(int [] array) {
        int len = array.length - 1;
        for (int i = 0; i < array.length/2; i++) {
            if(array[i] != array[len]) return false;
            len--;
        }
        return true;
    }
}
