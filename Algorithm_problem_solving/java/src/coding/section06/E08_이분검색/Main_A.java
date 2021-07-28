package coding.section06.E08_이분검색;

import java.util.Arrays;
import java.util.Scanner;

public class Main_A {

    // 순차 검색의 시간 복잡도는 당연히 O(n)
    // 이분 검색의 시간 복잡도는 당연히 O(n log n)
    //    - 이분 검색은 정렬이 되어야 가능하다.

    public int solution(int n, int m, int[] array) {

        int answer = 0; // 현재는 m이 존재하지 않는 경우는 없기에 그냥 0으로 둔다
        int left = 0, right = n - 1;

        Arrays.sort(array);

        while (left <= right){
            int middle = (left + right) / 2;

            if (array[middle] == m){
                answer = middle + 1;
                break;
            }

            if (array[middle] > m)  right = middle - 1;
            else left = middle + 1;
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
