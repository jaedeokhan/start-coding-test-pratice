package section01.E04_단어_뒤집기;

import java.io.*;

public class Main {
    public String[] solution(int n, String[] words) {

        String[] answer = new String[n];

        for (int i = 0; i < n; i++){
            StringBuilder reverseString = new StringBuilder(words[i]).reverse();
            answer[i] = reverseString.toString();
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();
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
