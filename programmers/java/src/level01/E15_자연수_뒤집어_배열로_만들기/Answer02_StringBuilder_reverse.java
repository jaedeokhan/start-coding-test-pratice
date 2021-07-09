package level01.E15_자연수_뒤집어_배열로_만들기;

import java.util.Arrays;


public class Answer02_StringBuilder_reverse {

    public int[] solution(long num) {

        StringBuilder sb = new StringBuilder(String.valueOf(num)).reverse();
        String[] stringArray = sb.toString().split("");

        int[] answer = new int[stringArray.length];
        for (int i = 0; i < answer.length; i++){
            answer[i] = Integer.parseInt(stringArray[i]);
        }

        return answer;
    }

    public static void main(String[] args) {

        Answer02_StringBuilder_reverse T = new Answer02_StringBuilder_reverse();
        long[] n = {12345};

        for (int i = 0; i < n.length; i++){
            System.out.println(Arrays.toString(T.solution(n[i])));
        }

    }

}
