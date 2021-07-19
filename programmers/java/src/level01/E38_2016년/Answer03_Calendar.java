package level01.E38_2016년;

import java.util.Calendar;

public class Answer03_Calendar {

    public String solution(int a, int b) {

        String[] days = {"", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, a - 1, b);

        return days[calendar.get(Calendar.DAY_OF_WEEK)];
    }

    public static void main(String[] args) {

        Answer03_Calendar T = new Answer03_Calendar();
        int a = 5;
        int b = 24;

        System.out.println(T.solution(a, b));
    }

}
