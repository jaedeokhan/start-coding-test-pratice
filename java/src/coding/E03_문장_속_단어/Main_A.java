package coding.E03_문장_속_단어;

import java.util.Scanner;

public class Main_A {

    public String solution(String string) {

        String answer = "";
        int max = Integer.MIN_VALUE;
        String[] stringArray = string.split(" ");

        for (String s : stringArray) {
            int length = s.length();
            if(length > max){ // 5 > 5와 같이 같은 숫자가 나와도 통과
                max = length;
                answer = s;
            }
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
