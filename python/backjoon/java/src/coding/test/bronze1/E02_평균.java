package coding.test.bronze1;

import java.util.Arrays;
import java.util.Scanner;

public class E02_평균 {
    public static void main(String[] args) {

        // 첫 번째 방법
/*        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        double[] result_score = new double[n];
        int max = -2148000;
        double sum = 0;

        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            if (score[i] > max) {
                max = score[i];
            }
        }

        for (int i = 0; i < score.length; i++) {
            result_score[i] = (double)score[i] / max * 100;
            sum += result_score[i];
        }

        System.out.println(sum / result_score.length);*/

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double sum = 0;
        int max = -2148000;
        for (int i = 0; i < num; i++) {
            int a = sc.nextInt();
            sum += a;
            if (a > max) {
                max = a;
            }
        }

        System.out.println(sum / max / num * 100);

    }

}
