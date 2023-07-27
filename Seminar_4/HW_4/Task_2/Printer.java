package Seminar_4.HW_4.Task_2;

import java.util.LinkedList;

/*
В классе MyQueue реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди
dequeue() - возвращает первый элемент из очереди и удаляет его
first() - возвращает первый элемент из очереди, не удаляя
getElements() - возвращает все элементы в очереди
 */

class MyQueue<T> {
    private LinkedList<T> queue;

    public MyQueue() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(T element){ // помещает элемент в конец очереди
        // Напишите свое решение ниже
        queue.addLast(element);

    }

    public T dequeue(){ // возвращает первый элемент из очереди и удаляет его
        // Напишите свое решение ниже
        return queue.removeFirst();

    }

    public T first(){ // возвращает первый элемент из очереди, не удаляя
        // Напишите свое решение ниже
        return queue.getFirst();

    }

    public LinkedList<T> getElements() { // возвращает все элементы в очереди
        // Напишите свое решение ниже
        return queue;

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}