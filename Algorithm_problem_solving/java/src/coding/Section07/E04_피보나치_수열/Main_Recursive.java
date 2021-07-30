package coding.Section07.E04_피보나치_수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_Recursive {

    public int fibonacci(int n) {

        if (n == 1) return 1;
        else if (n == 2) return 1;
        else return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static void main(String[] args) throws IOException {

        Main_Recursive T = new Main_Recursive();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++){
            System.out.print(T.fibonacci(i) + " ");
        }
    }
}
