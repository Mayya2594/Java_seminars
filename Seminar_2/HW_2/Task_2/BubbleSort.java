package Seminar_2.HW_2.Task_2;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;
    public static void main(String[] args) {
        int[] arr = {9, 4, 8, 3, 1};
        sort(arr);
    }

    public static void sort(int[] mas) {
        try {
            log = new File("log.txt");
            fileWriter = new FileWriter(log, true);

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String timestamp = dateFormat.format(new Date());

            fileWriter.write(timestamp + " " + java.util.Arrays.toString(mas) + "\n");

            for (int i = 0; i < mas.length - 1; i++) {
                for (int j = 0; j < mas.length - 1 - i; j++) {
                    if (mas[j] > mas[j + 1]) {
                        int temp = mas[j];
                        mas[j] = mas[j + 1];
                        mas[j + 1] = temp;
                    }
                }

                timestamp = dateFormat.format(new Date());
                fileWriter.write(timestamp + " " + java.util.Arrays.toString(mas) + "\n");
            }

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
