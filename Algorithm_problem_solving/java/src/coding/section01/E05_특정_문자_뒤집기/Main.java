package coding.section01.E05_특정_문자_뒤집기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // 1. 입력 문자열 string을 받는다. lt, rt 변수를 set한다.
    // 2. sring을 toCharArray로 char[] 배열로 받는다.
    // 3. while (lt < rt) 성립할 때까지 반복한다.
    // 3-1. if charArray[lt]와 [rt]가 아스키 코드 상 65~90, 97~122이면 교환해준다.
    // 4. String.valueOf()를 통해서 변수에 할당한다.

    public String solution(String string) {

        String answer = "";
        int lt = 0, rt = string.length() - 1;
        char[] charArray = string.toCharArray();

        System.out.println(string.length());

        while (lt < rt){
            if (!Character.isAlphabetic(charArray[lt])) lt++;
            else if (!Character.isAlphabetic(charArray[rt])) rt--;
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

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        System.out.println(T.solution(input));

    }
}
