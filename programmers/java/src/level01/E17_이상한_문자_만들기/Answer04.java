package level01.E17_이상한_문자_만들기;

import java.util.Arrays;

public class Answer04 {

    // 짝수번째 알파벳은 대문자로
    // 홀수번째 알파벳은 소문자로
    // 공백으로 구분된 단어별로 짝/홀수 인덱스 판단
    // 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳응로 처리
    public String solution(String s) {

        StringBuilder answer = new StringBuilder();
        String[] strings = s.split("");
        int cnt = 0;

        for (String string : strings){
            cnt = string.contains(" ") ? 0 : cnt + 1;
            answer.append(cnt % 2 == 0 ? string.toLowerCase() : string.toUpperCase());
        }


        return answer.toString();
    }

    public static void main(String[] args) {

        Answer04 T = new Answer04();
        String[] s = {"try hello world", "hello world        "};

        for (int i = 0; i < s.length; i++){
            System.out.println(T.solution(s[i]));
        }

    }

}
