package level02.E02_프린터;

import java.util.Queue;
import java.util.LinkedList;

public class Main_01_두_개의_큐로_해결 {

    public int solution(int[] priorities, int location){

        int answer = 0;
        Queue<Integer> documentQueue = new LinkedList<>(); // n 개의 문서 queue
        Queue<Integer> prioritiesQueue = new LinkedList<>(); // 중요도 queue

        // n개의 문서, n개의 중요도 queue에 set
        for (int i = 0; i < priorities.length; i++){
            documentQueue.offer(i);
            prioritiesQueue.offer(priorities[i]);
        }

        // 중요도 큐가 비어있지 않을때 까지 반복
        while (!prioritiesQueue.isEmpty()){

            boolean isLargestPritority = true;
            int currentPrioritie = prioritiesQueue.poll();
            int currentDocument = documentQueue.poll();

            for (int x : prioritiesQueue){
                if (x > currentPrioritie){ // 큐에 더 큰 중요도가 있을 경우
                    isLargestPritority = false;
                    break;
                }
            }

            if (isLargestPritority){ // 현재 중요도가 가장 큰 경우
                answer++;
                if (currentDocument == location) return answer;
            } else { // 현재 중요도가 다른 중요도보다 크지 않으면 큐 뒤로 추가
                prioritiesQueue.offer(currentPrioritie);
                documentQueue.offer(currentDocument);
            }
        }

        return answer;
    }

    public static void main(String[] args){

        Main_01_두_개의_큐로_해결 T = new Main_01_두_개의_큐로_해결();
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
