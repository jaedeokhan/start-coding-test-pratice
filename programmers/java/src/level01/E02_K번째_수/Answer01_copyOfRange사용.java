package level01.E02_K번째_수;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Answer01_copyOfRange사용 {

    // array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하기
    // 1. temp = array를 commands[i][0]부터 commands[i][1]까지 자르기
    // 2. temp[commands[i][2]]의 숫자를 answer[i]에 추가한다.

    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        int i = 0;
        for (int[] command : commands){
            int start = command[0]-1, end = command[1], index = command[2]-1;
            int[] temp = Arrays.copyOfRange(array, start, end);
            Arrays.sort(temp);
            answer[i++] = temp[index];
        }

        return answer;
    }

    @Test
    public static void main(String[] args) {

        Answer01_copyOfRange사용 T = new Answer01_copyOfRange사용();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = {5, 6, 3};

        int[] tAnswer = T.solution(array, commands);

        for (int i = 0; i < answer.length; i++){
            Assert.assertEquals(answer[i], tAnswer[i]); // true
        }


    }

}
