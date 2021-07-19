package level01.E38_2016년;

public class Answer01 {



    public String solution(int a, int b) {

        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = b - 1;

        for (int i = 0; i < a - 1; i++){
            day += months[i];
        }

        return days[day % 7];
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        int a = 5;
        int b = 24;

        System.out.println(T.solution(a, b));
    }

}
