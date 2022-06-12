package section01.E06_중복문자제거;

import java.io.*;

public class Main {

    public String solution(String word){

        StringBuilder notOverLapWord = new StringBuilder();

        for (int i = 0; i < word.length(); i++){
            String currentChar= String.valueOf(word.charAt(i));

            if (notOverLapWord.indexOf(currentChar) == -1){
                notOverLapWord.append(currentChar);
            }
        }

        return notOverLapWord.toString();
    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        bw.write(T.solution(word));

        bw.flush();
        bw.close();
    }
}
