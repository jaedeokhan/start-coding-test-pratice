package coding.test.bronze3;

import java.util.Arrays;
import java.util.Scanner;

public class E01_최소_최대_a2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) num[i] = sc.nextInt();
        Arrays.sort(num);
        System.out.println(num[0] + " " + num[n-1]);
    }
}
