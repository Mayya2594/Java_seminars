package Seminar_4;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Sem_4 {
    public static void main(String[] args) {
        // task0();
        // task1();
        task2();
        // MyStack myStack = new MyStack();
        // myStack.push(1);
        // myStack.push(2);
        // myStack.push(3);
        // myStack.push(4);
        // myStack.push(5);
        // System.out.println(myStack.size());
        // System.out.println(myStack.pop());
        // System.out.println(myStack.peak());
        // myStack.pop();
        // myStack.pop();
        // myStack.pop();
        // System.out.println(myStack.empty());
        // myStack.pop();
        // System.out.println(myStack.empty());
    }

    static void task0() {
        /*
        **Текст задачи:**
        1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
        2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
         */

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list1.add(0, i);
        }

        long middleTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list2.add(0, i);
        }

        long finish = System.currentTimeMillis();
        System.out.println(middleTime - start);
        System.out.println(finish - middleTime);
    }

    static void task1() {
        /*
        **Текст задачи:**
        Реализовать консольное приложение, которое:
        1. Принимает от пользователя строку вида
        text~num
        2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
        3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
         */

        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Введите команду: ");
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            String text = arr[0];
            int num = Integer.parseInt(arr[1]);
            switch (text) {
                case "print":
                    System.out.println(list.remove(num));
                    break;
                case "exit":
                    System.out.println("До свидания!");
                    work = false;
                    break;
                default:
                    list.add(num, text);
                    break;
            }
        }
        scanner.close();
    }

    static void task2() {
        /*
        **Текст задачи:**
        Реализовать консольное приложение, которое:

        1. Принимает от пользователя и “запоминает” строки.
        2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
        3. Если введено revert, удаляет предыдущую введенную строку из памяти.
        */
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Введите команду: ");
            String line = scanner.nextLine();
            switch (line) {
                case "print":
                    ListIterator iterator = list.listIterator(list.size());
                    while (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "exit":
                    System.out.println("До свидания!");
                    work = false;
                    break;
                case "revert":
                    list.removeLast();
                    break;
                default:
                    list.add(line);
                    break;
            }
        }
        scanner.close();
    }
    
}
    