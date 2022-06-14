package section01.E09_숫자만_추출;

import java.io.*;

public class Main {

    public int solution(String word){

        String numberWord = word.replaceAll("[^0-9]", "");

        return Integer.parseInt(numberWord);
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        bw.write(String.valueOf(T.solution(word)));

        bw.flush();
        bw.close();
    }
}
