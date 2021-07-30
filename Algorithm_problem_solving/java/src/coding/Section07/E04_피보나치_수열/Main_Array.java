package coding.Section07.E04_피보나치_수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_Array {

    public int[] fibonacci(int n) {

        // 배열이 재귀보다는 성능적으로 더 좋다.
        // 스택 프레임을 덜 만들기 때문!
        if (n == 1) return new int[]{1}; // 1인 경우 return
        if (n == 2) return new int[]{1, 1}; // 2인 경우 return

        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < n; i++){ // 3개인 경우부터는 앞의 두 값을 더해서 현재 인덱스에 넣어준다.
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        Main_Array T = new Main_Array();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int x : T.fibonacci(n)){
            System.out.print(x + " ");
        }

    }
}
