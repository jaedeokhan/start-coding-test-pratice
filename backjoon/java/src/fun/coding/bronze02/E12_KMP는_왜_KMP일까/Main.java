package fun.coding.bronze02.E12_KMP는_왜_KMP일까;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // bronze02 2902번 - KMP는 왜 KMP일까?[https://www.acmicpc.net/problem/2902]
    // 문제
    //  - Knuth-Morris-Pratt => KMP로 변경
    // 입력
    //  - 입력은 한 줄, 최대 100글자의 영어 앒파벳 대문자, 소문자, 그리고 하이픈(-)만 이루어짐
    //  - 첫 번째 글자는 항상 대문자, 하이픈 뒤에는 반드시 대문자, 그 이외에 모든 문자는 소문자
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] names = br.readLine().split("-");
        StringBuilder answer = new StringBuilder();

        for (String name : names){
            answer.append(name.charAt(0));
        }

        System.out.println(answer.toString());
    }
}
