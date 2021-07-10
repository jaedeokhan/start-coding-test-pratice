package level01.E26_문자열_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Answer01 {

    public String solution(String s) {

        char[] sValues = s.toCharArray();
        Arrays.sort(sValues);

        return new StringBuilder(new String(sValues)).reverse().toString();
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        String s = "Zbcdefg";

        System.out.println(T.solution(s));
    }

}
