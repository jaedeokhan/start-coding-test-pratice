package fun.coding.bronze02.E08_나머지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main_array {
    public int solution(int[] array){
        int answer = 0;
        // 나머지가 나올 수 있는 수는 0 ~ 41이기에 42의 boolean 배열 생성
        boolean[] checked = new boolean[42];

        for (int i = 0; i < array.length; i++){
            checked[array[i] % 42] = true;
        }

        for (boolean check : checked){
            if (check) answer++;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main_array T = new Main_array();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(T.solution(array));
    }
}
