package section01.E04_단어_뒤집기;

import java.io.*;

public class Main3 {
    public String[] solution(int n, String[] words) {

        String[] answer = new String[n];

        // good
        // doog
        // if (g != d) => 위치 변경 O => g -> d
        // if (o == o) => 위치 변경 X
        for (int i = 0; i < n; i++) {
            int wordLength = words[i].length();
            char[] word = words[i].toCharArray();

            for (int j = 0; j < wordLength / 2; j++) {
                int leftIndex = j;
                int rightIndex = wordLength - j - 1;
                if (word[leftIndex] != word[rightIndex]) {
                    char swapValue = word[leftIndex];
                    word[leftIndex] = word[rightIndex];
                    word[rightIndex] = swapValue;
                }
            }

            answer[i] = String.valueOf(word);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        Main3 T = new Main3();
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
