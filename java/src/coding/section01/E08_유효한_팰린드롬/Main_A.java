package coding.section01.E08_유효한_팰린드롬;

import java.util.Scanner;

public class Main_A {

    public String solution(String string) {

        String answer = "YES";
        string = string.toUpperCase().replaceAll("[^A-Z]", "");
        String reverseString = new StringBuilder(string).reverse().toString();

        if (!string.equals(reverseString)) return "NO";

        return answer;
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        System.out.println(T.solution(input));

    }
}
