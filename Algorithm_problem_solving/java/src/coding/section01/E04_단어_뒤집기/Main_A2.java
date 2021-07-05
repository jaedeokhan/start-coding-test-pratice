package coding.section01.E04_단어_뒤집기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_A2 {
    // string을 toCharArray()로 변경시킨 후 뒤집기
    public ArrayList<String> solution(int n, String[] stringArray) {

        ArrayList<String> answer = new ArrayList<String>();

        for (String string : stringArray){
            int length = string.length();
            char[] charArray = string.toCharArray();
            int lt = 0, rt = 0;
            for (int i = 0; i < length / 2; i++){
                charArray[i] = string.charAt(length-1-i);
                charArray[length-1-i] = string.charAt(i);
            }
            System.out.println(String.valueOf(charArray));
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_A2 T = new Main_A2();
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
