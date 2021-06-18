package coding.section01.E02_대소문자_변환;

import java.util.Scanner;

public class Main_A2 {
    // 아스키 넘버로 해결하는 방법
    // A ~ Z : 65 ~ 90
    // a ~ z : 97 ~ 122
    public String solution(String string) {

        String answer = "";

        for (char x : string.toCharArray()){
            if (x >= 65 && x <= 90) answer += (char)(x + 32);
            else answer += (char)(x - 32);
        }
        
        return answer;
    }

    public static void main(String[] args) {

        Main_A2 T = new Main_A2();
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        System.out.println(T.solution(string));
    }
}
