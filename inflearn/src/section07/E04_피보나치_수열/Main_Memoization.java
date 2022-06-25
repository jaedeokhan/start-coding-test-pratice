package section07.E04_피보나치_수열;

import java.io.*;

public class Main_Memoization {

    private static int[] fibonacci;

    public int solution(int n) {

        if (fibonacci[n] > 0){
            return fibonacci[n];
        }

        if (n == 1 || n == 2){
            return fibonacci[n] = 1;
        } else {
            return fibonacci[n] = solution(n - 2) + solution(n - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        Main_Memoization T = new Main_Memoization();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        fibonacci = new int[n + 1];

        T.solution(n);
        for (int i = 1; i <= n; i++){
            bw.write(String.valueOf(fibonacci[i]) + " ");
        }

        bw.flush();
        bw.close();
    }
}
