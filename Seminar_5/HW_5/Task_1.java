package Seminar_5.HW_5;

/*
Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена
с разными телефонами, их необходимо считать, как одного человека с разными телефонами.
Вывод должен быть отсортирован по убыванию числа телефонов.
 */

public class Task_1 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addRecord("Petr", "+78147453187");
        phoneBook.addRecord("Petr", "+78142456789");
        phoneBook.addRecord("Mayya", "+79117013258");
        phoneBook.addRecord("Mayya", "+79991456321");
        phoneBook.addRecord("Ivan", "+77994561265");
        phoneBook.addRecord("Petr", "+78881564879");
        System.out.println(phoneBook.getByName("Mayya"));
        phoneBook.getSorted();
    }
}
