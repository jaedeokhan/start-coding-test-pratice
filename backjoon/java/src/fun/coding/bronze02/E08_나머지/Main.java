package fun.coding.bronze02.E08_나머지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    // bronze02 3052번 - 나머지
    // 문제
    //  - 두 자연수 A와 B가 있을 때, A % B는 나머지 연산이다.
    // 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇개 있는지 출력
    // 입력
    //  - 첫 번째줄부터 열번째 줄까지 숫자 한 줄에 10개(n <= 1000)
    // 문제 접근
    //  - int[] array를 저장할 공간 10개를 할당한다.
    //  - for i to array.length까지 돌면서 array[i] % 42의 값을 할당한다.
    //  - Set을 이용해서 나머지가 동일한 값들의 중복제거

    public int solution(int[] array){
        Set<Integer> values = new HashSet<>();

        for (int i = 0; i < array.length; i++){
            values.add(array[i] % 42);
        }

        return values.size();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main T = new Main();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(T.solution(array));

    }
}
