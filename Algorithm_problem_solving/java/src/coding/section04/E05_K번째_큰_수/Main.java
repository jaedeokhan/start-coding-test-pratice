package coding.section04.E05_K번째_큰_수;

import java.util.*;

public class Main {

    // TreeSet
    // 중복도 제거하고, 정렬도 자동으로 된다.

    public int solution(int n, int k, int[] nArray) {

        int answer = 0;
        TreeSet<Integer> sumSetList = new TreeSet<>();

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int l = j + 1; l < n; l++) {
                    sumSetList.add(nArray[i] + nArray[j] + nArray[l]);
                }
            }
        }

        NavigableSet<Integer> descendingSet = sumSetList.descendingSet();
        Iterator<Integer> sumIterList = descendingSet.iterator();

        for (int i = 0; i < sumSetList.size(); i++){
            if (i == k-1){
                answer = sumIterList.next();
                break;
            } else {
                sumIterList.next();
            }
        }

        // k가 존재하지 않을 때
        if (answer == 0) return -1;

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
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
