package coding.Section07.E03_팩토리얼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public int solution(int n) {

        if (n == 1) return 1; // 종료조건
        else return n * solution(n - 1); // 정상적인 재귀
    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(T.solution(n));

    }
}
