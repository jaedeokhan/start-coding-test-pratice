package coding.section03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // 1.

    public int[] solution(int n, int m, int[] nArray, int[] mArray) {


        int[] answer = new int[n+m];

        for (int i = 0; i < n; i++){
            answer[i] = nArray[i];
        }

        for (int i = 0; i < m; i++){
            answer[i+n] = mArray[i];
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        int[] nArray = new int[n];
        for (int i = 0; i < n; i++){
            nArray[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        int[] mArray = new int[m];
        for (int i = 0; i < m; i++){
            mArray[i] = scan.nextInt();
        }
        for (int x : T.solution(n, m, nArray, mArray)){
            System.out.print(x + " ");
        }

    }
}
