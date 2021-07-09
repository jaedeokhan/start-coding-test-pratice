package level01.E20_문자열_다루기_기본;

public class Answer02_regex {

    public boolean solution(String s) {

        return s.matches("^[0-9]{4}|\\{6}$");
    }

    public static void main(String[] args) {

        Answer02_regex T = new Answer02_regex();
        String s[] = {"a234", "1234"};

        for (int i = 0; i < s.length; i++){
            System.out.println(T.solution(s[i]));
        }
    }

}
