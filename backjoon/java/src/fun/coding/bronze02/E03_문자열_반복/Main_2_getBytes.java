package fun.coding.bronze02.E03_문자열_반복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2_getBytes {
    // bronze2 - 2675번 - 문자열 반복[https://www.acmicpc.net/problem/2675]
    // 문자열 S를 입력받은 후에, 각 문자를 R번 반복해서 새 문자열 P를 만든 후 출력

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 입력

        for (int i = 0; i < T; i++){ // 테스트 케이스만큼 반복
            StringBuilder P = new StringBuilder();
            String[] values = br.readLine().split(" ");
            int R = Integer.parseInt(values[0]); // 반복횟수 입력
            String S = values[1]; // 문자열 입력

            for (byte value : S.getBytes()){
                for (int k = 0; k < R; k++){ // 반복횟수만큼 반복
                    P.append((char) value);
                }
            }

            System.out.println(P);
        }
    }
}
