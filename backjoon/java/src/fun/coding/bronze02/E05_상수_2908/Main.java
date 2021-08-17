package fun.coding.bronze02.E05_상수_2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // bronze2 2908번 - 상수
    // 문제 - 상수는 세 자리 수인 두 크기를 비교할 때 값을 거꾸로 비교한다.
    // 문제접근
    // - StringBuilder의 reverse를 사용해서 해결
    // - Math.max() 함수를 사용

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] values = br.readLine().split(" ");
        int oneValue = Integer.parseInt(new StringBuilder(values[0]).reverse().toString());
        int twoValue = Integer.parseInt(new StringBuilder(values[1]).reverse().toString());

        System.out.println(Math.max(oneValue, twoValue));
    }
}
