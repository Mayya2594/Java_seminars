package Seminar_3.HW_3.Task_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
      // Введите свое решение ниже
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr));
        //Collections.sort(arrList);
        arrList.sort(Integer::compareTo); // сортировка списка по возрастанию
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

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.analyzeNumbers(arr);
    }
}