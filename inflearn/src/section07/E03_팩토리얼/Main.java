package section07.E03_팩토리얼;

import java.io.*;

public class Main {

    public int solution(int n) {

        // 입력 : n(1 <= n <= 100)
        // 출력 : n 팩토리얼 값
        if (n == 1){
            return 1;
        }

        return n * solution(n - 1);
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
