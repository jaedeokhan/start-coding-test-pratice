package coding.section04.E01_학급_회장;

import java.util.HashMap;
import java.util.Scanner;

public class Main_A1_getOrDefault사용 {

    public char solution(int n, String s) {

        char answer = '\u0000';
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s.toCharArray()){
            // getOrDefault()는 첫 번째 파라미터인 key가 없으면, 두 번째 파라미터의 값을 리턴
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()){
            if (map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_A1_getOrDefault사용 T = new Main_A1_getOrDefault사용();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();

        System.out.print(T.solution(n, str));

    }
}
