package coding.section02.E07_점수계산;

import java.util.Scanner;

public class Main_A2 {


    public int solution(int num, int[] numArray){

        int answer = 0, extraPoint = 0;

        for (int i = 0; i < num; i++){
            if (numArray[i] == 1){
                extraPoint++;
                answer += extraPoint;
            } else {
                extraPoint = 0;
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        Main_A2 T = new Main_A2();
        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();
        int[] inputIntArray = new int[inputInt];
        for (int i = 0; i < inputInt; i++){
            inputIntArray[i] = scan.nextInt();
        }

        System.out.println(T.solution(inputInt, inputIntArray));

    }
}
