package coding.section01.E11_문자열_압축;

import java.util.Scanner;

public class Main {
    // 1. 입력 문자열을 inputString으로 받는다.
    // 2.

    public String solution(String inputString){

        StringBuilder answer = new StringBuilder();
        int count = 1;

        for (int i = 0; i < inputString.length() - 1; i++){

            if (inputString.charAt(i) == inputString.charAt(i+1)){
                count++;

            } else {
                if (count != 1){
                    answer.append(inputString.charAt(i) + Integer.toString((count)));
                    count = 1;
                } else {
                    answer.append(inputString.charAt(i));
                }
            }

        }

        // 마지막 문자 처리
        if (count == 1){
            answer.append(inputString.charAt(inputString.length()-1));
        } else {
            answer.append(inputString.charAt(inputString.length()-1) + Integer.toString((count)));

        }

        return answer.toString();
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        System.out.println(T.solution(input));

    }
}
