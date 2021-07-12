package level01.E32_같은_숫자는_싫어;

import java.util.ArrayList;
import java.util.Arrays;

public class Answer02_ArrayList_preNum {

    // 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있다.
    // arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하기

    public int[] solution(int[] arr) {

        ArrayList<Integer> numbers = new ArrayList<>();
        int preNumber = -1;

        for (int i = 0; i < arr.length; i++){
            if (preNumber != arr[i]){
                numbers.add(arr[i]);
            }
            preNumber = arr[i];
        }

        int[] answer = new int[numbers.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = numbers.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        Answer02_ArrayList_preNum T = new Answer02_ArrayList_preNum();
        int[][] arr = {
                {1,1,3,3,0,1,1},
                {4,4,4,3,3}
        };

        for (int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(T.solution(arr[i])));
        }
    }

}
