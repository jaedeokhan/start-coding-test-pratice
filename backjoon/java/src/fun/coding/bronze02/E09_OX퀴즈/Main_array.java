package fun.coding.bronze02.E09_OX퀴즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_array {
    // bronze02 8958번 - OX퀴즈[https://www.acmicpc.net/problem/8958]
    // 문제
    //  - OX 퀴즈에서 O는 문제를 맞은 것이고, X는 틀린 것이다.
    //  - 문제를 맞으면 연속된 가산점이 붙는다.
    // 입력
    //  - 첫째 줄에는 테스트 케이스의 개수가 주어진다.
    //  - 각 테스트 케이스의길이는(0 < T < 80)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[Integer.parseInt(br.readLine())];

        for (int i = 0; i < array.length; i++){
            array[i] = br.readLine();
        }

        for (int i = 0; i < array.length; i++){
            int consecutiveTimes = 0; // 연속횟수
            int cumulativeTotal = 0;  // 총합

            for (int j = 0; j < array[i].length(); j++){
                if (array[i].charAt(j) == 'O') consecutiveTimes++;
                else consecutiveTimes = 0;

                cumulativeTotal += consecutiveTimes;
            }

            System.out.println(cumulativeTotal);
        }

   }
}
