package level01.E31_나누어_떨어지는_숫자_배열;

import java.util.Arrays;
import java.util.HashMap;

public class Answer01 {

    // arr의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하기
    // 주의 : divisor로 나누어 떨어지는 element가 하나도 없다면 -1을 담아 반환하기
    // set, 나누어 떨어지는 수를 판단할 int divisorCount
    // 1. for문을 i부터 arr.length까지 반복한다.
    // 1-1. if (arr[i] % divisor == 0)
    // 1-1-1. divisorCount++;
    // 1-2. else
    // 1-2-1. arr[i] = 0;

    public int[] solution(int[] arr, int divisor) {

        int divisorCount = 0; // 나누어 떨어지는 수를 셀 변수

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                divisorCount++;
            } else { // arr[i]가 divisor의 나머지가 0이 아니면
                arr[i] = 0;
            }
        }

        if (divisorCount == 0) return new int[]{-1}; // 나누어 떨어지는 수가 하나도 없다면 -1 처리

        Arrays.sort(arr); // 오름차순 정렬
        int[] answer = new int[divisorCount]; // 나누어 떨어지는 수만큼 answer 배열 만들기

        for (int i = 0, index = 0; i < arr.length; i++){
            if (arr[i] != 0){
                answer[index++] = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        int[][] arr = {
                {5, 9, 7, 10},
                {2, 36, 1, 3},
                {3, 2, 6}
        };
        int[] divisor = {5, 1, 10};

        for (int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(T.solution(arr[i], divisor[i])));
        }
    }

}
