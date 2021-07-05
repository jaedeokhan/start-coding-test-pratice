package coding.section01.E07_회문문자열;

import java.util.Scanner;

public class Main_A2 {

    public String solution(String string) {

        String answer = "YES";
        String reverseString = new StringBuilder(string).reverse().toString();

        if (!string.equalsIgnoreCase(reverseString)) return "NO";

        return answer;
    }

    public static void main(String[] args) {

        Main_A2 T = new Main_A2();
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        System.out.println(T.solution(input));

    }
}
