package coding.section01.E10_가장_짧은_문자거리;

import java.util.Scanner;

public class Main_A {

    public int[] solution(String s, char c) {

        int[] answer = new int[s.length()];
        int p = 1000;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c) p = 0;
            else {
                p++;
            }
            answer[i] = p;
        }

        p = 1000;

        for (int i = s.length()-1; i >= 0; i--){
            if (s.charAt(i) == c) p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        String inputString = scan.next();
        char inputChar = scan.next().charAt(0);

        for (int x : T.solution(inputString, inputChar)){
            System.out.print(x + " ");
        }
    }
}
