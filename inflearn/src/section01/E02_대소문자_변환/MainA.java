package section01.E02_대소문자_변환;

import java.io.*;

public class MainA {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();



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
