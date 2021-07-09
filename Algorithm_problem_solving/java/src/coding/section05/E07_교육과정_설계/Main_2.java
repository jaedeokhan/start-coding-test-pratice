package coding.section05.E07_교육과정_설계;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2 {

    // 수업 설계가 잘 된 것이면 "YES" 잘못된 것이면 "NO"
    // 필수과목을 반드시 이수해야한다. => 그 순서도 정해져 있다.
    // 필수과목 CBA ==> C -> B -> A의 순서를 지켜야 한다.


    public String solution(String necessaryClass, String pickClass) {

        Queue<Character> necessaryQueue = new LinkedList<>();
        Queue<Character> targetQueue = new LinkedList<>();

        for (int i = 0; i < necessaryClass.length(); i++){
            necessaryQueue.offer(necessaryClass.charAt(i));
        }


        for (int i = 0; i < necessaryClass.length(); i++){
            for (int j = 0; j < pickClass.length(); j++){
                if (necessaryClass.charAt(i) == pickClass.charAt(j)){
                    targetQueue.offer(necessaryClass.charAt(i));
                    break;
                }
            }
        }

        return (necessaryQueue.equals(targetQueue)) ? "YES" : "NO";
    }

    public static void main(String[] args) {

        Main_2 T = new Main_2();
        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        String k = scan.next();
        System.out.println(T.solution(n, k));

//        String currentClass = "CBA";
//        String pickClass = "CBDAGE";
//
//        System.out.println(T.solution(currentClass, pickClass));
    }
}
