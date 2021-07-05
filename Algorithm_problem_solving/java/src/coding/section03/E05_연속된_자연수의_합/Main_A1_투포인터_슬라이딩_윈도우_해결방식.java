package coding.section03.E05_연속된_자연수의_합;

import java.util.Scanner;

public class Main_A1_투포인터_슬라이딩_윈도우_해결방식 {

    // 연속된 값을 (n // 2) + 1 숫자까지 연산해준다.

    public int solution(int n) {

        int answer = 0, sum = 0, lt = 0;
        int middleValue = n / 2 + 1;
        int[] nArray = new int[middleValue];
        for (int i = 0; i < middleValue; i++){
            nArray[i] = i + 1;
        }

        for (int rt
             = 0; rt < middleValue; rt++){
            sum += nArray[rt];

            if (sum == n) answer++;
            while (sum >= n){
                sum -= nArray[lt++];
                if (sum == n) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_A1_투포인터_슬라이딩_윈도우_해결방식 T = new Main_A1_투포인터_슬라이딩_윈도우_해결방식();
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();

        System.out.print(T.solution(n));

    }
}
