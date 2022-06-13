package section01.E08_유효한_팰린드롬;

import java.io.*;

public class Main_StringBuilder {

    public String solution(String words){

        String answer = "YES";
        String onlyAlphaBetWord = words.replaceAll("[^a-zA-Z]", "");
        String reversedWord = new StringBuilder(onlyAlphaBetWord).reverse().toString();

        if (!onlyAlphaBetWord.equalsIgnoreCase(reversedWord)){
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        Main_StringBuilder T = new Main_StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String words = br.readLine();
        bw.write(T.solution(words));

        bw.flush();
        bw.close();
    }
}
