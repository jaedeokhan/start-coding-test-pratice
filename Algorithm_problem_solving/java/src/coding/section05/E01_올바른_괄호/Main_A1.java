package coding.section05.E01_올바른_괄호;

import java.util.*;

public class Main {

    public String solution(String str) {

        String answer = "YES";
        Stack<Character> brackets = new Stack<>();

        for (char x : str.toCharArray()){
            if (x == '('){
                brackets.push('(');
            } else { // ')' 이면
                try {
                    brackets.pop();
                } catch (Exception e){
                    return "NO";
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

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(T.solution(str));

    }
}
