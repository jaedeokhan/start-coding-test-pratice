package coding.section01.E05_특정_문자_뒤집기;

import java.util.Scanner;

public class Main_A2 {

    public String solution(String string) {

        String answer;
        char[] s = string.toCharArray();
        int lt = 0, rt = string.length() - 1;

        while (lt < rt){
            if (Character.isAlphabetic(s[lt])) lt++;
            else if (Character.isAlphabetic(s[rt])) rt--;
            else {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(s);

        return answer;
    }

    public static void main(String[] args) {

        Main_A2 T = new Main_A2();
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        System.out.println(T.solution(input));

    }
}
