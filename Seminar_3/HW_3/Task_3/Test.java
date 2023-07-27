package Seminar_3.HW_3.Task_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

/*
 * Напишите функцию analyzeNumbers, которая принимает на вход целочисленный список arr и:
Сортирует его по возрастанию и выводит на экран
Находит минимальное значение в списке и выводит на экран - Minimum is {число}
Находит максимальное значение в списке и выводит на экран - Maximum is {число}
Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:
Integer[] arr - список целых чисел

Пример
arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
analyzeNumbers(arr)
// [1, 2, 3, 4, 5, 6, 7, 8, 9]
// Minimum is 1
// Maximum is 9
// Average is = 5
 */

public class Test {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        analyzeNumbers(arr);
    }

    public static void analyzeNumbers(Integer[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(arrList);
        // arrList.sort(Integer::compareTo); // сортировка списка по возрастанию
        System.out.println(arrList);
        System.out.println("Minimum is " + arrList.get(0));
        System.out.println("Maximum is " + arrList.get(arr.length - 1));
        int average = 0;
        for(Integer i : arrList) {
            average = average + i;
        }
        average = average / arr.length;
        System.out.println("Average is " + average);
    }
}
