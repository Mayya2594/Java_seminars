package Seminar_2.HW_2.Task_1;
public class test {
    public static void main(String[] args) {
        String str = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        String QUERY = "select * from students where ";
        System.out.println(task1(str, QUERY));
    }

    static StringBuilder task1(String str, String QUERY){
        String res = str.substring(1, (str.length() - 2));
        String[] params = res.split("\"|\":|\",| \n");
        StringBuilder builder = new StringBuilder(QUERY);
        for (int i = 3; i < params.length; i += 4) {
            if (params[i].equals("null")) {
            } else {
                builder.append(params[i - 2]).append(" = ").append(params[i]).append(" AND ");
            }
        }
        return builder.delete(builder.length() - 5, builder.length());
    }

}
