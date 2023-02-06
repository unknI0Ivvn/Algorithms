package Algoritms.Lesson2.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] arr = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd' };
        //сложность n/2

        //решение двумя указателями
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            char tmp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = tmp;

        }
        System.out.println(Arrays.toString(arr));


        reverse(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int left, int right, char[] chars) {
        if (left >= right) {
            return;
        }
        char tmp = chars[left];
        chars[left] = chars[right];
        chars[right] = tmp;
        reverse(++left, --right, chars); //прификсные
    }
    //статик это метод вызывается без создания экземпляра класса
    //обьекты не надо создавать только просто математика
    //private только будет работать в этом классе
}
