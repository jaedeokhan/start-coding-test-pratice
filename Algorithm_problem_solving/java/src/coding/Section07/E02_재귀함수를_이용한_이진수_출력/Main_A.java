package coding.Section07.E02_재귀함수를_이용한_이진수_출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_A {

    public void recursive(int n) {

        if (n == 0) return;
        else {
            recursive(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) throws IOException {

        Main_A T = new Main_A();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        T.recursive(n);

    }
}
