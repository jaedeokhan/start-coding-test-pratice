package coding.section01.E03_문장_속_단어;

import java.util.Scanner;

public class Main_A2 {

    public String solution(String string) {

        String answer = "";
        int max = Integer.MIN_VALUE, position;

        while ((position = string.indexOf(' ')) != -1){
            String temp = string.substring(0, position);
            int length = temp.length();

            if (length > max) {
                max = length;
                answer = temp;
            }

            string = string.substring(position+1); // ' ' 뒤의 값 담기
        }

        if (string.length() > max) answer = string; // 마지막 단어 처리

        return answer;
    }

    public static void main(String[] args) {

        Main_A2 T = new Main_A2();
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        System.out.println(T.solution(string));
    }
}
