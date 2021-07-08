package level01.E06_핸드폰_번호_가리기;

import org.junit.Test;

import java.util.Scanner;

public class Answer03_regex {

    public String solution(String phoneNumber) {
        // .  : 하나 이상
        // () : 안에 내용을 하나의 묶음
        // ?  : 해당 패던의 앞에 문자가 (1개) 없거나 혹은 한개가 존재
        // ?= : 문자를 제외하고 그앞에 선택한 문자들이 매치된다
        //    - x(?=y) :  x후에 y가 나오고, x부분만 매칭되는 부분으로 간주
        //출처: https://androphil.tistory.com/144?category=423962 [소림사의 홍반장!]
        // {} : 회수 또는 범위를 의미
        return phoneNumber.replaceAll(".(?=.{4})", "*");
    }

    @Test
    public static void main(String[] args) {

        Answer03_regex T = new Answer03_regex();
        String[] phoneNumber = {"01033334444", "027778888"};
        String[] answer = {"*******4444", "*****8888"};

        for (int i = 0; i < phoneNumber.length; i++){
            System.out.println(T.solution(phoneNumber[i]));
        }

    }

}
