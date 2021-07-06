package coding.section05.E02_괄호문자제거;

import java.util.Scanner;
import java.util.Stack;

public class Main_1_stack_stringBuffer {

    // Stack<Character> notBracketsAlphabets set
    // 1. for문을 char x를 str.toCharArray()로 전체를 돈다.
    // 1-1. if x == '(':
    // 1-1-1. notBracketsAlphabets.push('(')
    // 1-2. else if notBracketsAlphabets.isEmpty() && Character.isAlphabetic(x):
    // 1-2-1.  answer.append(x);
    // 1-3. else if x == ')':
    // 1-3-1. notBracketsAlphabets.pop();
    // 1-4. else if !notBracketsAlphabets.isEmpty() && Character.isAlphabetic(x):
    // 1-4-1. continue

    public String solution(String str) {

        StringBuffer answer = new StringBuffer();
        Stack<Character> notBracketsAlphabets = new Stack<>();

        for (char x : str.toCharArray()){

            if (x == '(') { // 여는 괄호이면
                notBracketsAlphabets.push('(');
            } else if (notBracketsAlphabets.isEmpty() && Character.isAlphabetic(x)) { // Stack이 비어있고, 알파벳이면
                // 괄호밖에 있기 때문에 문자열에 x를 추가해준다.
                answer.append(x);
            } else if (x == ')') { // Stack이 비어있지 않고, 닫는 괄호이면
                notBracketsAlphabets.pop();
            } else if (!notBracketsAlphabets.isEmpty() && Character.isAlphabetic(x)){ // Stack이 비어있지 않고, 알파벳이면
                // 여는 괄호가 끝나지 않았기에 문자열에 x를 추가하지 않고 continue 한다.
                continue;
            }
        }

        return answer.toString();

    }

    public static void main(String[] args) {

        Main_1_stack_stringBuffer T = new Main_1_stack_stringBuffer();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(T.solution(str));

    }
}
