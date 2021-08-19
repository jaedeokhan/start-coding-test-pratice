package fun.coding.sliver04.E01_괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // sliver04 - 9012번 - 괄호[https://www.acmicpc.net/problem/9012]
    public String solution(String bracketString){

        String answer = "YES";
        int count = 0;

        for (int j = 0; j < bracketString.length(); j++){
            if (bracketString.charAt(j) == '(') count++;
            else if (bracketString.charAt(j) == ')') count--;

            if (count < 0) break;
        }

        if (count != 0) answer = "NO";

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main T = new Main();
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++){
            System.out.println(T.solution(br.readLine()));
        }

    }
}
