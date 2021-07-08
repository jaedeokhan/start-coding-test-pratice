package level01.E08_평균_구하기;

import java.util.stream.IntStream;

public class Answer03_IntStream {

    public double solution(int[] arr) {

        return IntStream.of(arr).sum() / arr.length;
    }

    public static void main(String[] args) {

        Answer03_IntStream T = new Answer03_IntStream();
        int[][] arr = {{1,2,3,4}, {5,5}};

        for (int i = 0; i < arr.length; i++){
            System.out.println(T.solution(arr[i]));
        }

    }

}
