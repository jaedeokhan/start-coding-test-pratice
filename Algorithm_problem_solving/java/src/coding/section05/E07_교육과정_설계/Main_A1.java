package coding.section05.E07_교육과정_설계;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_A1 {

    public String solution(String necessaryClass, String pickClass) {

        Queue<Character> necessaryQueue = new LinkedList<>();
        for (int i = 0; i < necessaryClass.length(); i++){
            necessaryQueue.offer(necessaryClass.charAt(i));
        }

        for (char x : pickClass.toCharArray()){
            if (necessaryQueue.contains(x)){
                necessaryQueue.poll();
            }
        }

        return (necessaryQueue.isEmpty()) ? "YES" : "NO";
    }

    public static void main(String[] args) {

        Main_A1 T = new Main_A1();
//        Scanner scan = new Scanner(System.in);
//        String n = scan.next();
//        String k = scan.next();
//        System.out.println(T.solution(n, k));

        String currentClass = "CBA";
        String pickClass = "CBDAGE";

        System.out.println(T.solution(currentClass, pickClass));
    }
}
