package section07.E01_재귀함수;

import java.io.*;

public class Main {

    public void solution(int n){

        // 입력 : n(3 <= n <= 10)
        // 출력 : 1부터 n까지 재귀함수로 출력

        // 종료조건
        if (n == 0){
            return;
        }

        solution(n - 1);
        System.out.print(n + " ");
    }


    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        T.solution(n);
    }
}
