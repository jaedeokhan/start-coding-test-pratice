package coding.section05.E01_올바른_괄호;

import java.util.Scanner;
import java.util.Stack;

public class Main_A1 {

    public String solution(String str) {

        String answer = "YES";
        Stack<Character> brackets = new Stack<>();

        for (char x : str.toCharArray()){
            if (x == '('){ // 여는 괄호이면
                brackets.push(x);
            } else { // 닫는 괄호이면
                if (brackets.isEmpty()) return "NO";
                else { // 여는 괄호가 존재하면
                    brackets.pop();
                }
            }
        }

        // brackets Stack이 비어있지 않으면, '(' 여는 괄호가 더 많으면!
        if (!brackets.isEmpty()) return "NO";

        return answer;

    }

    public static void main(String[] args) {

        Main_A1 T = new Main_A1();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(T.solution(str));

    }
}
