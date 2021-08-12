package level02.E02_프린터;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main_04_하나의_큐로_location_가감 {

    public int solution(int[] priorities, int location){

        int answer = 0;
        Queue<Integer> priorityQueue = new LinkedList<>();

        for (int priority : priorities){
            priorityQueue.add(priority);
        }

        Arrays.sort(priorities); // 우선순위를 비교할 배열 오름차순 정렬
        int length = priorities.length - 1;

        while (!priorityQueue.isEmpty()){
            int currentPriority = priorityQueue.poll();

            // 배열을 오름차순 정렬했으므로, 가장 높은 우선순위를 비교했으면
            // 더 이상 그 수를 바라볼 필요가 없다.
            // 그 다음으로 큰 우선순위를바라볼 수 있도록 length - answer를 해준다.
            if (currentPriority == priorities[length - answer]){
                answer++;
                location--;
                if (location < 0){
                    break;
                }
            } else {
                priorityQueue.add(currentPriority);
                location--;
                if (location < 0){ // 큐의 우선순위를 한 번 전부 검증했으면
                    // 제일 뒤로 순위가 밀려서 제일 마지막 인덱스를 가리키도록 설정
                    location = priorityQueue.size() - 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){

        Main_03_클래스_활용 T = new Main_03_클래스_활용();
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
