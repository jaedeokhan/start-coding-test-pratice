package level01.E31_나누어_떨어지는_숫자_배열;

import java.util.ArrayList;
import java.util.Arrays;

public class Answer01_stream_mapToInt {

    // arr의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하기
    // 주의 : divisor로 나누어 떨어지는 element가 하나도 없다면 -1을 담아 반환하기

    public int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> answer = new ArrayList<>();
        int divisorCount = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] % divisor == 0){
                divisorCount++;
                answer.add(arr[i]);
            }
        }

        if (divisorCount == 0) return new int[] {-1};

        return answer.stream().mapToInt(x -> x).sorted().toArray();
    }

    public static void main(String[] args) {

        Answer01_stream_mapToInt T = new Answer01_stream_mapToInt();
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
