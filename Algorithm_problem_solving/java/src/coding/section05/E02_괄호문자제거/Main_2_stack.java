package coding.section05.E02_괄호문자제거;

import java.util.Scanner;
import java.util.Stack;

public class Main_2_stack {

    // 1. for char x를 str.toCharArray()로 반복문을 돈다.
    // 1-1. if (x == '(' || Character.isAlphabetic(x))
    // 1-1-1. stack.push(x)
    // 1-2. else if (x == ')')
    // 1-2-1. while (stack.pop() != '(')

    public Stack<Character> solution(String str) {

        StringBuffer answer = new StringBuffer();
        Stack<Character> notBracketsAlphabets = new Stack<>();

        for (char x : str.toCharArray()){

            if (x == '(' || Character.isAlphabetic(x)) {
                notBracketsAlphabets.push(x);
            } else if (x == ')') {
                while (notBracketsAlphabets.pop() != '(') {}
            }
        }

        return notBracketsAlphabets;

    }

    public static void main(String[] args) {

        Main_2_stack T = new Main_2_stack();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        for (char x : T.solution(str)){
            System.out.print(x);
        }

    }
}
