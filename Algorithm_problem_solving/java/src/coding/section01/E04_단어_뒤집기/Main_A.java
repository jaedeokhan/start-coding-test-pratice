package coding.section01.E04_단어_뒤집기;

import java.util.Scanner;
import java.util.ArrayList;

public class Main_A {
    // StringBuilder의 reverse() 사용하는 방법
    public ArrayList<String> solution(int n, String[] stringArray) {

        ArrayList<String> answer = new ArrayList<String>();
        for (String string : stringArray){
            String temp = new StringBuilder(string).reverse().toString();
            answer.add(temp);
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scan.next();
        }
        for (String x :  T.solution(n, stringArray)){
            System.out.println(x);
        }
    }
}
