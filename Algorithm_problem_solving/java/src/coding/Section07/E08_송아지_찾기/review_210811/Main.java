package coding.Section07.E08_송아지_찾기.review_210811;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public int solution(int start, int end){
        
        int[] items = {1, -1, 5};
        int[] checked = new int[10001];
        Queue<Integer> queue = new LinkedList<>();
        int answer = 0;

        checked[start] = 1;
        queue.offer(start);

        while (!queue.isEmpty()){
            int length = queue.size();

            for (int i = 0; i < length; i++){
                int currentValue = queue.poll();

                for (int j = 0; j < items.length; j++){
                    int childValue = currentValue + items[j];
                    if (childValue == end) return ++answer;
                    if (childValue >= 1 && childValue <= 10000 && checked[childValue] == 0){
                        checked[childValue] = 1;
                        queue.offer(childValue);
                    }
                }
            }
            answer++;
        }

        return answer;
    }


    public static void main(String[] args){

        Main T = new Main();
        int[] start = {5, 8};
        int[] end = {14, 3};

        for (int i = 0; i < start.length; i++){
            System.out.println(T.solution(start[i], end[i]));
        }
    }
}
