package coding.section03.E03_최대_매출;

import java.util.Scanner;

public class Main_A1 {

    // 1. for문을 0부터 n-2까지 돈다. largest 변수를 set

    public int solution(int n, int k, int[] nArray) {

        int answer = 0;
        int sum = 0;

        for (int i = 0; i < k; i++){
            answer += nArray[i];
        }

        sum = answer;

        for (int i = k; i < n; i++){
            sum += nArray[i] - nArray[i - k];
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_A1 T = new Main_A1();
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        int k = scan.nextInt();
        int[] nArray = new int[n];
        for (int i = 0; i < n; i++){
            nArray[i] = scan.nextInt();
        }

        System.out.print(T.solution(n, k, nArray));

    }
}
