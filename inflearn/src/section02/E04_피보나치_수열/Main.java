package section02.E04_피보나치_수열;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public int[] solution(int n){

        //  입력 : 총 항수(3 <= n <= 45)
        //  출력 : 첫 줄에 피보나치 수열 배열
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(1);
        answer.add(1);
        int leftValue = 1, rightValue = 1;

        while (answer.size() < n){
            int temp = leftValue;
            leftValue = rightValue;
            rightValue += temp;

            answer.add(rightValue);
        }

        return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();

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
