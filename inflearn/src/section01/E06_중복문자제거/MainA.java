package section01.E06_중복문자제거;

import java.io.*;

public class MainA {

    public String solution(String word){

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < word.length(); i++){
            if (word.indexOf(word.charAt(i)) == i){
                answer.append(word.charAt(i));
            }
        }

        return answer.toString();
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
