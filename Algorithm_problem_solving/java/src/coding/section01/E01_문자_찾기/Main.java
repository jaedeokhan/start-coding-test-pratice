package coding.section01.E01_문자_찾기;

import java.util.Scanner;

public class Main {

    // 1. input 문자열 변수를 입력받는다. 다음 줄에 alpha 변수를 문자를 입력 받는다
    // 2. 문자열 input과 비교할 문자 c를 모두 소문자로 만든다.
    // 3. input을 순회하면서 c와 일치하면 count += 1 을 한다.

    public int solution(String input, char c) {

        int count = 0;
        c = Character.toLowerCase(c);
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            if (c == input.charAt(i)) count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char alpha = scan.nextLine().charAt(0);
        int answer = T.solution(input, alpha);

        System.out.println(answer);
    }
}
