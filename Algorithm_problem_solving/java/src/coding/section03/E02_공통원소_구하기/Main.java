package coding.section03.E02_공통원소_구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public ArrayList<Integer> solution(int n, int m, int[] nArray, int[] mArray) {

        ArrayList<Integer> answer = new ArrayList<>();
        int pointer1 = 0, pointer2 = 0;

        // 오름차순 정렬 후 진행해야한다!
        Arrays.sort(nArray);
        Arrays.sort(mArray);

        while (pointer1 < n && pointer2 < m){
            if (nArray[pointer1] == mArray[pointer2]){
                answer.add(nArray[pointer1]);
                pointer1++;
                pointer2++;
            } else if (nArray[pointer1] < mArray[pointer2]) pointer1++;
              else pointer2++;
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
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
