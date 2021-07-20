package level01.E38_2016년;

import java.util.Calendar;
import java.util.Locale;

public class Answer04_Calendar_활용 {

    public String solution(int a, int b) {

        Calendar calendar = new Calendar.Builder().setCalendarType("iso8601")
                .setDate(2016, a - 1, b).build();

        return calendar.getDisplayName(Calendar.DAY_OF_WEEK,
                Calendar.SHORT,
                new Locale("ko-KR")).toUpperCase();
    }

    public static void main(String[] args) {

        Answer04_Calendar_활용 T = new Answer04_Calendar_활용();
        int a = 5;
        int b = 24;

        System.out.println(T.solution(a, b));
    }

}
