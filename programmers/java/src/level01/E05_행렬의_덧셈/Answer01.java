package level01.E05_행렬의_덧셈;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

public class Answer01 {

    public int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        Scanner scan = new Scanner(System.in);
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};

        for (int[] ans : T.solution(arr1, arr2)){
            System.out.println(Arrays.toString(ans));
        }
    }

}
