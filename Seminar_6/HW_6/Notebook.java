package Seminar_6.HW_6;

/*
1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
2. Создать множество ноутбуков.
3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации
и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
1. Далее нужно запросить минимальные значения для указанных критериев
- сохранить параметры фильтрации можно также в Map.
2. Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
 */

public class Notebook {
    private String brand;
    private String model;
    private int ram;
    private int hdd;
    private String os;
    private String color;

    public Notebook(String brand, String model, int ram, int hdd, String os, String color) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }
    

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        String res = String.format("Brand: %s, model: %s, ram: %d, hdd: %d, os: %s, color: %s", brand, model, ram, hdd, os, color);
        return res;
    }
}
