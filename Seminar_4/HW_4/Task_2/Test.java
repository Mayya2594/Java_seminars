package Seminar_4.HW_4.Task_2;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(10);
        queue.enqueue(15);
        System.out.println(queue.getElements());
    }
}

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

