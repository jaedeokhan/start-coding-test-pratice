package section01.E08_유효한_팰린드롬;

import java.io.*;

public class MainA {

    public String solution(String words){

        String answer = "YES";
        String lowerWord = words.toLowerCase();
        String onlyAlphaBetWord = lowerWord.replaceAll("[^a-z]", "");
        String reversedWord = new StringBuilder(onlyAlphaBetWord).reverse().toString();

        if (!onlyAlphaBetWord.equals(reversedWord)){
            answer = "NO";
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        MainA T = new MainA();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String words = br.readLine();
        bw.write(T.solution(words));

        bw.flush();
        bw.close();
    }
}
