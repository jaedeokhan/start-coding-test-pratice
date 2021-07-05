package coding.section01.E11_문자열_압축;

import java.util.Scanner;

public class Main_A {

    public String solution(String s){

        StringBuilder answer = new StringBuilder();
        s = s + " ";
        int count = 0;

        for (int i = 0; i < s.length()-1; i++){
            if (s.charAt(i) == s.charAt(i + 1)){
                count++;
            } else {
                answer.append(s.charAt(i)); // (count > 1 || count == 0) 모두 처리해줘야 한다.
                if (count > 1){
                    answer.append(String.valueOf(count));
                    count++;
                }
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        System.out.println(T.solution(input));

    }
}
