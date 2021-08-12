package level02.E02_프린터;

import java.util.Collections;
import java.util.PriorityQueue;

public class Main_02_우선순위_큐로_해결 {

    public int solution(int[] priorities, int location){

        int answer = 1;
        PriorityQueue priority = new PriorityQueue<>(Collections.reverseOrder());

        for (int value : priorities){
            priority.add(value);
        }

        while (!priority.isEmpty()){
            for (int i = 0; i < priorities.length; i++){
                int currentPriority = (int)priority.peek();
                if (priorities[i] == currentPriority){
                    if (i == location){
                        return answer;
                    }

                    priority.poll();
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){

        Main_02_우선순위_큐로_해결 T = new Main_02_우선순위_큐로_해결();
        int[][] priorities = {
                {2,1,3,2},
                {1,1,9,1,1,1}
        };
        int[] locations = {
                2, 0
        };

        for (int i = 0; i < priorities.length; i++){
            System.out.println(T.solution(priorities[i], locations[i]));
        }
    }
}
