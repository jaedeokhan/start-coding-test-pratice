package level01.E12_제일_작은_수_제거하기;

import java.util.ArrayList;
import java.util.Arrays;

public class Answer01_Stream_mapToInt {

    public int[] solution(int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();
        int[] zeroAnswer = {-1};
        int smallest = Integer.MAX_VALUE;
        int minIndex = 0;

        if (arr.length == 1){
            return zeroAnswer;
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < smallest){
                smallest = arr[i];
                minIndex = i;
            }
        }

        arr[minIndex] = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] != 0){
                answer.add(arr[i]);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {

        Answer01_Stream_mapToInt T = new Answer01_Stream_mapToInt();
        int[][] arr = {{4,3,2,1}, {10}};

        for (int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(T.solution(arr[i])));
        }

    }

}
