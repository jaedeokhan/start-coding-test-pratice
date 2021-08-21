package fun.coding.bronze02.E11_하얀_칸;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // bronze02 1100번 - 하얀 칸[https://www.acmicpc.net/problem/1100]
    // 문제 - 체스판은 8 * 8크기이고, 검정 칸과 하얀 칸이 번갈아가면서 색칠되어 있다.
    //  가장 왼쪽 위칸(0,0)은 하얀색이다. 체스판에 상태가 주어졌을 때,
    //  하얀 칸 위에 말이 몇 개 있는지 출력
    // 입력 - 8개의 줄 체스판의 상태가 주어진다. '.'은 빈 칸, 'F'는 위에 말이 있는 칸
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] chessBoard = new String[8];
        int answer = 0;

        // 체스판 세팅
        for (int i = 0; i < 8; i++){
            chessBoard[i] = br.readLine();
        }

        for (int i = 0; i < 8; i++){
            if (i % 2 == 0){ // 짝수이면
                for (int j = 0; j < 8; j += 2){ // 0, 2, 4, 6 체크
                    if (chessBoard[i].charAt(j) == 'F') answer++;
                }
            } else { // 홀수이면
                for (int j = 1; j < 8; j += 2){ // 1, 3, 5, 7 체크
                    if (chessBoard[i].charAt(j) == 'F') answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
