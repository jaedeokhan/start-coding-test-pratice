package level01.E22_시저_암호;

public class Answer02 {

    // 문장(s)의 각 알파벳을 일정한 거리(n)만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식
    // ASCII
    // A ~ Z ( 65 ~ 90 )
    // a ~ z ( 97 ~ 122)

    public String solution(String s, int n) {

        StringBuilder answer = new StringBuilder();

        for (char x : s.toCharArray()){
            if (x == ' '){
                answer.append(' ');
                continue;
            }

            if (x >= 65 && x <= 90) { // 대문자 ( A - Z )
                answer.append((char) ((x - 'A' + n) % 26 + 'A') );
            } else if (x >= 97 && x <= 122){ // 소문자 ( a - z )
                answer.append((char) ((x - 'a' + n) % 26 + 'a'));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        Answer02 T = new Answer02();
        String[] s = {"AB", "z", "a B z"};
        int[] n = {1, 1, 4};

        for (int i = 0; i < n.length; i++){
            System.out.println(T.solution(s[i], n[i]));
        }
    }

}
