package Seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Sem_3 {
    public static void main(String[] args) {
        // task0();
        task1(createList(10, 0, 9));
        // task2();
        // task3();
    }

    static void task0(){
    /*
    **Текст задачи:**
    Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
    String s1 = "hello";
    String s2 = "hello";
    String s3 = s1;
    String s4 = "h" + "e" + "l" + "l" + "o";
    String s5 = new String("hello");
    String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
    */
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1==s2); // оператор == сравнивает ссылки на объект, для s1-s4 ссылки одиныковые, для s5 и s6 созданы две новые ссылки
        System.out.println(s3==s2);
        System.out.println(s3==s4);
        System.out.println(s4==s5);
        System.out.println(s5==s6);

        System.out.println(s1.equals(s2)); // помимо ссылок, сравнивает сами строки между собой
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s5.equals(s6));

    }

    static void task1(List<Integer> list){
    /*
    Текст задачи:
    Заполнить список десятью случайными числами.
    Отсортировать список методом sort() и вывести его на экран.
     */
        Collections.sort(list);
        System.out.println(list);
    }

    static List<Integer> createList(int size, int min, int max){
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++){
            list.add((int) (Math.random()*(max-min+1)+min));
        }
        return list;
    }

    static void task2(){
       /*
       Создать список типа ArrayList<String>.
       Поместить в него как строки, так и целые числа.
       Пройти по списку, найти и удалить целые числа.
       */
        List list = new ArrayList<>();
        list.add("dhgdfg");
        list.add(1);
        list.add("tyui");
        list.add("hello");
        list.add(21);
        list.add(11);
        System.out.println(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            if (o instanceof Integer){
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    static void task3(){
        /*
    Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
    что на 0й позиции каждого внутреннего списка содержится название жанра,
    а на остальных позициях - названия книг.
    Напишите метод для заполнения данной структуры.
        */
        List<List<String>> books = new ArrayList<>();
        addBook("Фантастика", "Марсианин", books);
        addBook("Классика", "Евгений Онегин", books);
        addBook("Роман", "Война и мир", books);
        addBook("Фантастика", "Дюна", books);
        addBook("Роман", "Гарри Поттер", books);
        addBook("Роман", "Маленькая жизнь", books);
        
        System.out.println(books);
    }

    static void addBook(String ganre, String name, List<List<String>> bookShop){
        for (int i = 0; i < bookShop.size(); i++){
            if (bookShop.get(i).get(0).equals(ganre)){
                bookShop.get(i).add(name);
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(ganre);
        list.add(name);
        bookShop.add(list);
    }

}