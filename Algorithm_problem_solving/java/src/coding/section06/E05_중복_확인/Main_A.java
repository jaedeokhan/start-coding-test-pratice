package coding.section06.E05_중복_확인;

import java.util.Arrays;
import java.util.Scanner;

public class Main_A {

    // n log n 방법

    public String solution(int n, int[] array) {

        String answer = "U";
        Arrays.sort(array); // 오름차순 정렬

        for (int i = 0; i < n - 1; i++){
            if (array[i] == array[i + 1]){
                return "D";
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = scan.nextInt();
        System.out.println(T.solution(n, array));

//        int n = 8;
//        int[] array = {20, 25, 52, 30, 39, 33, 43, 33};
//        System.out.println(T.solution(n, array));

    }
}
