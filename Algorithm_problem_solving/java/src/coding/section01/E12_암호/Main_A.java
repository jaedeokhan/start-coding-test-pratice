package coding.section01.E12_암호;

import java.util.Scanner;

public class Main_A {

    public String solution(int num, String inputString){

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < num; i++){
            String tempString = inputString.substring(0, 7)
                                .replace("#", "1")
                                .replace("*", "0");

            inputString = inputString.substring(7); // inputString 초기화

            int decimal = Integer.parseInt(tempString, 2); // 2진수 -> 10진수

            answer.append((char) decimal); // 10진수 -> 아스키 코드
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();
        String inputString = scan.next();

        System.out.println(T.solution(inputInt, inputString));

    }
}
