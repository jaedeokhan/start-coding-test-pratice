package coding.section03.E04_연속_부분수열;

import java.util.Scanner;

public class Main_A2 {

    // 시간복잡도 : O(n) 해결방법
    // Two pointer

    public int solution(int n, int m, int[] array) {

        int answer = 0, lt = 0, sum = 0;

        for (int rt = 0; rt < n; rt++){
            sum += array[rt];

            if (sum == m) answer++;
            while (sum >= m) {
                sum -= array[lt++];
                if (sum == m) answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {

        Main_A2 T = new Main_A2();
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        int m = scan.nextInt();
        int[] nArray = new int[n];
        for (int i = 0; i < n; i++){
            nArray[i] = scan.nextInt();
        }

        System.out.print(T.solution(n, m, nArray));

    }
}
