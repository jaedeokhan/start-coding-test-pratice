package level01.E16_자릿수_더하기;

import java.util.Arrays;

public class Answer02_String_split {

    public int solution(int num) {

        int answer = 0;
        String[] numbers = String.valueOf(num).split("");

        for (String number : numbers){
            answer += Integer.parseInt(number);
        }

        return answer;
    }

    public static void main(String[] args) {

        Answer02_String_split T = new Answer02_String_split();
        int[] n = {123, 987};

        for (int i = 0; i < n.length; i++){
            System.out.println(T.solution(n[i]));
        }

    }

}
