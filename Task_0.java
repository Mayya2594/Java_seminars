/**
 * <aside>
 **Текст задачи:**
В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
</aside>
*/

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Task_0 {
    public static void main(String[] args) {
        System.out.println(task4());
    }

    static void task0() {
        /**
        **Текст задачи:**
        В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
        */
        System.out.println("Whet is your name: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour >= 5 && hour < 12){
            System.out.println("Good morning, " + line);
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Good afternoon, " + line);
        } else if (hour >= 18 && hour < 23) {
            System.out.println("Good evening, " + line);
        } else {
            System.out.println("Good night, " + line);
        }
        scanner.close();
    }

    static void task1(){
        /**
        * //Дан массив двоичных чисел, например [1,1,0,1,1,1],
        * вывести максимальное количество подряд идущих 1.
        */
        int[] arr = {1, 1, 1, 0, 1, 1, 1, 1};
        int maxOnes = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) temp ++;
            else if (temp > maxOnes) {
                maxOnes = temp;
                temp = 0;
            }
        }
        if (temp > maxOnes) {
                maxOnes = temp;
        }
        System.out.println(maxOnes);
    }

    static void task2() {
        /**
        * Текст задачи:
        Дан массив nums = [3,2,2,3] и число val = 3.
        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
        */
        int[] arr = {3,2,2,3};
        int val = 3;
        int count = 0;
        int[] tempArr = new int[arr.length];
        Arrays.fill(tempArr, val);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                tempArr[count++] = arr[i];            
            }
        }
        System.out.println(Arrays.toString(tempArr));
    }

    static String task3(String str) {
        /**
         * Текст задачи:
         * Во фразе "Добро пожаловать на курс по Java"
         * переставить слова в обратном порядке.
         * Конструкция для запуска: System.out.println(task3("Добро пожаловать на курс по Java"));
         */
        str = str.toLowerCase();
        String[] words = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            stringBuilder.append(words[words.length - 1 -i]).append(" ");
        }
        return stringBuilder.toString();
    }

    static double task4() {
        /**
         * **Текст задачи:**
         * Реализовать функцию возведения числа а в степень b. a, b из Z.
         * Сводя количество выполняемых действий к минимуму.
         * Пример 1: а = 3, b = 2, ответ: 9
         * Пример 2: а = 2, b = -2, ответ: 0.25
         * Пример 3: а = 3, b = 0, ответ: 1
         */
        System.out.println("Введите число а: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            System.out.println("Введите число b: ");
            int b = scanner.nextInt();
            if (a == 1 || b == 0) {
                return 1;
            }
            double res = 1;
            for (int i = 0; i < Math.abs(b); i++) {
                res = res * a;
            }
            return b > 0? res : 1 / res;
        }
    }

}