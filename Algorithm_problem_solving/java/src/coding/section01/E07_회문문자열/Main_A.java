package coding.section01.E07_회문문자열;

import java.util.Scanner;

public class Main_A {

    public String solution(String string) {

        String answer = "YES";
        string = string.toUpperCase();
        int length = string.length();

        for (int i = 0; i < length / 2; i++){
            if(string.charAt(i) != string.charAt(length-i-1)){
                return "NO";
            }
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
