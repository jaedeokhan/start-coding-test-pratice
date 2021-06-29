package coding.section03.E05_연속된_자연수의_합;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public int solution(int n) {

        int lt = 0, sum = 0, answer = 0;
        int[] nArray = new int[n];
        for (int i = 1; i <= nArray.length; i++){
            nArray[i-1] = i;
        }

        for (int rt = 0; rt < n-1; rt++){
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

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();

        System.out.print(T.solution(n));

    }
}
