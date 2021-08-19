package fun.coding.sliver05.E03_소트인사이드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    // sliver05 1427번 - 소트인사이드
    // 문제 - 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬
    // 입력 - N은 1,000,000,000보다 작거나 같은 자연수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stringValues = br.readLine().split("");
        Integer[] intValues = new Integer[stringValues.length];

        for (int i = 0; i < intValues.length; i++){
            intValues[i] = Integer.parseInt(stringValues[i]);
        }

        Arrays.sort(intValues, Collections.reverseOrder());

        for (int value : intValues){
            System.out.print(value);
        }
    }
}
