package level01.E13_정수_제곱근_판별;

import java.util.Arrays;

public class Answer01 {

    public long solution(long num) {

        long answer = -1;

        for (long i = 1; i <= num; i++){
            if (i * i == num){
                return (i + 1) * (i + 1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        long[] n = {121, 3};

        for (int i = 0; i < n.length; i++){
            System.out.println(T.solution(n[i]));
        }

    }

}
