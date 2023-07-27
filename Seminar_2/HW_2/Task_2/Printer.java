package Seminar_2.HW_2.Task_2;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) {
       try {
            log = new File("log.txt");
            fileWriter = new FileWriter(log, false);

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String timestamp = dateFormat.format(new Date());
            
            boolean swapped;
            for (int i = 0; i < mas.length - 1; i++) {
              swapped = false;
              for (int j = 0; j < mas.length - 1 - i; j++) {
                if (mas[j] > mas[j + 1]) {
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                    swapped = true;
                }
              }
              if (!swapped) {
                    break;
              }
              timestamp = dateFormat.format(new Date());
              fileWriter.write(timestamp + " " + java.util.Arrays.toString(mas) + "\n");
            }
            timestamp = dateFormat.format(new Date());
            fileWriter.write(timestamp + " " + java.util.Arrays.toString(mas) + "\n");

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      int[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
      }     
      
      BubbleSort ans = new BubbleSort();      
      ans.sort(arr);

      try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}