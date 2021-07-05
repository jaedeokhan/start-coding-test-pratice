package coding.section03.E06_최대_길이_연속부분수열;

import java.util.Scanner;

public class Main_A {

    public int solution(int n, int k, int[] nArray) {

        int answer = 0, count = 0, lt = 0;
        for(int rt = 0; rt < n; rt++){
            if(nArray[rt] == 0) count++;
            while (count > k){
                if (nArray[lt] == 0) count--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] nArray = new int[n];
        for (int i = 0; i < n; i++){
            nArray[i] = scan.nextInt();
        }

        System.out.print(T.solution(n, k, nArray));

    }
}
