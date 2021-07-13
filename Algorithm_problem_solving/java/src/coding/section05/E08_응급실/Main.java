package coding.section05.E08_응급실;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    // 응급실은 환자가 도착한 순서대로 진료를 한다
    // 하지만, 위험도가 높은 환자는 빨리 응급조치를 의사가 해야한다
    // - 환자가 접수한 순서대로의 목록에서 제일 앞에 있는 환자목록을 꺼낸다.
    // - 나머지 대기 목록에서 꺼낸 환자보다 위험도가 높은 환자가 존재하면 대기목록 제일 뒤로 다시 넣는다.
    //    - 그렇지 않으면 진료를 받는다
    // 즉, 대기목록에 자기보다 위험도가 높은 환자가 없을 때 자신이 진료를 받는 구조이다
    // 출력 : 대기목록상의 M번째 환자는 몇 번째로 진료를 받는지 출력

    // 1. Queue<Integer> patients Set, for문을 i부터 n까지 반복하면서 patients에 각각의 danger값을 offer()
    // 순서를 판단할 Queue
    //
    public int solution(int n, int m, int[] danger) {

        int answer = 0, count = 0;
        Queue<Integer> patients = new LinkedList<>();
        Queue<Integer> orders = new LinkedList<>();
        for (int i = 0; i < n; i++){
            patients.offer(danger[i]);
            orders.offer(i);
        }

        while (!patients.isEmpty()){
            int preValue = patients.poll();
            if (preValue >= Collections.max(patients)){
                answer++;
                if (orders.poll() == m){
                    return answer;
                }
            } else {
                patients.offer(preValue);
                orders.offer(orders.poll());
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] danger = new int[n];
        for (int i = 0; i < n; i++){
            danger[i] = scan.nextInt();
        }
        System.out.println(T.solution(n, m, danger));

//        int[] n = {5, 6};
//        int[] m = {2, 3};
//        int[][] danger = {
//        {60,50, 70, 80, 90}, {70, 60, 90, 60, 60, 60}
//        };
//
//        for (int i = 0; i < n.length; i++){
//            System.out.println(T.solution(n[i], m[i], danger[i]));
//        }
    }
}
