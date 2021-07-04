package coding.test.section5;

import java.io.*;
import java.util.Stack;

public class E04_후위식_연산 {

    static String line = "";

    public static int calculate(int x, int y, char oper) {

        if (oper == '+') {
            return y + x;
        } else if (oper == '-') {
            return y - x;
        } else if (oper == '*') {
            return y * x;
        } else {
            return y / x;
        }
    }

    public static void main(String[] args) {

        String path = E04_후위식_연산.class.getResource("").getPath();
        File file = new File(path + "\\input", "04_input.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stack<Integer> number = new Stack<>();

        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                number.push(Character.getNumericValue(line.charAt(i)));
            } else {
                number.push(calculate(number.pop(), number.pop(), line.charAt(i)));
            }
        }

        System.out.println(number.get(0));
    }

}
