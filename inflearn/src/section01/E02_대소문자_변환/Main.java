package section01.E02_대소문자_변환;

import java.io.*;

public class Main {

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();

        for (char inputChar : str.toCharArray()){
            if (Character.isUpperCase(inputChar)){
                answer.append(Character.toLowerCase(inputChar));
            } else if (Character.isLowerCase(inputChar)){
                answer.append(Character.toUpperCase(inputChar));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputString = br.readLine();

        String answer = T.solution(inputString);

        bw.write(answer);
        bw.flush();
        bw.close();
    }
}
