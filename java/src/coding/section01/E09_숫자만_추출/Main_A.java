package coding.section01.E09_숫자만_추출;

import java.util.Scanner;

public class Main_A {
    // 1. 숫자 아스키 코드는 48 ~ 57이기에, string을 반복문을 돌려서
    // if c >= 48 && c <= 57 이면 answe = answer * 10 + (c - 48)를 반복한다.
    public int solution(String string) {

        int answer = 0;

        for (char s : string.toCharArray()){
            if (s >= 48 && s <= 57){
                answer = answer * 10 + (s - 48);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        System.out.println(T.solution(input));

    }
}
