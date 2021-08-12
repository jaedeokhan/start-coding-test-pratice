package level02.E02_프린터;

import java.util.LinkedList;
import java.util.Queue;

class LocationAndPriority {
    int location;
    int priority;

    public LocationAndPriority(int location, int priority){
        this.location = location;
        this.priority = priority;
    }
}

public class Main_03_클래스_활용 {

    public int solution(int[] priorities, int location){

        int answer = 0;
        Queue<LocationAndPriority> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++){
            queue.add(new LocationAndPriority(i, priorities[i]));
        }

        while (!queue.isEmpty()){
            LocationAndPriority current = queue.poll();
            boolean isLargestPriority = true;

            for (LocationAndPriority x : queue){
                if (x.priority > current.priority){
                    isLargestPriority = false;
                    break;
                }
            }

            if (isLargestPriority){ // 현재 우선순위가 가장 크면
                answer++;
                if (current.location == location){
                    return answer;
                }
            } else { // 현재 우선순위가 가장 크지 않으면
                queue.add(current);
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
