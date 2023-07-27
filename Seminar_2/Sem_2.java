package Seminar_2;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Sem_2 {
    public static void main(String[] args) {
        System.out.println(new Sem_2());
        // System.out.println(task1("aaaabbbbcccdcdaa"));
        // System.out.println(task2("aabbcaa"));
        saveToFile(repeat(10, "TEST"));
        //task4("TESTTESTTEST");
    }
        
    static String task0 (int n, char c1, char c2) {
        /**
         * Дано четное число N (>0) и символы c1 и c2. Написать метод,
         * который вернет строку длины N, которая состоит из чередующихся
         * символов c1 и c2, начиная с c1.
         */
        if (n % 2 == 0) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < n / 2; i++) {
                builder.append(c1).append(c2);
            }
            return builder.toString();
        } else {
            System.out.println("N is not even number");
            return null;
        }
    }
    static String newString = task0(10, ':', 'y');
    static String task1(String str) {
        /**
         * Текст задачи:
         * Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
         */
        // char[] chars = str.toCharArray();
        // Arrays.sort(chars);
        // StringBuilder stringBuilder = new StringBuilder();
        // int count = 0;
        // for (int i = 1; i < chars.length; i++) {
        //     if (chars[i] == chars[i - 1]) {
        //         count ++;
        //     } else {
        //         stringBuilder.append(chars[i - 1]).append(count + 1);
        //         count = 0;
        //     }
        //     stringBuilder.append(chars[chars.length - 1]).append(count + 1);
        //     return stringBuilder.toString();
        // }
        
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (int i = 1; i < chars.length; i++) {
            if(chars[i] == chars[i-1]){
                count++;
            } else {
                stringBuilder.append(chars[i-1]).append(count + 1);
                count = 0;
            }
        }
        stringBuilder.append(chars[chars.length-1]).append(count + 1);
        return stringBuilder.toString();
    }

    static boolean task2(String str) {
        /**
         * Напишите метод, который принимает на вход строку (String)
         * и определяет является ли строка палиндромом (возвращает
         * boolean значение).
         */
        StringBuilder stringBuilder = new StringBuilder(str);
        String str2 = stringBuilder.reverse().toString();
        return str2.equals(str);
    }

    static void task3() {
        /*
         * Напишите метод, который составит строку, состоящую из 100
         * повторений слова TEST и метод, который запишет эту строку
         * в простой текстовый файл, обработайте исключения.
         */
    }
    
    static String repeat (int n, String str) {
        return str.repeat(n);
    }

    static void saveToFile (String str) {
        String path = "text.txt";
        try (FileWriter writer = new FileWriter(path, true)) { // true - при каждом запуске в файл добавляется инфо, false - файл перезаписывается с 0
            writer.write(str);
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void task4(String str){
        String path = "/f/f/f/f/text2.txt";
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt", false);
        } catch (Exception e){
            e.printStackTrace();
        }

        logger.addHandler(fileHandler);
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);

        try (FileWriter writer = new FileWriter(path, true)){
            writer.write(str);
            writer.flush();
        } catch (Exception e){
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
        }
        fileHandler.close();
        logger.getHandlers()[0].close();
    }

}
