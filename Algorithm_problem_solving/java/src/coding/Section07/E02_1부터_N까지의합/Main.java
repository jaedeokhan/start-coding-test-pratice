package coding.Section07.E02_1부터_N까지의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public int recursive(int n) {

        // 1부터 N까지의 합을 출력
        if (n == 1) return 1;

        return n + recursive(n - 1);
    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(T.recursive(n));

    }
}
