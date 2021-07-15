package level01.E33_가운데_글자_가져오기;

public class Answer02 {

    public String solution(String s) {

        int sLength = s.length();

        if (sLength % 2 == 0){
            s = s.substring((sLength / 2) - 1, (sLength / 2) + 1);
        } else {
            s = s.substring((sLength / 2), (sLength / 2) + 1);
        }

        return s;
    }

    public static void main(String[] args) {

        Answer02 T = new Answer02();
        String[] s = {"abcde", "qwer"};

        for (int i = 0; i < s.length; i++){
            System.out.println(T.solution(s[i]));
        }
    }

}
