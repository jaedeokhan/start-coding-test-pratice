package fun.coding.sliver04.E02_제로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_2_stack {
    // sliver04 10773번 - 제로
    // 문제 - 재민이는 장부를 관리하는데 ,재현이가 도와주는데 실수해서 돈을 잘못 부르기 일쑤이다.
    // 재현이는 잘못된 수를 부를 때 마다 0을 외쳐서 가장 최근에 재민이가 쓴 수를 지우게 시킨다.
    // 재민이는 이렇게 모든 수를 받아 적은 후 그 수의 합을 알고싶어한다.
    // 입력
    //    - 첫 번째 줄에 정수 K( 1 <= k <= 100,000)
    //    - 정수 0 ~ 1,000,000 값
    // 문제접근
    //    - 스택으로 접근하고, 0이 아니면 모두 stack넣고, 0이면 stack에서 최근 값 pop()
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        Stack<Integer> values = new Stack<>();
        int answer = 0;

        for (int i = 0; i < k; i++){
            int value = Integer.parseInt(br.readLine());

            if (value == 0){
                values.pop();
                continue;
            }

            // x가 0이 아닌 경우
            values.push(value);
        }

        for (int x : values){
            answer += x;
        }

        System.out.println(answer);
    }
}
