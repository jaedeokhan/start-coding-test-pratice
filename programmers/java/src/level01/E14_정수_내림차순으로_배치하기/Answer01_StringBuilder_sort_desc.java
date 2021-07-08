package level01.E14_정수_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Collections;

public class Answer01_StringBuilder_sort_desc {

    public long solution(long num) {

        String[] stringArray = String.valueOf(num).split("");
        StringBuilder answer = new StringBuilder();
        Arrays.sort(stringArray, Collections.reverseOrder());

        for (String s : stringArray){
            answer.append(s);
        }

        return Long.parseLong(answer.toString());
    }

    public static void main(String[] args) {

        Answer01_StringBuilder_sort_desc T = new Answer01_StringBuilder_sort_desc();
        long[] n = {118372};

        for (int i = 0; i < n.length; i++){
            System.out.println(T.solution(n[i]));
        }

    }

}
