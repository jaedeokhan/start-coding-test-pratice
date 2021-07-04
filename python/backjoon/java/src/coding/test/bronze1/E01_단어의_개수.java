package coding.test.bronze1;

import java.util.Scanner;

public class E01_단어의_개수 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        char answer = 0;
        String str = sc.nextLine();
        str = str.toUpperCase();

        for (char x : str.toCharArray()) {
            arr[x-65]++;
        }

        int max = -2148000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                answer = (char) (i + 65);
            } else if (arr[i] == max) {
                answer = '?';
            }
        }

        System.out.println("answer = " + answer);

    }
}

