package section01.E03_문장_속_단어;

import java.io.*;

public class MainA {
    public String solution(String sentence) {

        String answer = "";
        int max = Integer.MIN_VALUE;
        String[] words = sentence.split(" ");

        for (String word : words) {
            int wordLength = word.length();

            if (wordLength > max) {
                max = wordLength;
                answer= word;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        MainA  T = new MainA();
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputString = br.readLine();

        String answer = T.solution(inputString);

        bw.write(answer);
        bw.flush();
        bw.close();
    }
}
