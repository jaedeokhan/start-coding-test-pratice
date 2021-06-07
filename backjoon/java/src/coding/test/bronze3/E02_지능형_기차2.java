package coding.test.bronze3;

import java.util.Scanner;

public class E02_지능형_기차2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0, largest = 0;

        for (int i = 0; i < 10; i++) {
            int out = sc.nextInt();
            int come = sc.nextInt();
            total += come - out;
            largest = Math.max(total, largest);
        }
        System.out.println(largest);
    }
}
