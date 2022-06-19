package section02.E04_피보나치_수열;

import java.io.*;
import java.util.ArrayList;

public class Main_Array {

    private static final int FIBO_START_INDEX = 2;

    public int[] solution(int n){

        //  입력 : 총 항수(3 <= n <= 45)
        //  출력 : 첫 줄에 피보나치 수열 배열
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = FIBO_START_INDEX; i < n; i++) {
            int leftValue = answer[i - FIBO_START_INDEX];
            int rightValue = answer[i - 1];
            answer[i] = leftValue + rightValue;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        Main_Array T = new Main_Array();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int number : T.solution(n)){
            bw.write(String.valueOf(number) + " ");
        }

        bw.flush();
        bw.close();
    }
}
