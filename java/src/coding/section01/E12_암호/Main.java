package coding.section01.E12_암호;

import java.util.Scanner;

public class Main {

    // 1. inputString을 7개씩 끊어서 반복한다.
    // 2. inputString은 #과 *로 구성, # -> 1, * -> 0으로 변경
    // 3. 변경된 100001과 같은 이진수를 10진수로 변경
    // 4. 10진수를 다시 아스키 번호 문자로 변경


    public String solution(int num, String inputString){

        StringBuilder answer = new StringBuilder();

        for (int i = 0, j = 0, k = 7; i < num; i++, j += 7, k += 7){


            // 1~2. 각 문자열 7개씩 끊고, # -> 1, * -> 0
            String binaryCode = inputString.substring(j,k)
                                           .replaceAll("#", "1")
                                           .replaceAll("\\*", "0");
            // 에스터리스크(*)는 정규표현식 사용 문자이기에 \\를 붙여준다.;

            // 3. "1000011" == 2진수를 10진수로!
            int decimal = Integer.parseInt(binaryCode, 2);

            // 4. 10진수를 -> 아스키 코드
            answer.append((char) decimal);
        }


        return answer.toString();
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        int inputInt = Integer.parseInt(scan.nextLine());
        String inputString = scan.nextLine();

        System.out.println(T.solution(inputInt, inputString));

    }
}
