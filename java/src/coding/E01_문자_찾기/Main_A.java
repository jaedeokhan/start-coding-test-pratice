package coding.E01_문자_찾기;

import java.util.Scanner;

public class Main_A {

    public int solution(String string, char alpha) {

        int answer= 0;
        string = string.toUpperCase();
        alpha = Character.toUpperCase(alpha);

        for (char c : string.toCharArray()) {
            if (alpha == c) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_A T = new Main_A();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char alpha = kb.next().charAt(0);

        System.out.println(T.solution(str, alpha));
    }

}
