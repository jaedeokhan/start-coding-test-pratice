package coding.section02.E07_점수계산;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public int solution(int num, int[] numArray){

        int answer = 0;
        int extraPoint = 0; // 가산점

        for (int i = 0; i < num; i++){
            if (numArray[i] != 1){ // 정답일 경우
                answer += 1 + extraPoint;
                extraPoint++;
            } else {
                extraPoint = 0;
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();
        int[] inputIntArray = new int[inputInt];
        for (int i = 0; i < inputInt; i++){
            inputIntArray[i] = scan.nextInt();
        }

        System.out.println(T.solution(inputInt, inputIntArray));

    }
}
