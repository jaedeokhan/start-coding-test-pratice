package fun.coding.bronze02.E10_10953번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // bronze02 10953번 - A + B - 6[https://www.acmicpc.net/problem/10953]
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < testCase; i++){
            st = new StringTokenizer(br.readLine(), ",");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(a + b);
        }
    }
}
