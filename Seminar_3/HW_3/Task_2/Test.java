package Seminar_3.HW_3.Task_2;

import java.util.Arrays;
import java.util.ArrayList;

/*
Напишите функцию removeEvenNumbers, которая принимала бы произвольный список целых чисел, удаляла бы из него четные числа
и выводила список без четных чисел.
Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers принимает на вход один параметр:
Integer[] arr - список целых чисел

Пример
arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
removeEvenNumbers(arr);
// [1, 3, 5, 7, 9]
arr = new Integer[]{2, 4, 6, 8};
removeEvenNumbers(arr);
// []
 */

public class Test {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {2, 4, 6, 8};
        removeEvenNumbers(arr);
    }

    public static void removeEvenNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        ArrayList<Integer> copy = new ArrayList<>(arrayList);
        for (Integer number : copy) {
            if (number % 2 == 0) {
                arrayList.remove(number);
            }
        }
        System.out.println(arrayList);
    }

}
