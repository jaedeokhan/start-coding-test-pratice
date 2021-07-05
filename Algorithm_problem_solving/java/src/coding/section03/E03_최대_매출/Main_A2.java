package coding.section03.E03_최대_매출;

import java.util.Scanner;

public class Main_A2 {

    public int solution(int n, int k, int[] arr) {

        int answer = 0, sum = 0;

        // 첫 번째 윈도우 만들기
        for (int i = 0; i < k; i++) sum += arr[i];
        answer = sum;

        // O(n) -> Sliding Window
        for (int i = k; i < n; i++){
            sum += (arr[i] - arr[i-k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_A2 T = new Main_A2();
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
