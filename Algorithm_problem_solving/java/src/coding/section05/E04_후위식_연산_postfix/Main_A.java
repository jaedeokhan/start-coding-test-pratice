package coding.section05.E04_후위식_연산_postfix;

import java.util.Scanner;
import java.util.Stack;

public class Main_A {

    public int solution(String str) {

        int answer = 0;
        Stack<Integer> numbers = new Stack<>();
        for (char x : str.toCharArray()){
            if (Character.isDigit(x)) numbers.push(x - 48 );
            else {
                int rightValue = numbers.pop();
                int leftValue = numbers.pop();
                if (x == '+') numbers.push(leftValue + rightValue);
                else if (x == '-') numbers.push(leftValue - rightValue);
                else if (x == '*') numbers.push(leftValue * rightValue);
                else if (x == '/') numbers.push(leftValue / rightValue);
            }
        }

        return answer = numbers.get(0);
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(T.solution(str));
    }
}
