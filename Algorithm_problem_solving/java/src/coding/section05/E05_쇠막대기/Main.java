package coding.section05.E05_쇠막대기;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    // 1. str을 for문으로 접근한다.

    public int solution(String str) {

        int answer = 0;
        Stack<Character> stack = new Stack<>();
        char[] brackets = str.toCharArray();

        for (int i = 0; i < brackets.length; i++){
            if (brackets[i] == '('){ // 여는괄호이면
                stack.push('(');
            } else { // brackets == ')', 닫는 괄호이면
                if (brackets[i-1] == '(') {  // char[] 앞에 값이 '(' 이면 => 레이저이면
                    stack.pop();
                    answer += stack.size();
                } else { // 레이저가 아니라 막대가 끝나는 거면
                    stack.pop();
                    answer += 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
//        String[] str = {"()(((()())(())()))(())", "(((()(()()))(())()))(()())"};
//
//        for (int i = 0; i < str.length; i++){
//            System.out.println(T.solution(str[i]));
//        }

        String string = scan.next();
        System.out.println(T.solution(string));

    }
}
