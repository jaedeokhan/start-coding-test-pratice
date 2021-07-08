package level01.E14_정수_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Collections;

public class Answer02_forEach {

    String answer = "";
    public long solution(long num) {

        Long.toString(num)
                .chars()
                .sorted()
                .forEach(c -> answer = Character.valueOf((char)c) + answer);

        return Long.parseLong(answer.toString());
    }

    public static void main(String[] args) {

        Answer02_forEach T = new Answer02_forEach();
        long[] n = {118372};

        for (int i = 0; i < n.length; i++){
            System.out.println(T.solution(n[i]));
        }

    }

}
