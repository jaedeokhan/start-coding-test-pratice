package level01.E17_이상한_문자_만들기;

import java.util.Arrays;

public class Answer03 {

    // 짝수번째 알파벳은 대문자로
    // 홀수번째 알파벳은 소문자로
    // 공백으로 구분된 단어별로 짝/홀수 인덱스 판단
    // 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳응로 처리
    public String solution(String s) {

        StringBuilder answer = new StringBuilder();
        String[] str = s.split("");

        System.out.println(Arrays.toString(str));

        int idx = 0;
        for(int i=0; i<str.length; i++) {
            if(str[i].equals(" ")) {
                idx = 0;
            } else if(idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } else if(idx % 2 != 0) {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer.append(str[i]);
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        Answer03 T = new Answer03();
        String[] s = {"try hello world", "hello world        "};

        for (int i = 0; i < s.length; i++){
            System.out.println(T.solution(s[i]));
        }

    }

}
