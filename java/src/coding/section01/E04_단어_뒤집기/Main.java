package coding.section01.E04_단어_뒤집기;

import java.util.Scanner;

public class Main {
    // 1. n번 만큼 for문을 돌린다.
    // 2. 문자열을 뒤집어서 StrinbBuffer에 저장 후 출력
    
    public void solution(int n, String[] stringArray) {

        for (String string : stringArray) {
            StringBuffer temp = new StringBuffer();
            for (int i = string.length()-1; i >= 0; i--) {
                temp.append(string.charAt(i));
            }
            System.out.println(temp);
        }
        
        
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scan.next();
        }
        T.solution(n, stringArray);
    }
}
