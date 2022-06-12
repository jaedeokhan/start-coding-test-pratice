package section01.E05_특정_문자_뒤집기;

import java.io.*;

public class MainA {
    public String solution(String word) {

        char[] syllables = word.toCharArray();
        int leftIndex = 0, rightIndex = word.length() - 1;

        while (leftIndex < rightIndex){
            if (!Character.isAlphabetic(syllables[leftIndex])) {
                leftIndex++;
            } else if (!Character.isAlphabetic(syllables[rightIndex])){
                rightIndex--;
            } else {
                char rightSyllable = syllables[rightIndex];
                syllables[rightIndex] = syllables[leftIndex];
                syllables[leftIndex] = rightSyllable;

                leftIndex++;
                rightIndex--;
            }
        }

        return String.valueOf(syllables);
    }

    public static void main(String[] args) throws IOException {

        MainA T = new MainA();
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        bw.write(T.solution(word));

        bw.flush();
        bw.close();
    }
}
