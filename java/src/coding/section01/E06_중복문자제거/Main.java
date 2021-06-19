package coding.section01.E06_중복문자제거;

import java.util.Scanner;

public class Main {
    // 1. 입력값 string 문자열을 for문을 string.length()까지 반복한다.
    // 2. answer에 해당 문자가 존재하지 않으면 문자형 c를 answre에 넣는다.

    public String solution(String string) {

        String answer = "";

        for (char s : string.toCharArray()){
            if (answer.indexOf(s) == -1){
                answer += s;
            }
        }

        return answer;
        
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        System.out.println(T.solution(input));

    }
}
