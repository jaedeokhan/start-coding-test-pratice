package coding.section01.E02_대소문자_변환;

import java.util.Scanner;

public class Main {

    // 1. string 문자열 변수를 string.length()까지 for문을 돌린다.
    // 2-1. if string.charAt(i)가 Lower -> Upper 변환해서 answer에 복합 저장
    // 2-2. else Uppder -> Lower 변환해서 answer에 복합 저장

    public StringBuffer solution(String string) {

        StringBuffer answer = new StringBuffer();
        final int SIZE = string.length();

        for (int i = 0; i < SIZE; i++) {
            if (Character.isLowerCase(string.charAt(i))) {
                answer.append(Character.toUpperCase(string.charAt(i)));
            } else {
                answer.append(Character.toLowerCase(string.charAt(i)));
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        System.out.println(T.solution(string));
    }
}
