package level01.E33_가운데_글자_가져오기;

public class Answer03 {

    public String solution(String s) {

        return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
    }

    public static void main(String[] args) {

        Answer03 T = new Answer03();
        String[] s = {"abcde", "qwer"};

        for (int i = 0; i < s.length; i++){
            System.out.println(T.solution(s[i]));
        }
    }

}
