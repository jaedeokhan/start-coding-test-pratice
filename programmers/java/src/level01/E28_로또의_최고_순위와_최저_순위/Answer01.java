package level01.E28_로또의_최고_순위와_최저_순위;

import java.util.Arrays;
import java.util.HashMap;

public class Answer01 {

    // 당첨 가능한 최고 순위와 최저 순위를 구해서 answer 배열에 담아서 return하는 함수
    // 최저 순위 => lottos 배열에 winNums 당첨 번호가 있는지 확인 후 min++하고, 해당 winNums를 0으로 변경
    // 최고 순위 => lottos 배열에
    // 최저 순위를 구하기 위해서
    //    - lottos를 순회하면서

    public int[] solution(int[] lottos, int[] winNums) {

        int[] answer = new int[2]; // 최고, 최저
        int min = 0, zeroCount = 0;
        HashMap<Integer, Integer> grade = new HashMap<>(){{
           put(6, 1);
           put(5, 2);
           put(4, 3);
           put(3, 4);
           put(2, 5);
           put(1, 6);
           put(0, 6);
        }};


        for (int i = 0; i < lottos.length; i++){
            for (int j = 0; j < winNums.length; j++){
                if (lottos[i] == 0){
                    zeroCount++;
                    break;
                }

                if (lottos[i] == winNums[j]){
                    min++;
                    break;
                }
            }
        }

        answer[0] = grade.get(min + zeroCount);
        answer[1] = grade.get(min);

        return answer;
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        int[][] lottos = { {44, 1, 0, 0, 31, 25}, {0, 0, 0, 0, 0, 0}, {45, 4, 35, 20, 3, 9}};
        int[][] winNums = { {31, 10, 45, 1, 6, 19}, {38, 19, 20, 40, 15, 25}, {20, 9, 3, 45, 4, 35}};

        for (int i = 0; i < lottos.length; i++){
            System.out.println(Arrays.toString(T.solution(lottos[i], winNums[i])));
        }
    }

}
