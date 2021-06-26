package coding.section03.E03_최대_매출;

import java.util.Scanner;

public class Main_F_시간초과 {

    // 1. for문을 0부터 n-2까지 돈다. largest 변수를 set
    // 1-1. for문을 0부터 k까지 돈다.
    // 1-1-1. temp에 k까지의 합을 더한다.
    // 1-2. max를 구한다.

    // 해당 방식은 O(n ^ 2) 방식이여서 시간초과가 난다.
    // O(n)으로 해결 가능한 방식을 찾기 => Sliding window

    public int solution(int n, int k, int[] nArray) {

        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < (n-k)+1; i++){
            int temp = 0;
            for (int j = 0; j < k; j++){
                temp += nArray[i+j];
            }
            answer = Math.max(answer, temp);
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_F_시간초과 T = new Main_F_시간초과();
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
