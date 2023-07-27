package Seminar_5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Sem_5 {
    public static void main(String[] args) {
        // task0();
        // System.out.println(task1("paper", "title"));
        // System.out.println(task1("foo", "bar"));
        // System.out.println(task2("<{a}+{(d*3)}>"));
        task3("Мороз и солнце день чудесный еще ты дремлешь друг прелестный Пора красавица проснись.");
    }

    static void task0() {
        /*
        **Текст задачи:**
        Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
        123456 Иванов
        321456 Васильев
        234561 Петрова
        234432 Иванов
        654321 Петрова
        345678 Иванов
        Вывести данные по сотрудникам с фамилией Иванов. */
        Passport passport = new Passport();
        passport.add("123456", "Иванов");
        passport.add("321456", "Васильев");
        passport.add("234561", "Петрова");
        passport.add("234432", "Иванов");
        passport.add("654321", "Петрова");
        passport.add("345678", "Иванов");
        System.out.println(passport.getAll());
        System.out.println(passport.getByPassNum("234561"));
        System.out.println(passport.getByLastName("Иванов"));
    }

    static boolean task1(String str1, String str2) {
        /*
         * **Текст задачи:**
        Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
        1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
        2. буква может не меняться, а остаться такой же. (Например, note - code)
        Пример 1:
        Input: s = "foo", t = "bar"
        Output: false
        Пример 2:
        Input: s = "paper", t = "title"
        Output: true
         */
        if (str1.length() != str2.length()) return false;
        Map<Character, Character> map = new HashMap<>();
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if (map.containsKey(c1[i])) {
                if (c2[i] != map.get(c1[i])) return false;
            } else {
                map.put(c1[i], c2[i]);
            }
        }
        return true;
    }
    
    static boolean task2(String str) {
        /*
         * **Текст задачи:**
        Написать программу, определяющую правильность расстановки скобок в выражении.
        Пример 1: a+(d*3) - истина
        Пример 2: [a+(1*3) - ложь
        Пример 3: [6+(3*3)] - истина
        Пример 4: {a}[+]{(d*3)} - истина
        Пример 5: <{a}+{(d*3)}> - истина
        Пример 6: {a+]}{(d*3)} - ложь
         */
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        map.put('<', '>');
        Stack<Character> stack = new Stack<>();
        char[] c = str.toCharArray();
        // for (int i = 0; i < c.length; i++) {
        //     if (c[i] == '(') stack.push(c[i]);
        //     if (c[i] == ')') {
        //         if (stack.isEmpty() || stack.pop() != '(') {
        //             return false;
        //         }
        //     }
        // }

        for (int i = 0; i < c.length; i++) {
            if (map.containsKey(c[i])) stack.push(c[i]);
            if (map.containsValue(c[i])) {
                if (stack.isEmpty() || map.get(stack.pop()) != c[i]) {
                    return false;
                } 
            }
        }

        if (!stack.isEmpty()) return false;
        return true;
    }

    static void task3(String str) {
        /*
         **Текст задачи:**
Взять набор строк, например,
Мороз и солнце день чудесный
Еще ты дремлешь друг прелестный
Пора красавица проснись.
Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.
         */
        str = str.replace("\n", " ");
        str = str.replace(".", " ");
        String[] words = str.split(" ");
        Map<Integer, List<String>> map = new TreeMap<>();
        for (String word : words) {
            int len = word.length();
            if (map.containsKey(len)) {
                List<String> list = map.get(len);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }
        }
        System.out.println(map);
        
    }

}
