package Seminar_2.HW_2.Task_3;


/*
Внутри класса Answer напишите метод answer, который распарсит json и, используя StringBuilder,
создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].
На вход метода answer подаются аргументы:

String JSON
String ELEMENT1
String ELEMENT2
String ELEMENT3
Пример:

JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
    "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
    "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
ELEMENT1 = "Студент ";
ELEMENT2 = " получил ";
ELEMENT3 = " по предмету ";

// Студент Иванов получил 5 по предмету Математика
// Студент Петрова получил 4 по предмету Информатика
// Студент Краснов получил 5 по предмету Физика
 */

class Answer {  
    public static StringBuilder answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3){
        // Напишите свое решение ниже
        StringBuilder result = new StringBuilder();
        JSON = JSON.replace("[{", "").replace("}]", "");
        String[] students = JSON.split("\\},");

        for (String student : students) {
            student = student.replace("\"", "").replace("{", "").replace("}", "");
            String[] attributes = student.split(",");
            for (String attribute : attributes) {
                String[] keyValue = attribute.split(":");
                String key = keyValue[0].trim();
                String value = keyValue[1].trim();
                if (key.equals("фамилия")) {
                    result.append(ELEMENT1).append(value).append(ELEMENT2);
                } else if (key.equals("оценка")) {
                    result.append(value).append(ELEMENT3);
                } else if (key.equals("предмет")) {
                    result.append(value).append("\n");
                }
            }
        }
        System.out.println(result);
        return result;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
	public static void main(String[] args) { 
        String JSON = "";
        String ELEMENT1 = "";
        String ELEMENT2 = "";
        String ELEMENT3 = "";
      
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
            ELEMENT1 = "Студент ";
            ELEMENT2 = " получил ";
            ELEMENT3 = " по предмету ";
        }
        else{
            JSON = args[0];
            ELEMENT1 = args[1];
            ELEMENT2 = args[2];
            ELEMENT3 = args[3];
        }     
        
        Answer ans = new Answer();      
        ans.answer(JSON, ELEMENT1, ELEMENT2, ELEMENT3);
	}
}
