package coding.section05.E06_공주_구하기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_A {

    public int solution(int n, int k) {

        int answer = 0;
        Queue<Integer> answerQueue = new LinkedList<>();
        for (int i = 1; i <= n; i++){
            answerQueue.offer(i); // 1 ~ n이하 queue에 넣기
        }

        while (!answerQueue.isEmpty()){ // 비어있지 않을때 까지
            for (int i = 1; i < k; i++) answerQueue.offer(answerQueue.poll());
            answerQueue.poll();
            
            if (answerQueue.size() == 1) answer = answerQueue.poll(); // 하나일 때 poll() 해준다.
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        System.out.println(T.solution(n, k));

//        int n = 8, k = 3;
//        System.out.println(T.solution(n, k));
    }
}
