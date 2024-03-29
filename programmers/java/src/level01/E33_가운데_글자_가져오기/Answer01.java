package level01.E33_가운데_글자_가져오기;

public class Answer01 {

    public String solution(String s) {

        final int sLength = s.length();
        StringBuilder answer = new StringBuilder();

        if (sLength % 2 == 0){
            answer.append(s.charAt(sLength / 2 - 1));
            answer.append(s.charAt(sLength / 2));
        } else {
            answer.append(s.charAt(sLength / 2));
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        String[] s = {"abcde", "qwer"};

        for (int i = 0; i < s.length; i++){
            System.out.println(T.solution(s[i]));
        }
    }

}
