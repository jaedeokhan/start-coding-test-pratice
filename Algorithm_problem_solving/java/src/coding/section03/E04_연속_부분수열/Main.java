package coding.section03.E04_연속_부분수열;

import java.util.Scanner;

public class Main {

    // 시간복잡도 : O(n ^ 2) 해결방법
    // n : 100,000라서 일단 해결

    public int solution(int n, int m, int[] array) {

        int answer = 0;

        for (int i = 0; i < n-1; i++){
            int sum = 0;
            for (int j = i; j < n; j++){
                sum += array[j];
                if (sum == m){
                    answer++;
                    break;
                } else if (sum > m) break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
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
