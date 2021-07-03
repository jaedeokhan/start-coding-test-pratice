package coding.section04.E02_아나그램;

import java.util.*;

public class Main01_배열사용 {

    // 두 문자열이 아나그램인지 판별 - 아나그램 : 알파벳의 갯수가 같은 것
    // 1. a,b 두 개의 String 변수를 입력받는다.

    // 65 ~ 90 ( A - Z )
    // 96 ~ 122( a - z )
    public String solution(String a, String b) {

        int[] aCount = new int[53];
        int[] bCount = new int[53];

        for (int i = 0; i < a.length(); i++){

            if (a.charAt(i) >= 65 && a.charAt(i) <= 90){
                aCount[a.charAt(i)-65]++;
            } else if (a.charAt(i) >= 96 && a.charAt(i) <= 122) {
                aCount[a.charAt(i)+26-96]++;
            }

            if (b.charAt(i) >= 65 && b.charAt(i) <= 90){
                bCount[b.charAt(i)-65]++;
            } else if (b.charAt(i) >= 96 && b.charAt(i) <= 122){
                bCount[b.charAt(i)+26-96]++;
            }
        }

        for (int i = 0; i < aCount.length; i++){
            if (aCount[i] != bCount[i]){
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {

        Main01_배열사용 T = new Main01_배열사용();
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();

        System.out.print(T.solution(a, b));

    }
}
