package coding.section05.E01_올바른_괄호;

import java.util.Scanner;
import java.util.Stack;

public class Main_2_isEmpty {

    // Stack : Last In First Out(LIFO) < = > Queue (FIFO)

    public String solution(String str) {

        String answer = "YES";
        Stack<Character> brackets = new Stack<>();

        for (char x : str.toCharArray()){
            if (x == '('){
                brackets.push('(');
            } else { // ')' 이면
                if (brackets.isEmpty()){
                    return "NO";
                } else { // 비어있지 않다면
                    brackets.pop();
                }
            }
        }

        if (!brackets.isEmpty()){
            return "NO";
        } else {
            return answer;
        }

    }

    public static void main(String[] args) {

        Main_2_isEmpty T = new Main_2_isEmpty();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(T.solution(str));

    }
}
