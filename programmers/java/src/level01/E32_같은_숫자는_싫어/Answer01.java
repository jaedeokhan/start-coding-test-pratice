package level01.E32_같은_숫자는_싫어;

import java.util.ArrayList;
import java.util.Arrays;

public class Answer01 {

    // 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있다.
    // arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하기
    // 1,1,3,3,0,1,1
    // 1. for문을 i부터 arr.length까지 반복한다.
    // 1-1.

    public int[] solution(int[] arr) {

        int sameCount = 0;

        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] == arr[i+1]){
                arr[i] = -1;
                sameCount++;
            }
        }

        int[] answer = new int[arr.length - sameCount];
        for (int i = 0, index = 0; i < arr.length; i++){
            if (arr[i] != -1){
                answer[index++] = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        int[][] arr = {
                {1,1,3,3,0,1,1},
                {4,4,4,3,3}
        };

        for (int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(T.solution(arr[i])));
        }
    }

}
