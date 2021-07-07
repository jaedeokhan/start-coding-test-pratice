package level01.E01_음양_더하기;

import org.junit.Assert;
import org.junit.Test;

public class Answer02_삼항_연산자_사용 {

    public int solution(int[] absolutes, boolean[] signs) {

        int answer = 0;

        for (int i = 0; i < absolutes.length; i++){
            answer += absolutes[i] * (signs[i] ? 1 : -1);
        }

        return answer;
    }

    @Test
    public static void main(String[] args) {

        Answer02_삼항_연산자_사용 T = new Answer02_삼항_연산자_사용();
        int[][] absolutes = {
            {4, 7, 12}, {1, 2, 3}
        };
        boolean[][] signs = {
                {true, false, true}, {false, false, true}
        };
        int[] answer = {9, 0};

        for (int i = 0; i < absolutes.length; i++){
            Assert.assertEquals(answer[i], T.solution(absolutes[i], signs[i])); // true
        }

    }

}
