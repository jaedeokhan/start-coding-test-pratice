package coding.Section07.E01_재귀함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    // 자기가 자기 자신을 호출하는 함수

    public void recursive(int n) {

        if (n == 0) return;

        recursive(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        T.recursive(n);
    }
}
