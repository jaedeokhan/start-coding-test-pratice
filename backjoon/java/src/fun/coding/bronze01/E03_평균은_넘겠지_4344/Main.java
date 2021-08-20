package fun.coding.bronze01.E03_평균은_넘겠지_4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    // bronze01 4344번 - 평균은 넘겠지[https://www.acmicpc.net/problem/4344]
    // 문제
    //  - 대학생 새내기들은 90%는 자신이 반에서 평균은 넘는다고 생각한다.
    //  - 당신은 그들에게 슬픈 진실을 알려줘야 한다.
    // 입력
    //  - 첫째 줄에 테스트 케이스 수 C
    //  - 둘째 줄부터 각 테스트 케이스마다 학생 수  N(1 <= N <= 1,000) 이어서 N명의 점수(0 <= score <= 100)
    // 출력
    //  - 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력
    // 문제접근
    //  - 테스트 케이스 수인 C를 입력받는다.
    //  - for i to C까지 반복한다.
    //  - 총합 / 학생의 수로 평균을 구한다.
    //  - 평균이 넘는 학생들의 수를 구해서 소수점 셋제 짜리까지 출력
    public static int[] getIntArray(String[] values){
        int[] array = new int[values.length];

        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(values[i]);
        }

        return array;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine()); // 테스트 케이스의 수

        for (int i = 0; i < C; i++){
            // studentAndScores[0]번째는 학생 수, 1 ~ studentAndScores[0]번째는 학생의 점수
            int[] studentAndScores = getIntArray(br.readLine().split(" "));
            int scoresTotal = 0;  // 점수 총합
            double scoreAverage = 0; // 점수 평균
            int studentCount = studentAndScores[0];
            int highScoreStudent = 0;

            for (int j = 1; j <= studentCount; j++){
                scoresTotal += studentAndScores[j]; // 점수 총합 구하기
            }

            scoreAverage = (double) scoresTotal / studentCount; // 점수 평균 구하기

            for (int j = 1; j <= studentCount; j++){
                // 평균 값보다 높은 학생 증감
                if (studentAndScores[j] > scoreAverage) highScoreStudent++;
            }

            System.out.printf("%.3f%%\n", ((double) highScoreStudent / studentCount) * 100);
        }
    }
}
