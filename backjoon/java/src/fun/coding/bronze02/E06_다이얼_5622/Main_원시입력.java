package fun.coding.bronze02.E06_다이얼_5622;

import java.io.IOException;

public class Main_원시입력 {
    // bronze2 5622번 - 다이얼[https://www.acmicpc.net/problem/5622]
    public static void main(String[] args) throws IOException {
        int totalTime = 0;    // 총 시간 저장 변수
        int fixTime = 2; // 처음 다이얼부터 시작하면 2초가 더 걸림
        int value;       // 원시 타입 입력을 받을 변수
        int[] times = {  // A-Z의 다이얼 기록
                1, 1, 1, 2, 2, 2, 3, 3, 3, 4,
                4, 4, 5, 5, 5, 6, 6, 6, 6, 7,
                7, 7, 8, 8, 8, 8
        };

        while (true){

            value = System.in.read();

            if (value == '\n') break;

            totalTime += times[value - 'A'] + fixTime;
        }

        System.out.println(totalTime);
    }
}
