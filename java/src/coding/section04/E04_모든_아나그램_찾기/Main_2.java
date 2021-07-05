package coding.section04.E04_모든_아나그램_찾기;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {

    public int solution(String s, String t) {

        int answer = 0;
        int tLength = t.length();
        HashMap<Character, Integer> answerHash = new HashMap<>();
        HashMap<Character, Integer> compareHash = new HashMap<>();

        for (int i = 0; i < tLength; i++){
            answerHash.put(t.charAt(i), answerHash.getOrDefault(t.charAt(i), 0)+1);
        }

        for (int i = 0; i < tLength - 1; i++){
            compareHash.put(s.charAt(i), compareHash.getOrDefault(s.charAt(i), 0)+1);
        }

        int lt = 0;
        for (int rt = tLength-1; rt < s.length(); rt++){

            // 우측 값 추가
            compareHash.put(s.charAt(rt), compareHash.getOrDefault(s.charAt(rt), 0)+1);

            // answerHash와 compareHash가 동일한지 체크
            if (compareHash.equals(answerHash)) answer++;

            // 좌측 값 빼기
            compareHash.put(s.charAt(lt), compareHash.get(s.charAt(lt))-1);
            if (compareHash.get(s.charAt(lt)) == 0) compareHash.remove(s.charAt(lt));
            lt++;

        }

        return answer;
    }

    public static void main(String[] args) {

        Main2 T = new Main2();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();

        System.out.println(T.solution(s, t));

    }
}
