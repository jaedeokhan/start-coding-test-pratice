package coding.section01.E05_특정_문자_뒤집기;

import java.util.Scanner;

public class Main_A {

    public boolean isAlpha(char a){
        if ( ((a >= 65 && a <= 90) || (a >= 97 && a <= 122))) {
            return true;
        }
        return false;
    }

    public String solution(String string) {

        String answer = "";
        int lt = 0, rt = string.length() - 1;
        char[] charArray = string.toCharArray();

        while (lt < rt) {
            if (!isAlpha(charArray[lt])) lt++;
            else if (!isAlpha(charArray[rt])) rt--;
            else {
                char temp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = temp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(charArray);

        return answer;
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        System.out.println(T.solution(input));

    }
}
