package coding.test.bronze2;

import java.util.Scanner;

public class E01_상수 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        a = reverse(a);
        b = reverse(b);

        int largest = (a > b) ? a : b;

        System.out.println(largest);

    }

    public static int reverse(int x) {

        int result = 0;

        while (x > 0) {
            int tail = x % 10;
            result = result * 10 + tail;
            x /= 10;
        }

        return result;
    }

}
