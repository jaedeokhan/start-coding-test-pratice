package coding.section03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main_A_Two_pointers {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {

        ArrayList<Integer> answer = new ArrayList<>();
        int pointer1 = 0, pointer2 = 0;

        while (pointer1 < n && pointer2 < m){
            if (a[pointer1] < b[pointer2]) answer.add(a[pointer1++]);
            else answer.add(b[pointer2++]);
        }

        while (pointer1 < n) answer.add(a[pointer1++]);
        while (pointer2 < m) answer.add(b[pointer2++]);

        return answer;
    }

    public static void main(String[] args) {

        Main_A_Two_pointers T = new Main_A_Two_pointers();
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
