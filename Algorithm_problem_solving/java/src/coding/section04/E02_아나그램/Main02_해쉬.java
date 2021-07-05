package coding.section04.E02_아나그램;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main02_해쉬 {

    // 두 문자열이 아나그램인지 판별 - 아나그램 : 알파벳의 갯수가 같은 것
    // 1. a,b 두 개의 String 변수를 입력받는다. HashMap<Character, Integer> check를 set
    // 2. for문을 0부터 a.length까지 돌린다.
    // 2-1. check.getDefaultValue()

    public String solution(String a, String b) {

        String answer = "YES";
        HashMap<Character, Integer> check = new HashMap<>();

        for (int i = 0; i < a.length(); i++){
            check.put(a.charAt(i), check.getOrDefault(a.charAt(i), 0)+1);
        }

        for (int i = 0; i < b.length(); i++){
            check.put(b.charAt(i), check.getOrDefault(b.charAt(i), 0)-1);
        }

        for (char key : check.keySet()){
            if (check.get(key) != 0){
                answer = "NO";
                break;
            }
        }

        return answer;

    }

    public static void main(String[] args) {

        Main02_해쉬 T = new Main02_해쉬();
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();

        System.out.print(T.solution(a, b));

    }
}
