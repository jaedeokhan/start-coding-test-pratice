package level01.E15_자연수_뒤집어_배열로_만들기;

import java.util.Arrays;

public class Answer01_int_array {

    public int[] solution(long num) {

        int[] answer = new int[String.valueOf(num).length()];

        int i = 0;
        while (num > 0){
            answer[i++] = (int) (num % 10);
            num /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {

        Answer01_int_array T = new Answer01_int_array();
        long[] n = {12345};

        for (int i = 0; i < n.length; i++){
            System.out.println(Arrays.toString(T.solution(n[i])));
        }

    }

}
