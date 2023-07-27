package Seminar_2.HW_2.Task_1;

/*
Дана строка sql-запроса:

select * from students where .

Сформируйте часть WHERE этого запроса, используя StringBuilder. Пример данных для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.

Пример:

{"name": "Ivanov", "country": "Russia", "city": "Moscow", "age": "null"}
Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:

String QUERY - начало SQL-запроса
String PARAMS - JSON с параметрами
 */


class Answer {  
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
        String res = PARAMS.substring(1, (PARAMS.length() - 2));
        String[] params = res.split("\"|\":|\",| \n");
        StringBuilder builder = new StringBuilder(QUERY);
        for (int i = 3; i < params.length; i += 4) {
            if (!params[i].equals("null")) {
                builder.append(params[i - 2]).append("=").append("'").append(params[i]).append("'").append(" and ");
            }
        }
        return builder.delete(builder.length() - 5, builder.length());
    }
    // select * from students where name='Ivanov' and country='Russia' and city='Moscow'
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
	public static void main(String[] args) { 
      String QUERY = "";
      String PARAMS = "";
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        QUERY = "select * from students where ";
	    PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
      }
      else{
        QUERY = args[0];
        PARAMS = args[1];
      }     
      
      Answer ans = new Answer();      
      System.out.println(ans.answer(QUERY, PARAMS));
	}
}       
    