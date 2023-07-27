package Seminar_4;

public class MyStack {
    /*
    **Текст задачи:**
    Реализовать стэк с помощью массива. Нужно реализовать методы:

    size(), empty(), push(), peek(), pop().
    */
    private Integer[] arr = new Integer[10];

    private int size = 0;

    int size(){
        return size;
    }

    boolean empty(){
        return size == 0;
    }

    void push(int num){
        if (size == arr.length){
            Integer[] arr2 = new Integer[arr.length * 2];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size++] = num;
    }

    int peak(){
        return arr[size - 1]; // возвращаем значение последнего элемента
    }

    int pop(){
        return arr[--size]; // возвращаем значение последнего элемента, одновременно удаляя его из массива

    }

}
