package coding.section04.E02_아나그램;

import java.util.HashMap;
import java.util.Scanner;

public class Main_A1 {

    public String solution(String s1, String s2) {

        String answer = "YES";
        HashMap<Character, Integer> checked = new HashMap<>();

        for (char x : s1.toCharArray()){
            checked.put(x, checked.getOrDefault(x, 0)+1);
        }

        for (char y : s2.toCharArray()){
            if (!checked.containsKey(y) || checked.get(y) == 0) return "NO";
            checked.put(y, checked.get(y)-1);
        }

        return answer;

    }

    public static void main(String[] args) {

        Main_A1 T = new Main_A1();
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();

        System.out.print(T.solution(a, b));

    }
}
