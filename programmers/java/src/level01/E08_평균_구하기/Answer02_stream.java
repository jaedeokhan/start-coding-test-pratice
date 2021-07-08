package level01.E08_평균_구하기;

import java.util.Arrays;

public class Answer02_stream {

    public double solution(int[] arr) {

        return Arrays.stream(arr).average().orElse(0);
    }

    public static void main(String[] args) {

        Answer02_stream T = new Answer02_stream();
        int[][] arr = {{1,2,3,4}, {5,5}};

        for (int i = 0; i < arr.length; i++){
            System.out.println(T.solution(arr[i]));
        }

    }

}
