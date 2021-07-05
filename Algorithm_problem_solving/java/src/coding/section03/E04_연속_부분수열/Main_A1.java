package coding.section03.E04_연속_부분수열;

import java.util.Scanner;

public class Main_A1 {

    // 시간복잡도 : O(n) 해결방법
    // Two pointer

    public int solution(int n, int m, int[] array) {

        int answer = 0;
        int lt = 0, rt = 1, sum = array[lt];

        while (rt < n) {

            sum += array[rt];

            if (sum == m) {
                lt++;
                rt = lt + 1;
                sum = array[lt];
                answer++;
            } else if (sum > m) {
                lt++;
                rt = lt + 1;
                sum = array[lt];
            } else rt++; // sum < m

        }
        return answer;
    }

    public static void main(String[] args) {

        Main_A1 T = new Main_A1();
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
