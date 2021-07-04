package coding.section04.E03_매출액의_종류;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main_A1 {

    // 투 포인트 + 슬라이딩 윈도우 + 해쉬

    public ArrayList<Integer> solution(int n, int k, int[] arrayN) {

        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> kind = new HashMap<>();

        for (int i = 0; i < k - 1; i++){
            kind.put(arrayN[i], kind.getOrDefault(arrayN[i], 0)+1);
        }

        int lt = 0;
        for (int rt = k - 1; rt < n; rt++){
            kind.put(arrayN[rt], kind.getOrDefault(arrayN[rt], 0)+1);
            answer.add(kind.size());

            kind.put(arrayN[lt], kind.get(arrayN[lt])-1);
            if (kind.get(arrayN[lt]) == 0) kind.remove(arrayN[lt]);
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_A1 T = new Main_A1();
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
