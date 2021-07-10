package level01.E22_시저_암호;

public class Answer01 {

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

            int value = (x + n);
            if (x >= 65 && x <= 90) { // 대문자
                if (value > 90){
                    answer.append((char) (value - 90 + 64));
                } else {
                    answer.append((char) value);
                }
            } else if (x >= 97 && x <= 122){ // 소문자
                if (value > 122){
                    answer.append((char) (value - 122 + 96));
                } else {
                    answer.append((char) value);
                }
            }

        }

        return answer.toString();
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        String[] s = {"AB", "z", "a B z"};
        int[] n = {1, 1, 4};

        for (int i = 0; i < n.length; i++){
            System.out.println(T.solution(s[i], n[i]));
        }
    }

}
