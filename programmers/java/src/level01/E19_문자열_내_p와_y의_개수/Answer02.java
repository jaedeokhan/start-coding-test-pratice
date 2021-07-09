package level01.E19_문자열_내_p와_y의_개수;

public class Answer02 {

    public boolean solution(String s) {
        s = s.toUpperCase();

        return s.chars().filter(e -> 'P' == e).count() == s.chars().filter(e -> 'Y' == e).count();
    }

    public static void main(String[] args) {

        Answer02 T = new Answer02();
        String s[] = {"pPoooyY", "Pyy"};

        for (int i = 0; i < s.length; i++){
            System.out.println(T.solution(s[i]));
        }
    }

}
