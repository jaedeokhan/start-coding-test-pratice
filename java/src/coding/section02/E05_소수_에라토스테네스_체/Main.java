package coding.section02.E05_소수_에라토스테네스_체;

import java.util.Scanner;

public class Main {

    // 1부터 N개까지의 소수의 갯수를 판별해서 출력
    // 1. 자연수 num을 입력받는다.
    // 2. for문을 2부터 num+1까지 반복한다.
    // 2-1. for 문을 2부터 i까지 반복한다.
    // 2-1-1. if i % j == 0 이면 count += 1

    // 시간 초과 : Time Limit Exceeded
    public int solution(int num){

        int answer = 0;

        for (int i = 2; i < num + 1; i++){
            boolean isPrime = true;

            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                answer++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();

        System.out.println(T.solution(inputInt));
    }
}
