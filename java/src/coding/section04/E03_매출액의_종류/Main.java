package coding.section04.E03_매출액의_종류;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // 슬라이딩 윈도우 + 해쉬

    public ArrayList<Integer> solution(int n, int k, int[] arrayN) {

        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> kind = new HashMap<>();

        for (int i = 0; i < k; i++){
            kind.put(arrayN[i], kind.getOrDefault(arrayN[i], 0)+1);
        }

        answer.add(kind.size()); // 첫 번재 k까지의 매출 종류

        for (int i = k; i < n; i++){
            // 앞의 값 가감 => if 0이면 제거
            kind.put(arrayN[i - k], kind.getOrDefault(arrayN[i - k], 0)-1);
            if (kind.get(arrayN[i - k]) == 0) kind.remove(arrayN[i - k]);

            // 뒤의 값 추가
            kind.put(arrayN[i], kind.getOrDefault(arrayN[i], 0)+1);

            // 두 번째 ~ 마지막 => 매출 종류 개수 추가
            answer.add(kind.size());
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arrayN = new int[n];
        for (int i = 0; i < n; i++){
            arrayN[i] = scan.nextInt();
        }

        for (int x : T.solution(n, k , arrayN)){
            System.out.print(x + " ");
        }

    }
}
