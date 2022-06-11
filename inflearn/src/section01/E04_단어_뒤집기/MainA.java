package section01.E04_단어_뒤집기;

import java.io.*;

public class MainA {
    public String[] solution(int n, String[] words) {

        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String word = words[i];
            char[] splitWord = word.toCharArray();
            int leftIndex = 0, rightIndex = word.length() - 1;

            while (leftIndex < rightIndex){
                char swapValue = splitWord[leftIndex];
                splitWord[leftIndex] = splitWord[rightIndex];
                splitWord[rightIndex] = swapValue;
                leftIndex++;
                rightIndex--;
            }

            answer[i] = String.valueOf(splitWord);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        MainA T = new MainA();
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
