package coding.section01.E09_숫자만_추출;

import java.util.Scanner;

public class Main_A2 {
    // 1. 숫자 아스키 코드는 48 ~ 57이기에, string을 반복문을 돌려서
    // if c >= 48 && c <= 57 이면 answe = answer * 10 + (c - 48)를 반복한다.
    public int solution(String string) {

        String answer = "";

        for (char s : string.toCharArray()){
            if (Character.isDigit(s)){
                answer += s;
            }
        }

        // 0208 -> 208 parseInt를 통해서 해도 해결이 가능
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {

        Main_A2 T = new Main_A2();
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        System.out.println(T.solution(input));

    }
}
