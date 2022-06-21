package section02.E09_격자판_최대합;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public int solution(int n, int[][] grid){

        int max = 0;

        for (int i = 0; i < n; i++){
            int leftRightSum = 0;
            int topBottomSum = 0;
            for (int j = 0; j < n; j++){
                leftRightSum += grid[i][j];
                topBottomSum += grid[j][i];
            }

            max = Math.max(leftRightSum, max);
            max = Math.max(topBottomSum, max);
        }

        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        for (int i = 0; i < n; i++){
            leftDiagonalSum += grid[i][i];
            rightDiagonalSum += grid[n - i - 1][i];
        }

        max = Math.max(leftDiagonalSum, max);
        max = Math.max(rightDiagonalSum, max);

        return max;
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

        bw.write(String.valueOf(T.solution(n, grid)) + " ");

        bw.flush();
        bw.close();
    }
}
