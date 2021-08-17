package fun.coding.bronze02.E06_다이얼_5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // bronze2 5622번 - 다이얼[https://www.acmicpc.net/problem/5622]
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int totalTime = 0;
        int fixTime = 2; // 처음 다이얼부터 시작하면 2초가 더 걸림
        int[] times = {  // A-Z의 다이얼 기록
                1, 1, 1, 2, 2, 2, 3, 3, 3, 4,
                4, 4, 5, 5, 5, 6, 6, 6, 6, 7,
                7, 7, 8, 8, 8, 8
        };

        for (int i = 0; i < word.length(); i++){
            // time 변수에 times 배열의 인덱스를 word.charAt(i) - 'A'로 각 다이얼의 시간을 가져오고
            // fixTime 변수의 값인 2초를 복합 연산
            totalTime += times[word.charAt(i) - 'A'] + fixTime;
        }

        System.out.println(totalTime);
    }
}
