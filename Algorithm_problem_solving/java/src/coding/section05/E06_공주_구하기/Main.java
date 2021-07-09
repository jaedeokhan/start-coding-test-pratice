package coding.section05.E06_공주_구하기;

import java.util.*;

public class Main {

    public int solution(int n, int k) {

        // insert == offer(), delete == poll(), top find == peek(), search == queue.contains(x)
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++){
            queue.offer(i);
        }

        // Wow!! - 앞에 있는 k - 1개들을 queue.poll()해서 offer()해준다....오매
        while (queue.size() > 1){
            for (int i = 0; i < k - 1; i++){
                queue.offer(queue.poll());
            }
            queue.poll();
        }

        return queue.poll();
    }

    public static void main(String[] args) {

        Main T = new Main();
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int k = scan.nextInt();
//        System.out.println(T.solution(n, k));

        int n = 8, k = 3;
        System.out.println(T.solution(n, k));
    }
}
