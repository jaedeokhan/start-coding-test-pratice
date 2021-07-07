package level01.E01_음양_더하기;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;
import java.util.Stack;

public class Answer01 {

    public int solution(int[] absolutes, boolean[] signs) {

        int answer = 0;

        for (int i = 0; i < absolutes.length; i++){
            if (signs[i] == true){
                answer += absolutes[i];
            } else {
                answer += -absolutes[i];
            }
        }

        return answer;
    }

    @Test
    public static void main(String[] args) {

        Answer01 T = new Answer01();
        int[][] absolutes = {
                {4, 7, 12}, {1, 2, 3}
        };
        boolean[][] signs = {
                {true, false, true}, {false, false, true}
        };
        int[] answer = {9, 0};

        for (int i = 0; i < absolutes.length; i++) {
            Assert.assertEquals(answer[i], T.solution(absolutes[i], signs[i])); // true
        }
    }

}
