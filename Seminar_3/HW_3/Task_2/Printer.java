package Seminar_3.HW_3.Task_2;

import java.util.Arrays;
import java.util.ArrayList;

class Answer {
    public void removeEvenNumbers(Integer[] arr) {
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

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.removeEvenNumbers(arr);
    }
}