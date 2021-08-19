package fun.coding.sliver04.E01_괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_2_Stack {
    // sliver04 - 9012번 - 괄호[https://www.acmicpc.net/problem/9012]
    // 문제접근
    // '('는 push()해주니 정상적인 경우라면 '('와 ')'개수는 같기에 stack.isEmpty()로 종료된다.
    //    -
    // '('는 stack에 push()
    // ')'는 stack에서 pop()
    //    - pop()하기전에 isEmpty()이면 return "NO"
    public String solution(String bracketString){

        String answer = "YES";
        Stack<Character> bracketStack = new Stack<>();

        for (int i = 0; i < bracketString.length(); i++){
            char bracket = bracketString.charAt(i);
            if (bracket == '(') bracketStack.push(bracket);
            else { // ')'인 경우
                // "))" 닫는 괄호가 더 많은 경우
                if (bracketStack.isEmpty()) return "NO";

                // stack에 여는 괄호가 존재해서 정상적으로 pop()가능한 경우우
               bracketStack.pop();
            }
        }

        // "((" 와 같이 여는 괄호만 존재하는 경우 스택에 남아있기에!
        if (!bracketStack.isEmpty()) return "NO";

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main_2_Stack T = new Main_2_Stack();
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++){
            System.out.println(T.solution(br.readLine()));
        }

    }
}
