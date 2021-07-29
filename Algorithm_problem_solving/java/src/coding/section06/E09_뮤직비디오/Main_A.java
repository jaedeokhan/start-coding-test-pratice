package coding.section06.E09_뮤직비디오;

import java.util.Arrays;
import java.util.Scanner;

public class Main_A {

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

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = scan.nextInt();
        }


        System.out.println(T.solution(n, m, array));
    }
}
