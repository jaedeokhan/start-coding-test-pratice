package fun.coding.bronze02.E05_상수_2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2_뒤집는_메소드_나눠서_해결 {
    // bronze2 2908번 - 상수
    // 문제 - 상수는 세 자리 수인 두 크기를 비교할 때 값을 거꾸로 비교한다.
    // 문제접근
    // - StringBuilder의 reverse를 사용해서 해결
    // - Math.max() 함수를 사용

    public int getReverseInt(int originalValue){

        int value = 0;

        while (originalValue > 0){
            int tail = originalValue % 10;
            value = value * 10 + tail;
            originalValue /= 10;
        }

        return value;
    }

    public int solution(String[] values){

        int oneValue = getReverseInt(Integer.parseInt(values[0]));
        int twoValue = getReverseInt(Integer.parseInt(values[1]));

        return Math.max(oneValue, twoValue);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main_2_뒤집는_메소드_나눠서_해결 T = new Main_2_뒤집는_메소드_나눠서_해결();
        String[] values = br.readLine().split(" ");

        System.out.println(T.solution(values));
    }
}
