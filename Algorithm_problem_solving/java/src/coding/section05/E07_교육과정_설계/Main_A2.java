package coding.section05.E07_교육과정_설계;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_A2 {

    public String solution(String necessaryClass, String pickClass) {

        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for (char x : necessaryClass.toCharArray()) queue.offer(x);

        for (char x : pickClass.toCharArray()){
            if (queue.contains(x)){ // queue에 x가 존재하면, 필수과목이면
                if (x != queue.poll()) return "NO"; // x와 queue.poll()한게 일치하지 않다면! 순서를 제대로 지키지 않은 것
            }
        }

        if (!queue.isEmpty()) return "NO"; // 필수과목을 덜 들었을 경우
        return answer;
    }

    public static void main(String[] args) {

        Main_A2 T = new Main_A2();
//        Scanner scan = new Scanner(System.in);
//        String n = scan.next();
//        String k = scan.next();
//        System.out.println(T.solution(n, k));

        String[] currentClass = {"CBA", "CDA"};
        String[] pickClass = {"CBDAGE", "CDAA"};

        for (int i = 0; i < currentClass.length; i++){
           System.out.println(T.solution(currentClass[i], pickClass[i]));
        }
    }
}
