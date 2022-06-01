package section01.E02_대소문자_변환;

import java.io.*;

public class Main2 {
    final static int ASCII_DIFF = 32;
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();

        // A(65) ~ Z(90)   : 대문자
        // a(97) ~ z(122)  : 소문자
        for (char asciiNumber : str.toCharArray()){
            // 대문자이면
            if (asciiNumber >= 65 && asciiNumber <= 90){
                // 소문자로
                answer.append((char)(asciiNumber + ASCII_DIFF));
            }

            // 소문자이면
            if (asciiNumber >= 97 && asciiNumber <= 122){
                // 대문자로
                answer.append((char)(asciiNumber - ASCII_DIFF));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) throws IOException {

        Main2 T = new Main2();
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputString = br.readLine();

        String answer = T.solution(inputString);

        bw.write(answer);
        bw.flush();
        bw.close();
    }
}
