package coding.section03.E02_공통원소_구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main_F1 {

    // A, B 두 개 집합 => 공통 원소 추출, 오름차순 출력
    // 1. 투 포인트로
    //

    public ArrayList<Integer> solution(int n, int m, int[] nArray, int[] mArray) {

        ArrayList<Integer> commonList = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        int position1 = 0, position2 = 0;

        Arrays.sort(nArray);
        Arrays.sort(mArray);

        while (position1 < n && position2 < m){
            if (nArray[position1] < mArray[position2]) {
                commonList.add(nArray[position1]);
                position1++;
            } else {
                commonList.add(mArray[position2]);
                position2++;
            }
        }

        while (position1 < n){
            commonList.add(nArray[position1++]);
        }

        while (position2 < m){
            commonList.add(mArray[position2++]);
        }

        for (int i = 0; i < commonList.size() - 1; i++){
            if (commonList.get(i) == commonList.get(i+1)){
                answer.add(commonList.get(i));
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_F1 T = new Main_F1();
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
