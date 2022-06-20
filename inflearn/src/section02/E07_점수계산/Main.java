package section02.E07_점수계산;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public int solution(int n, int[] scores){

        // 입력 : 첫째 줄 문제의 개수(1 <= N <= 100)
        //        둘째 줄 N개의 문제 채점 결과(0, 1) 배열
        //           - 0 : 틀린 경우, 1 : 맞은 경우
        // 출력 : 총 점수

        // 0. int extraPoint = 0; // 가산점
        // 1. for문을 n만큼 반복한다.
        // 1.1. if scores[i] == 1이면
        // 1.1.1. extraPoint++;
        // 1.1.2. answer += extraPoint
        // 1.2. if scores[i] == 0이면
        // 1.2.1. extraPoint = 0;

        int answer = 0, extraPoint = 0;

        for (int i = 0; i < n; i++){
            if (scores[i] == 1){
                extraPoint++;
                answer += extraPoint;
            }

            if (scores[i] == 0){
                extraPoint = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] scores = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++){
            scores[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(T.solution(n, scores)));

        bw.flush();
        bw.close();
    }
}
