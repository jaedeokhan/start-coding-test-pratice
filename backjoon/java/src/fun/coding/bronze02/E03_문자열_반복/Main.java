package fun.coding.bronze02.E03_문자열_반복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // bronze2 - 2675번 - 문자열 반복[https://www.acmicpc.net/problem/2675]
    // 문자열 S를 입력받은 후에, 각 문자를 R번 반복해서 새 문자열 P를 만든 후 출력
    // 1. 테스트 케이스 수인(T)를 입력받는다.
    // 2. for i = 0 to T까지 반복한다.
    // 2-1. 반복 출력할 StringBuilder P를 생성, 반복 횟수 R과 문자열 S를 각각 입력받는다.
    // 2-2. for j = 0 to R까지 반복한다.
    // 2-2-1.  P.add(S)
    // 2-3. P를 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 입력

        for (int i = 0; i < T; i++){ // 테스트 케이스만큼 반복
            StringBuilder P = new StringBuilder();
            String[] values = br.readLine().split(" ");
            int R = Integer.parseInt(values[0]); // 반복횟수 입력
            String S = values[1]; // 문자열 입력

            for (int j = 0; j < S.length(); j++){ // 문자열의 갯수만큼 반복
                for (int k = 0; k < R; k++){ // 반복횟수만큼 반복
                    P.append(S.charAt(j));
                }
            }

            System.out.println(P);
        }
    }
}
