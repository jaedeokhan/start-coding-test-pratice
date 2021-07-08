package level01.E12_제일_작은_수_제거하기;

import java.util.Arrays;

public class Answer02 {

    public int[] solution(int[] arr) {

        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[arr.length - 1];
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[minIndex] > arr[i]){
                minIndex = i;
            }
        }

        // 가장 작은 인덱스 뒤의 자리들을 하나씩 땡겨서 저장
        for (int i = minIndex + 1; i < arr.length; i++){
            arr[i - 1] = arr[i];
        }

        for (int i = 0; i < answer.length; i++){
            answer[i] = arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        Answer02 T = new Answer02();
        int[][] arr = {{4,3,2,1}, {10}};

        for (int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(T.solution(arr[i])));
        }

    }

}
