package coding.Section07.E04_피보나치_수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_Recursive_성능개선 {

    static int[] fibo;

    public int fibonacci(int n) {

        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = fibonacci(n - 1);
        else return fibo[n] = fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static void main(String[] args) throws IOException {

        Main_Recursive_성능개선 T = new Main_Recursive_성능개선();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fibo = new int[n + 1];

        T.fibonacci(n);
        for (int i = 1; i <= n; i++){
            System.out.print(fibo[i] + " ");
        }
    }
}
