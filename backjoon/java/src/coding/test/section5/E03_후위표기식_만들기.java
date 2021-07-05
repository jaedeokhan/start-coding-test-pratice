package coding.test.section5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class E03_후위표기식_만들기 {

    static String input = "";

    public static void main(String[] args) {

        String path = E03_후위표기식_만들기.class.getResource("").getPath();
        File file = new File(path + "\\input", "03_input.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            input = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        StringBuffer sb = new StringBuffer();
        Stack<Character> oper = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char value = input.charAt(i);
            if (Character.isDigit(value)) {
                sb.append(input.charAt(i));
            } else if (value == '(') {

            } else if (value == '+' || value == '-') {
                while (!oper.isEmpty()) {

                }
            } else if (value == '*' || value == '/') {

            } else if (value == ')'){

            }
        }

        System.out.println("sb = " + sb);
        
    }
}
