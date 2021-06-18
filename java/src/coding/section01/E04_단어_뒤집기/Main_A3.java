package coding.section01.E04_단어_뒤집기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_A3 {
    // lt, rt를 이용하는 방식
    public ArrayList<String> solution(int n, String[] stringArray) {

        ArrayList<String> answer = new ArrayList<String>();

        for (String string : stringArray){
            char[] charArray = string.toCharArray();
            int lt = 0, rt = string.length() - 1;
            while (lt < rt){
                char temp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = temp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(charArray));
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_A3 T = new Main_A3();
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
