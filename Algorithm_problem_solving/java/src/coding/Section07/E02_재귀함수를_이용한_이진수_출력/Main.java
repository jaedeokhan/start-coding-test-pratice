package coding.Section07.E02_재귀함수를_이용한_이진수_출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public void recursive(int n) {

        if (n == 0) return;

        // n을 나눌 수 있을 때
        recursive(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        T.recursive(n);

    }
}
