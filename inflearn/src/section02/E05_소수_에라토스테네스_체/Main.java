package section02.E05_소수_에라토스테네스_체;

import java.io.*;
import java.util.ArrayList;

public class Main {

    private static boolean[] PRIME_CHECK_ARRAY = new boolean[200001];

    public int solution(int n){

        // 입력 : 첫 줄 자연수의 개수 2 <= N <= 200,000
        // 출력 : 첫 줄에 소수의 개수(primeCount)

        // - 조건1
        //   1부터 N까지의 소수의 개수 출력

        // 1. for i를 2부터 n까지
        // 1.1. if PRIME_ARRYA[i] == 0
        // 1.1.  for j를 2부터 j의 배수만큼 n이하 반복
        int primeCount = 0;

        for (int i = 2; i < n; i++){
            if (PRIME_CHECK_ARRAY[i] == false){
                primeCount++;
                for (int j = i; j <= n; j += i){
                    PRIME_CHECK_ARRAY[j] = true;
                }
            }
        }

        return primeCount;
    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(T.solution(n)));

        bw.flush();
        bw.close();
    }
}
