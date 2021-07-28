package coding.section06.E08_이분검색;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // 1. Arrays.sort(array)
    // 2. 이분 검색으로 m의 인덱스 찾기

    public int solution(int n, int m, int[] array) {

        int answer = -1;
        int left = 0, right = n - 1;
        int middle = 0;

        Arrays.sort(array);

        while (right >= left){
            middle = (left + right) / 2;

            if (array[middle] == m){ // m 과 이분 검색의 중간값이 같다면
                return middle + 1;
            } else if (array[middle] > m){
                right = middle - 1;
            } else { // 값이 m보다 작을때
                left = middle + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = scan.nextInt();
        }

//        int n = 8;
//        int m = 32;
//        int[] array = {23, 87, 65, 12, 57, 32, 99, 81};

        System.out.println(T.solution(n, m, array));


    }
}
