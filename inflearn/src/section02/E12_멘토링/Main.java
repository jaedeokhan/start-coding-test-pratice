package section02.E12_멘토링;

import java.io.*;
import java.util.*;

public class Main {
    public int solution(int n, int m, int[][] students) {

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == j) {
                    continue;
                }

                int count = 0;
                for (int testCase = 0; testCase < m; testCase++) {
                    int pi = 0, pj = 0;
                    for (int rank = 0; rank < n; rank++) {
                        if (students[testCase][rank] == i) pi = rank;
                        if (students[testCase][rank] == j) pj = rank;
                    }
                    if (pi < pj) {
                        count++;
                    }
                }
                if (count == m) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] students = new int[m][n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++){
                students[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = T.solution(n, m, students);

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
