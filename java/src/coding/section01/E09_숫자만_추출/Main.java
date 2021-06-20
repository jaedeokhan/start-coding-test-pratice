package coding.section01.E09_숫자만_추출;

import java.util.Scanner;

public class Main {
    // 1. 입력값인 string 문자열에서 정규표현식으로 숫자를 제외하고 모두 공백처리한다.
    public int solution(String string) {

        String answerString = string.replaceAll("[^0-9]", "");
        int zeroIndex = 0;

        for(int i = 0; i < answerString.length(); i++){
            if (answerString.charAt(i) != '0'){
                zeroIndex = i;
                break;
            }
        }

        int answerInt = Integer.parseInt(answerString.substring(zeroIndex));

        return answerInt;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        System.out.println(T.solution(input));

    }
}
