package coding.section01.E07_회문문자열;

import java.util.Scanner;

public class Main {

    // 1. 대소문자를 구별하지 않기에 string을 모두 소문자로 처리!
    // 2. 문자열의 인덱스를 접근하기 위한 lt, rt 를 set
    // 3. while (lt < rt) 즉, lt가 rt보다 작을때 까지 반복문을 돌린다.
    // 3-1. if string[lt] != string[rt] return "NO" 처리
    // 3-2. 위의 구문을 통과하면 "YES" 처리

    public String solution(String string) {

        String answer = "YES";
        string = string.toLowerCase();
        char[] stringArray = string.toCharArray();
        int lt = 0, rt = string.length() - 1;

        while (lt < rt){

            if (stringArray[lt] != stringArray[rt]){
                return "NO";
            }
            lt++;
            rt--;
        }

        return answer;
        
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        System.out.println(T.solution(input));

    }
}
