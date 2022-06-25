package section07.E02_이진수_출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public void solution(int n){

        if (n == 0){
            return;
        }

        solution(n / 2);
        System.out.print(n % 2);
    }


    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        T.solution(n);
    }
}
