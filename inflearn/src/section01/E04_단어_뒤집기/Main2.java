package section01.E04_단어_뒤집기;

import java.io.*;

public class Main2 {
    public String[] solution(int n, String[] words) {

        String[] answer = new String[n];

        for (int i = 0; i < n; i++){
            StringBuilder reverseWord = new StringBuilder();
            int wordLength = words[i].length();
            for (int j = 0; j < wordLength; j++){
                reverseWord.append(words[i].charAt(wordLength - j - 1));
            }
            answer[i] = reverseWord.toString();
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        Main2 T = new Main2();
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];

        for (int i = 0; i < n; i++){
            words[i] = br.readLine();
        }

        String[] answer = T.solution(n, words);

        for (String a : answer){
            bw.write(a);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
