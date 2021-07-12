package level01.E31_나누어_떨어지는_숫자_배열;

import java.util.Arrays;

public class Answer02_stream_개선 {

    // arr의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하기
    // 주의 : divisor로 나누어 떨어지는 element가 하나도 없다면 -1을 담아 반환하기

    public int[] solution(int[] arr, int divisor) {

        int[] answer = Arrays.stream(arr).filter(x -> x % divisor == 0).toArray();
        if (answer.length == 0) return new int[] {-1};
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {

        Answer02_stream_개선 T = new Answer02_stream_개선();
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
