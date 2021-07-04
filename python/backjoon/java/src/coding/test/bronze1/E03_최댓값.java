package coding.test.bronze1;

import java.util.Scanner;

public class E03_최댓값 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[9];
        int largest = -2148000;
        int index = 0;

        for (int i = 0; i < num.length; i++) {
            int value = sc.nextInt();
            if (value > largest) {
                largest = value;
                index = i + 1;
            }
        }

        System.out.println(largest);
        System.out.println(index);
    }
}

