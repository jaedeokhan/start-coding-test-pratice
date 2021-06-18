package coding.E02_대소문자_변환;

import java.util.Scanner;

public class Main_A {

    public String solution(String string) {

        String answer = "";

        for (char x : string.toCharArray()){
            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }
        
        return answer;
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        System.out.println(T.solution(string));
    }
}
