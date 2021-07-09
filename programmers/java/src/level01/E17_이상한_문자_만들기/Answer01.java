package level01.E17_이상한_문자_만들기;

import java.util.Arrays;
import java.util.Collections;

public class Answer01 {

    // 짝수번째 알파벳은 대문자로
    // 홀수번째 알파벳은 소문자로
    // 공백으로 구분된 단어별로 짝/홀수 인덱스 판단
    // 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳응로 처리
    public String solution(String s) {

        StringBuilder answer = new StringBuilder();
        String[] words = s.split(" ", -1);

        for (int i = 0; i < words.length; i++){
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < words[i].length(); j++){
                // 짝수만 대문자로
                if (j % 2 == 0){ // 각 단어가 짝수이면
                    temp.append(Character.toUpperCase(words[i].charAt(j)));
                } else {
                    temp.append(Character.toLowerCase(words[i].charAt(j)));
                }
            }
            answer.append(" " + temp);
        }

        return answer.toString().substring(1);
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        String s = "try hello world";

        System.out.println(T.solution(s));
    }

}
