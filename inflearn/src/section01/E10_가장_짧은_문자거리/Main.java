package section01.E10_가장_짧은_문자거리;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public int[] solution(String word, char findChar){

        int wordLength = word.length();
        int[] answer = new int[wordLength];
        int position = 1000;

        for (int i = 0; i < wordLength; i++){
            if (word.charAt(i) == findChar){
                position = 0;
                answer[i] = position;
            } else {
                position++;
                answer[i] = position;
            }
        }

        position = 1000;
        for (int i = wordLength-1; i >= 0; i--){
            if (word.charAt(i) == findChar){
                position = 0;
            } else {
                position++;
                int min = Math.min(answer[i], position);
                answer[i] = min;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String word = st.nextToken();
        char findChar = st.nextToken().charAt(0);

        for (int answer : T.solution(word, findChar)){
            bw.write(String.valueOf(answer) + " ");
        }

        bw.flush();
        bw.close();
    }
}
