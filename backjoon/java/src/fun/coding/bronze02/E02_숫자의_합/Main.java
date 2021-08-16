package fun.coding.bronze02.E02_숫자의_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // bronze2 - 숫자의 합[https://www.acmicpc.net/problem/11720]
    // N개의 숫자를 입력받아서 모두 합해서 처리
    // 합계 값이 int형보다 클 수 있으니 long으로 해결
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String defaultSplitValue = br.readLine();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += (defaultSplitValue.charAt(i) - 48);
        }

        System.out.println(sum);
    }
}
