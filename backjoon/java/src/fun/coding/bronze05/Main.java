package fun.coding.bronze05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // bronze5 - 11654번
    // 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 주어졌을 때,
    // 주어진 글자의 아스키  코드값을 출력
    // 1. bufferReader로 입력을 받아서 charAt(0)으로 0번째 인덱스를 가져와서 int로 자동 형변환
    // 2. 출력

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = br.readLine().charAt(0);

        System.out.println(answer);
    }
}
