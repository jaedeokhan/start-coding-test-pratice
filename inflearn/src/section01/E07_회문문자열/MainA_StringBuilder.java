package section01.E07_회문문자열;

import java.io.*;

public class MainA_StringBuilder {

    public String solution(String word){

        String answer = "YES";
        String reversedWord = new StringBuilder(word).reverse().toString();

        if (!word.equalsIgnoreCase(reversedWord)){
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        MainA_StringBuilder T = new MainA_StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        bw.write(T.solution(word));

        bw.flush();
        bw.close();
    }
}
