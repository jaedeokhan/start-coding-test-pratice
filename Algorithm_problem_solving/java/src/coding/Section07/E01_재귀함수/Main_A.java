package coding.Section07.E01_재귀함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_A {

    // 재귀함수 : 자기가 자기 자신을 호출하는 함수
    // 재귀함수는 스택프레임을 사용한다.

    public void DFS(int n) {

        if (n == 0) return;
        else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) throws IOException {

        Main_A T = new Main_A();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        T.DFS(n);
    }
}
