package Seminar_2.HW_2.Task_3;

public class test {
    public static void main(String[] args) {
        String JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
        	"{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
        	"{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
	    String ELEMENT1 = "Студент ";
        String ELEMENT2 = " получил ";
        String ELEMENT3 = " по предмету ";
        answer(JSON, ELEMENT1, ELEMENT2, ELEMENT3);
    }
    
    public static StringBuilder answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3) {
        StringBuilder result = new StringBuilder();
        JSON = JSON.replace("[", "").replace("]", "");
        String[] objects = JSON.split(",");
        // for (String s : objects) {
        //         System.out.println(s);
        // }
        for (String obj : objects) {
            obj = obj.replace("{", "").replace("}", "");
            String[] keyValue = obj.split(":");
            // for (int i = 0; i < keyValue.length; i ++) {
            //     System.out.println(i + " " + keyValue[i]);
            // }
            String surname = "";
            String grade = "";
            String subject = "";

            for (int i = 0; i < keyValue.length; i++) {
                String key = keyValue[i].replace("\"", "");
                //System.out.println(key);
                String value = keyValue[++i].replace("\"", "");
                //System.out.println(value);
                if (key.equals("фамилия")) {
                    surname = value;
                } else if (key.equals("оценка")) {
                    grade = value;
                } else if (key.equals("предмет")) {
                    subject = value;
                }
            }
            result.append(ELEMENT1).append(surname).append(ELEMENT2).append(grade)
                .append(ELEMENT3).append(subject).append("\n");
            }
        System.out.println(result);
        return result;
    }
}
