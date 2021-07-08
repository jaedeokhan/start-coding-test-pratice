package level01.E12_제일_작은_수_제거하기;

import java.util.Arrays;

public class Answer03_stream_filter {

    public int[] solution(int[] arr) {

        if (arr.length == 1) return new int[]{ -1 };
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }

    public static void main(String[] args) {

        Answer03_stream_filter T = new Answer03_stream_filter();
        int[][] arr = {{4,3,2,1}, {10}};

        for (int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(T.solution(arr[i])));
        }

    }

}
