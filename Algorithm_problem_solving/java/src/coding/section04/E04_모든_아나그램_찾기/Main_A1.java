package coding.section04.E04_모든_아나그램_찾기;

import java.util.HashMap;
import java.util.Scanner;

public class Main_A1 {

    public int solution(String s, String t) {

        int answer = 0;
        int tLength = t.length() - 1;
        HashMap<Character, Integer> answerHash = new HashMap<>();
        HashMap<Character, Integer> targetHash = new HashMap<>();

        for (char x : t.toCharArray()) answerHash.put(x, answerHash.getOrDefault(x, 0)+1);
        for (int i = 0; i < tLength; i++) {
            targetHash.put(s.charAt(i), targetHash.getOrDefault(s.charAt(i), 0)+1);
        }

        int lt = 0;
        for (int rt = tLength; rt < s.length(); rt++){
            // 우측에 값 추가
            targetHash.put(s.charAt(rt), targetHash.getOrDefault(s.charAt(rt), 0)+1);

            // targetHash와 answerHash가 동일하면 answer++
            if (targetHash.equals(answerHash)) answer++;

            // 좌측에 값 제거
            targetHash.put(s.charAt(lt), targetHash.get(s.charAt(lt))-1);
            if (targetHash.get(s.charAt(lt)) == 0) targetHash.remove(s.charAt(lt));
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_A1 T = new Main_A1();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();

        System.out.println(T.solution(s, t));

    }
}
