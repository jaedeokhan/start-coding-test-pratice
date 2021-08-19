package fun.coding.sliver04.E02_제로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_3_array {
    // sliver04 10773번 - 제로
    // 문제 - 재민이는 장부를 관리하는데 ,재현이가 도와주는데 실수해서 돈을 잘못 부르기 일쑤이다.
    // 재현이는 잘못된 수를 부를 때 마다 0을 외쳐서 가장 최근에 재민이가 쓴 수를 지우게 시킨다.
    // 재민이는 이렇게 모든 수를 받아 적은 후 그 수의 합을 알고싶어한다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int top = -1; // 마지막 원소의 위치를 가리키는 변수
        int K = Integer.parseInt(br.readLine());
        int[] array = new int[K];

        for (int i = 0; i < K; i++){
            int number = Integer.parseInt(br.readLine());

            if (number == 0){ // 0이라면 top 위치에 있는 원소를 0으로 초기화
                top--;
            } else {
                top++;
                array[top] = number;
            }
        }

        int sum = 0;
        for (int i = 0; i <= top; i++){
            sum += array[i];
        }

        System.out.println(sum);
    }
}
