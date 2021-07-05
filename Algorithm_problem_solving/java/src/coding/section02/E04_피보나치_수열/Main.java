package coding.section02.E04_피보나치_수열;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // 1. int[] fibonacci 배열을 num 갯수만큼 공간을 만들고, fibonacci[0], [1] 에 1을 설정
    // 2. for문을 2부터 num의 갯수만큼 돈다.
    // 2-1. fibonacci[i-1] + fibonacci[i-2] 의 값을  fibonacci[i]에 넣어준다.

    public int[] solution(int num){

        int[] answer = new int[num];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < num; i++){
            answer[i] = answer[i-1] + answer[i-2];
        }
        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();

        for (int x : T.solution(inputInt)){
            System.out.print(x + " ");
        }
    }
}
