package coding.test.bronze3;

import java.util.Arrays;

public class E03_피보나치_수열_다이나믹 {

    static int[] f = new int[100];

    public static void main(String[] args) {
        Arrays.fill(f, 0);
        System.out.println(fibonacci(10));
    }

    public static int fibonacci(int x) {

        if (f[x] != 0) {
            return f[x];
        } else {
            if (x == 1 || x == 2) {
                f[x] = 1;
            } else {
                f[x] = fibonacci(x - 1) + fibonacci(x - 2);
            }
            return f[x];
        }
    }
}
