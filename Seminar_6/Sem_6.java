package Seminar_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sem_6 {
    public static void main(String[] args) {
        // task0();
        // task1(createArray(1000, 0, 24));
        Cat cat1 = new Cat("Martin", "british", 13, "Mayya");
        Cat cat2 = new Cat("Masha", "pers", 10, "Sveta");
        Cat cat3 = new Cat("Dasha", "abissyn", 8, "Natasha");
        Cat cat4 = new Cat("Dasha", "abissyn", 8, "Natasha");
        //System.out.println(cat1);
        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        System.out.println(cats);
        System.out.println(cat3.equals(cat4));
    }
    
    static void task0() {
        /*
        1. Создайте HashSet, заполните его следующими числами:
        {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
        2. Создайте LinkedHashSet, заполните его следующими числами:
        {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
        3. Создайте TreeSet, заполните его следующими числами:
        {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
         */

        Integer[] arr = new Integer[] {1, 4, 5, 7, 3, 2, 6, 3, 2};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(arr));
        Set<Integer> set3 = new LinkedHashSet<>(Arrays.asList(arr));
        
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }

    static void task1(Integer[] array) {
        /*
        1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
        2. Создайте метод, в который передайте заполненный выше массив и с помощью Set
        вычислите процент уникальных значений в данном массиве
        и верните его в виде числа с плавающей запятой.
        Для вычисления процента используйте формулу:
        процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
         */

        Set<Integer> set = new HashSet<>(Arrays.asList(array));
        double unic = set.size() * 100.0 / array.length;
        System.out.println(unic);
    }

    static Integer[] createArray(int size, int min, int max) {
        Integer[] arr = new Integer[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*(max - min + 1) + min);
        }
        return arr;
    }

    static void task2() {
        
    }

}