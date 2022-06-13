package section01.E07_회문문자열;

import java.io.*;

public class MainA {

    public String solution(String word){

        String answer = "YES";

        int wordLength = word.length();
        word = word.toUpperCase();

        for (int i = 0; i < wordLength / 2; i++){
            if (word.charAt(i) != word.charAt(wordLength - i - 1)){
                answer = "NO";
                return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        MainA T = new MainA();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        bw.write(T.solution(word));

        bw.flush();
        bw.close();
    }
}
