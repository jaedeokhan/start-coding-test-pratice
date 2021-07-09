package level01.E20_문자열_다루기_기본;

public class Answer01 {

    public boolean solution(String s) {

        return (s.length() == s.chars().filter(x -> Character.isDigit(x)).count())
                && (s.length() == 4 || s.length() == 6);
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        String s[] = {"a234", "1234"};

        for (int i = 0; i < s.length; i++){
            System.out.println(T.solution(s[i]));
        }
    }

}
