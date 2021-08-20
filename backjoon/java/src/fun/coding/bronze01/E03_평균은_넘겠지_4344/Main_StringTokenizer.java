package fun.coding.bronze01.E03_평균은_넘겠지_4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_StringTokenizer {
    // bronze01 4344번 - 평균은 넘겠지[https://www.acmicpc.net/problem/4344]
    // 문제
    //  - 대학생 새내기들은 90%는 자신이 반에서 평균은 넘는다고 생각한다.
    //  - 당신은 그들에게 슬픈 진실을 알려줘야 한다.
    // 입력
    //  - 첫째 줄에 테스트 케이스 수 C
    //  - 둘째 줄부터 각 테스트 케이스마다 학생 수  N(1 <= N <= 1,000) 이어서 N명의 점수(0 <= score <= 100)
    // 출력
    //  - 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array;
        int testCase = Integer.parseInt(br.readLine()); // 테스트 케이스의 수
        StringTokenizer st;

        for (int i = 0; i < testCase; i++){
            st = new StringTokenizer(br.readLine(), " "); // 학생 수 및 성적 입력

            int N = Integer.parseInt(st.nextToken()); // 학생 수
            array = new int[N];
            double sum = 0; // 성적 누적합 변수

            // 성적 입력
            for (int j = 0; j < N; j++){
                int score = Integer.parseInt(st.nextToken()); // 성적 저장
                array[j] = score;
                sum += score; // 성적 누적 합
            }

            double mean = (sum / N);
            double count = 0; // 평균 넘는 학생 수 변수

            // 평균 넘는 학생 비율 찾기
            for (int j = 0; j < N; j++){
                if (array[j] > mean) count++;
            }

            System.out.printf("%.3f%%\n", (count / N) * 100);
        }
    }
}
