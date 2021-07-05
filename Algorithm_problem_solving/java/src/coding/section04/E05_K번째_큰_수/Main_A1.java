package coding.section04.E05_K번째_큰_수;

import java.util.*;

public class Main_A1 {

    public int solution(int n, int k, int[] nArray) {

        int answer = -1;
        TreeSet<Integer> sumSetList = new TreeSet<>(Collections.reverseOrder()); // 생성자에서 내림차순 생성

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                for (int l = j + 1; l < n; l++){
                    sumSetList.add(nArray[i] + nArray[j] + nArray[l]);
                }
            }
        }

        int count = 0;
        for (int x :  sumSetList){
            count++;
            if (count == k) return x;
        }

        // k가 존재하지 않으면 -1을 반환
        return answer;
    }

    public static void main(String[] args) {

        Main_A1 T = new Main_A1();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] nArray = new int[n];
        for (int i = 0; i < n; i++){
            nArray[i] = scan.nextInt();
        }

        System.out.println(T.solution(n, k, nArray));

    }
}
