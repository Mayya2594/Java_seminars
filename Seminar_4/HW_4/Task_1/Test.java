package Seminar_4.HW_4.Task_1;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(1);
        ll.add("One");
        ll.add(2);
        ll.add("Two");
        System.out.println(ll);
        System.out.println(revert(ll));
    }

    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        // Напишите свое решение ниже
        LinkedList<Object> revertedLL = new LinkedList<>();
        // int size = ll.size();
        // for (int i = 0; i < size; i++) {
        //     revertedLL.add(ll.removeLast());
        // }
        for (Object object : ll) {
            revertedLL.addFirst(object);
        }

        return revertedLL;

    }

}
