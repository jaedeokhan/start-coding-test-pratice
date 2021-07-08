package coding.section05.E05_쇠막대기;

import java.util.Scanner;
import java.util.Stack;

public class Main_A {

    public int solution(String str) {

        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            int nowValue = str.charAt(i);
            if (nowValue == '(') stack.push('(');
            else { // 닫는 괄호이면
                stack.pop();
                if (str.charAt(i-1) == '('){ // 레이저면
                    answer += stack.size();
                } else { // 막대기면
                    answer += 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        String[] str = {"()(((()())(())()))(())", "(((()(()()))(())()))(()())"};

        for (int i = 0; i < str.length; i++){
            System.out.println(T.solution(str[i]));
        }

//        String string = scan.next();
//        System.out.println(T.solution(string));

    }
}
