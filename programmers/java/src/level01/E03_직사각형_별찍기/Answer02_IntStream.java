package level01.E03_직사각형_별찍기;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Answer02_IntStream {

    public void solution(int a, int b) {

        StringBuilder sb = new StringBuilder();
        IntStream.range(0, a).forEach(s -> sb.append("*"));
        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
    }

    public static void main(String[] args) {

        Answer02_IntStream T = new Answer02_IntStream();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        T.solution(a, b);
    }

}
