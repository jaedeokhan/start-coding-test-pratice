package coding.section06.E09_뮤직비디오;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_BufferedReader_StringTokenizer {

    public int count(int[] array, int capacity){

        int count = 1, sum = 0;

        for (int x : array){
            if ((sum + x) > capacity){
                count++;
                sum = x;
                continue;
            }
            sum += x;
        }

        return count;
    }

    public int solution(int n, int m, int[] array) {

        int answer = 0;
        int lt = Arrays.stream(array).max().getAsInt(); // 최댓값
        int rt = Arrays.stream(array).sum();            // 합

        while (lt <= rt){
            int middle = (lt + rt) / 2;

            if (count(array, middle) <= m){ // m개의 갯수로 dvd가 넣어지면
                answer = middle;
                rt = middle - 1;
            } else lt = middle + 1;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        Main_BufferedReader_StringTokenizer T = new Main_BufferedReader_StringTokenizer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] numberArray = s.split(" ");
        int n = Integer.parseInt(numberArray[0]);
        int m = Integer.parseInt(numberArray[1]);
        int[] array = new int[n];

        s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");

        for (int i = 0; i < n; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.solution(n, m, array));
    }
}
