package level01.E03_직사각형_별찍기;

import java.util.Arrays;
import java.util.Scanner;

public class Answer01 {

    public void solution(int a, int b) {

        for (int i = 0; i < b; i++){
            for (int j = 0; j < a; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        T.solution(a, b);
    }

}
