package coding.section05.E02_괄호문자제거;

import java.util.Scanner;
import java.util.Stack;

public class Main_A1 {

    public String solution(String str) {

        StringBuffer answer = new StringBuffer();
        Stack<Character> notBracketsAlphabets = new Stack<>();

        for (char x : str.toCharArray()){
            if (x == ')'){
                while (notBracketsAlphabets.pop() != '(');
            } else { // '(' || 알파벳
                notBracketsAlphabets.push(x);
            }
        }

        for (int i = 0; i < notBracketsAlphabets.size(); i++){
            answer.append(notBracketsAlphabets.get(i));
        }

        return answer.toString();

    }

    public static void main(String[] args) {

        Main_A1 T = new Main_A1();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(T.solution(str));
    }
}
