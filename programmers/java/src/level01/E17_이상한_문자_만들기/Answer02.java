package level01.E17_이상한_문자_만들기;

import java.util.Arrays;

public class Answer02 {

    // 짝수번째 알파벳은 대문자로
    // 홀수번째 알파벳은 소문자로
    // 공백으로 구분된 단어별로 짝/홀수 인덱스 판단
    // 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳응로 처리
    public String solution(String s) {

        StringBuilder answer = new StringBuilder();
        String[] words = s.split(" ", -1);

        System.out.println(Arrays.toString(words));

        for (String word : words){
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < word.length(); i++){
                if (i % 2 == 0){ // 문자의 인덱스가 짝수이면 => 대문자
                    answer.append(Character.toUpperCase(word.charAt(i)));
                } else { // 홀수이면 => 소문자
                    answer.append(Character.toLowerCase(word.charAt(i)));
                }
            }
            answer.append(" ");
        }

        System.out.println(answer.length());

        return answer.toString().substring(0, answer.length()-1);
    }

    public static void main(String[] args) {

        Answer02 T = new Answer02();
        String[] s = {"try hello world", "hello world        "};

        for (int i = 0; i < s.length; i++){
            System.out.println(T.solution(s[i]));
        }

    }

}
