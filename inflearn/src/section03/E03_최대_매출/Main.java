package section03.E03_최대_매출;

import java.util.*;
import java.io.*;

public class Main {

    public int solution(int n, int k, int[] money){

        int answer = 0;
        int sum = 0;

        for (int i = 0; i < k; i++){
            sum += money[i];
        }

        // Sliding Window
        for (int i = k; i < n; i++){
            sum += (money[i] - money[i - k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Main T = new Main();

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int[] money = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++){
            money[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(T.solution(n, k, money)));
        bw.flush();
        bw.close();
    }
}