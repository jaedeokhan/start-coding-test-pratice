package level01.E12_제일_작은_수_제거하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Answer04_ArrayList_remove {

    public int[] solution(int[] arr) {

        if (arr.length == 1) return new int[]{ -1 }; // arr의 길이가 1일때 처리

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int a : arr){
            numbers.add(a);
        }

        Integer smallest = Collections.min(numbers); // 최솟값
        numbers.remove(smallest); // numbers ArrayList에서 최솟값 삭제

        int[] answer = new int[arr.length - 1];
        for (int i = 0; i < numbers.size(); i++){
            answer[i] = numbers.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        Answer04_ArrayList_remove T = new Answer04_ArrayList_remove();
        int[][] arr = {{4,3,2,1}, {10}};

        for (int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(T.solution(arr[i])));
        }

    }

}
