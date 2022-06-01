package section01.E03_문장_속_단어;

import java.io.*;

public class Main {

    public String solution(String str) {

        String[] words = str.split(" ");
        String answer = "";
        int maxLength = words[0].length();

        for (int i = 0; i < words.length - 1; i++) {
            int nextLength = words[i + 1].length();
            if (nextLength > maxLength){
                maxLength = nextLength;
            }
        }

        for (int i = 0; i < words.length; i++) {
            if (maxLength == words[i].length()) {
                answer = words[i];
                break;
            }
        }

        return answer;
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
