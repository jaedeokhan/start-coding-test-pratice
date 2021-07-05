package coding.section02.E07_점수계산;

import java.util.Scanner;

public class Main_A {


    public int solution(int num, int[] numArray){

        int answer = 0;
        int extraPoint = 0;

        for (int i = 0; i < num; i++){
            if (numArray[i] != 1) { // 오답일 경우
                extraPoint = 0;
                continue;
            }
            // 정답 인경우
            answer += 1 + extraPoint;
            extraPoint++;
        }

        return answer;
    }


    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();
        int[] inputIntArray = new int[inputInt];
        for (int i = 0; i < inputInt; i++){
            inputIntArray[i] = scan.nextInt();
        }

        System.out.println(T.solution(inputInt, inputIntArray));

    }
}
