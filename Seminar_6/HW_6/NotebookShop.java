package Seminar_6.HW_6;

import java.util.*;

public class NotebookShop {
    public static Set<Notebook> filterNotebook(Set<Notebook> notebooks, Map<Integer, String> parametr) {
        for (Integer key : parametr.keySet()) {
            String value = parametr.get(key);
            switch (key) {
                case 1:
                    int ram = Integer.parseInt(value);
                    notebooks.removeIf(notebook -> notebook.getRam() < ram);
                    break;
                case 2:
                    int hdd = Integer.parseInt(value);
                    notebooks.removeIf(notebook -> notebook.getHdd() < hdd);
                    break;
                case 3:
                    notebooks.removeIf(notebook -> !notebook.getOs().equalsIgnoreCase(value));
                    break;
                case 4:
                    notebooks.removeIf(notebook -> !notebook.getColor().equalsIgnoreCase(value));
                    break;
                default:
                    break;
            }
        }
        return notebooks;
    }

    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();
        Notebook notebook1 = new Notebook("Lenovo", "Ideapad 300", 8, 512, "Windows", "black");
        Notebook notebook2 = new Notebook("Lenovo", "ideapad 330", 16, 1024, "Windows", "grey");
        Notebook notebook3 = new Notebook("Honor", "Magicook X 15", 8, 256, "Windows", "grey");
        Notebook notebook4 = new Notebook("Apple", "Air 13", 8, 256, "macOS", "grey");
        Notebook notebook5 = new Notebook("MSI", "GF63 THIN", 16, 1024, "Windows", "black");
        
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);

        Map<Integer, String> filters = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите параметры фильтрации:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int parametr = scanner.nextInt();
        scanner.nextLine();
    
        switch (parametr) {
            case 1:
                System.out.println("Введите объем ОЗУ:");
                String ram = scanner.nextLine();
                filters.put(parametr, ram);
                break;
            case 2:
                System.out.println("Введите объем ЖД:");
                String hdd = scanner.nextLine();
                filters.put(parametr, hdd);
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String os = scanner.nextLine();
                filters.put(parametr, os);
                break;
            case 4:
                System.out.println("Введите цвет:");
                String color = scanner.nextLine();
                filters.put(parametr, color);
                break;
            default:
                System.out.println("Некорректный критерий фильтрации");
                return;
        }

        Set<Notebook> filteredNotebooks = filterNotebook(notebooks, filters);
        System.out.println("Результаты фильтрации:");
        if (filteredNotebooks.isEmpty()) {
            System.out.println("Нет ноутбуков, соответствующих параметрам фильтрации");
        } else {
            for (Notebook notebook : filteredNotebooks) {
                System.out.println("Brand: " + notebook.getBrand() + ", Model: " + notebook.getModel()
                + ", RAM: " + notebook.getRam() + ", HDD: " + notebook.getHdd()
                + ", OS: " + notebook.getOs() + ", Color: " + notebook.getColor());
            }
        }
    }
}