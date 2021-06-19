package coding.section01.E08_유효한_팰린드롬;

import java.util.Scanner;

public class Main {

    // 1. 대소문자를 구별하지 않기 위해서 string을 대문자화!
    // 2. 알파벳만 체크해서 저장하는 pickAplpa(String str) 메서드 작성
    // 3. string을 팰린드롬인지 체크

    public String pickAlpha(String inputString){

        StringBuilder string = new StringBuilder();

        for (char str : inputString.toCharArray()){
            if ((str >= 65 && str <= 90)){
                string.append(str);
                System.out.println("string = " + string);
            }
        }

        return string.toString();
    }

    public String solution(String string) {

        String answer = "YES";
        string = string.toUpperCase();
        string = pickAlpha(string);
        int length = string.length();

        for (int i = 0; i < length / 2; i++) {
            if (string.charAt(i) != string.charAt(length - i - 1)) {
                return "NO";
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        System.out.println(T.solution(input));

    }
}
