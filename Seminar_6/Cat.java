package Seminar_6;

//import java.util.List;

public class Cat {
    /*
     * 1. Продумайте структуру класса Кот.
     * Какие поля и методы будут актуальны для приложения, которое является
     * а) информационной системой ветеринарной клиники
     * б) архивом выставки котов
     * в) информационной системой Театра кошек Ю. Д. Куклачёва
     * Можно записать в текстовом виде, не обязательно реализовывать в java.
     */

    /*
     * Создайте множество, в котором будут храниться экземпляры класса Cat -
     * HashSet<Cat>. Поместите в него некоторое количество объектов.
     * 2. Создайте 2 или более котов с одинаковыми параметрами в полях.
     * Поместите их во множество. Убедитесь, что все они сохранились во множество.
     * 3. Создайте метод
     ** public boolean equals(Object o)**
     * Пропишите в нём логику сравнения котов по параметрам, хранимым в полях.
     * То есть, метод должен возвращать true, только если значения во всех полях
     * сравниваемых объектов равны.
     * 4. Создайте метод
     ** public int hashCode()**
     * который будет возвращать hash, вычисленный на основе полей класса Cat.
     * (Можно использовать Objects.hash(...))
     * 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты
     * удалились.
     */

    private String name;
    private String breed; // порода
    private int age;
    private String owner;
    //private List<String> healthHistory;

    public Cat(String name, String breed, int age, String owner) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.owner = owner;
    }

    @Override
    public String toString() {
        String res = String.format("Name: %s, breed: %s, age: %d, owner: %s", name, breed, age, owner);
        return res;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && owner.equals(cat.owner) && age == cat.age && breed.equals(cat.breed);
    }

    @Override
    public int hashCode() {
        return 7 * name.hashCode() + 11 * owner.hashCode() + 3 * breed.hashCode() + age;
    }

}
