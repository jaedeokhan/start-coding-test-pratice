package fun.coding.bronze02.E07_열_개씩_끊어_출력하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // bronze2 11721번 - 열 개씩 끊어 출력하기[https://www.acmicpc.net/problem/11721]
    // 문제 -  알파벳 소문자와 대문자로 이루어진 길이가 N인 단어가 주어진다.
    // 한 줄에 10글자씩 끊어서 출력하는 프로그램 작성
    // 입력 - 길이는 100을 넘지않는다. 0인 단어는 주어지지 않는다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();

        for (int i = 1; i <= string.length(); i++){
            System.out.print(string.charAt(i - 1));

            if (i % 10 == 0) System.out.println();
        }
    }
}
