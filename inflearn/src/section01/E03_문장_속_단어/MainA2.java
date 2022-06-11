package section01.E03_문장_속_단어;

import java.io.*;

public class MainA2 {
    public String solution(String sentence) {

        String answer = "";
        int max = Integer.MIN_VALUE, position;

        while ((position = sentence.indexOf(' ')) != -1) {

            String word = sentence.substring(0, position);
            int wordLength = word.length();

            if (wordLength > max){
                max = wordLength;
                answer = word;
            }

            sentence = sentence.substring(position + 1);
        }

        if (sentence.length() > max){
            answer = sentence;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        MainA2 T = new MainA2();
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputString = br.readLine();

        String answer = T.solution(inputString);

        bw.write(answer);
        bw.flush();
        bw.close();
    }
}
