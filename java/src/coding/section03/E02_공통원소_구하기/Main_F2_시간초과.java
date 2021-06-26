package coding.section03.E02_공통원소_구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main_F2_시간초과 {

    // A, B 두 개 집합 => 공통 원소 추출, 오름차순 출력
    // 시간초과

    public ArrayList<Integer> solution(int n, int m, int[] nArray, int[] mArray) {

        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(nArray);
        Arrays.sort(mArray);

        for (int i = 0; i < n; i++){
            int position2 = 0;

            while (position2 < m) {
                if (nArray[i] == mArray[position2]){
                    answer.add(nArray[i]);
                    break;
                } else position2++;

            }
        }

        Collections.sort(answer);

        return answer;
    }

    public static void main(String[] args) {

        Main_F2_시간초과 T = new Main_F2_시간초과();
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        int[] nArray = new int[n];
        for (int i = 0; i < n; i++){
            nArray[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        int[] mArray = new int[m];
        for (int i = 0; i < m; i++){
            mArray[i] = scan.nextInt();
        }
        for (int x : T.solution(n, m, nArray, mArray)){
            System.out.print(x + " ");
        }

    }
}
