package coding.section06.E10_마구간_정하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public int count(int[] array, int distance){

        int count = 1;
        int endPosition = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] - endPosition >= distance){
                count++;
                endPosition = array[i];
            }
        }

        return count;
    }

    public int solution(int n, int c, int[] array) {

        int answer = 0;
        Arrays.sort(array); // 좌표를 오름차순 정렬
        int lt = 1;
        int rt = n - 1;

        while (lt <= rt){
            int middle = (lt + rt) / 2;

            if (count(array, middle) >= c){
                answer = middle;
                lt = middle + 1;
            } else rt = middle - 1;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int c = Integer.parseInt(s[1]);
        int[] xi = new int[n];

        s = br.readLine().split(" ");
        for (int i = 0; i < n; i++){
            xi[i] = Integer.parseInt(s[i]);
        }

        System.out.println(T.solution(n, c, xi));
    }
}
