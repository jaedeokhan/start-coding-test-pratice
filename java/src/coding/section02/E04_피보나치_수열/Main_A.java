package coding.section02.E04_피보나치_수열;

import java.util.Scanner;

public class Main_A {

    // 배열을 안쓰는 방법

    public void solution(int num){

        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < num; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();

        T.solution(inputInt);
    }
}
