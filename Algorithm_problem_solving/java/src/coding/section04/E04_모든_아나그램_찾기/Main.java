package coding.section04.E04_모든_아나그램_찾기;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public int solution(String s, String t) {

        int answer = 0;
        int tLength = t.length();
        HashMap<Character, Integer> answerHash = new HashMap<>();
        HashMap<Character, Integer> compareHash = new HashMap<>();

        for (int i = 0; i < tLength; i++){
            answerHash.put(t.charAt(i), answerHash.getOrDefault(t.charAt(i), 0)+1);
            compareHash.put(s.charAt(i), compareHash.getOrDefault(s.charAt(i), 0)+1);
        }

        if (compareHash.equals(answerHash)) answer++;

        for (int i = 0; i < s.length() - tLength; i++){
            // 앞의 값 가감
            compareHash.put(s.charAt(i), compareHash.get(s.charAt(i))-1);
            if (compareHash.get(s.charAt(i)) == 0) compareHash.remove(s.charAt(i));

            // 뒤의 값 추가
            compareHash.put(s.charAt(i+tLength), compareHash.getOrDefault(s.charAt(i+tLength), 0)+1);
            if (compareHash.equals(answerHash)) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();

        System.out.println(T.solution(s, t));

    }
}
