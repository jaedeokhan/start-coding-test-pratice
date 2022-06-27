package section02.E10_봉우리;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static final int MATCH_COUNT = 4;

    public int solution(int n, int[][] grid){

        // 입력 : n (2 <= n <= 50)
        // 출력 : 봉우리 개수 - 상하좌우 보다 큰 값
        int answer = 0;
        // 위, 오, 아, 왼
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                boolean isMax = true;
                for (int k = 0; k < MATCH_COUNT; k++){
                    int x = i + dx[k];
                    int y = j + dy[k];

                    if (x >= 0 && x < n && y >= 0 && y < n &&
                        grid[x][y] >= grid[i][j]){
                        isMax = false;
                        break;
                    }
                }
                if (isMax){
                    answer++;
                }
            }

        }

        return answer;
    }


    public static void main(String[] args) throws IOException {

        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] grid = new int[n][n];

        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++){
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bw.write(String.valueOf(T.solution(n, grid)));

        bw.flush();
        bw.close();
    }
}
