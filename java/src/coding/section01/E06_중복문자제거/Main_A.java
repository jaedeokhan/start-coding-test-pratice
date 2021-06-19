package coding.section01.E06_중복문자제거;

import java.util.Scanner;

public class Main_A {

    public String solution(String string) {

        String answer = "";

        for (int i = 0; i < string.length(); i++){
            if (string.indexOf(string.charAt(i)) == i) answer += string.charAt(i);
        }

        return answer;
        
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        System.out.println(T.solution(input));

    }
}
