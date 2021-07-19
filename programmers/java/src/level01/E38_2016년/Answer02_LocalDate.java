package level01.E38_2016년;

import java.time.LocalDate;

public class Answer02_LocalDate {



    public String solution(int a, int b) {

        LocalDate localDate = LocalDate.of(2016, a, b);

        return localDate.getDayOfWeek().toString().substring(0, 3);
    }

    public static void main(String[] args) {

        Answer02_LocalDate T = new Answer02_LocalDate();
        int a = 5;
        int b = 24;

        System.out.println(T.solution(a, b));
    }

}
