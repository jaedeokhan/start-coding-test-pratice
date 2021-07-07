package coding.section05.E04_후위식_연산_postfix;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    // Stack<Character> oper set
    // 1. 향상된 for문을 char x : str.toCharArray() 까지 돈다.
    // 1-1. if Character.isDigit(x) // 숫자이면
    // 1-1-1. oper.push(x);
    // 1-2. else // +, -, *, / 이면
    // 1-2-1. oper.push(calculate(oper.pop(), x, oper.pop());

    public int calculate(int y, char oper, int x){

        int sum = 0;

        if (oper == '+'){
            sum = x + y;
        } else if (oper == '-'){
            sum = x - y;
        } else if (oper == '*'){
            sum = x * y;
        } else if (oper == '/'){
            sum = x / y;
        }

        return sum;
    }

    public int solution(String str) {

        Stack<Integer> values = new Stack<>();

        for (char x : str.toCharArray()){
            if (Character.isDigit(x)){
                values.push(Character.getNumericValue(x));
            } else { // +, -, *, / 이면
                values.push(calculate(values.pop(), x, values.pop()));
            }
        }

        return values.pop();
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(T.solution(str));
    }
}
