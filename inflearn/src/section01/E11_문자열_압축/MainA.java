package section01.E11_문자열_압축;

import java.io.*;

public class MainA {

    public String solution(String word){

        StringBuilder answer = new StringBuilder();
        word = word + " "; // ABCD이면 D까지 반복하기 위해서 끝에 "" 추가...ㅋㅋㅋ 꼼수
        int equalCount = 1;
        int wordLength = word.length();

        for (int i = 0; i < wordLength - 1; i++){
            char currentChar = word.charAt(i);
            char nextChar = word.charAt(i + 1);
            if (currentChar == nextChar){
                equalCount++;
            } else {
                answer.append(currentChar);
                if (equalCount > 1){
                    answer.append(equalCount);
                }
                equalCount = 1;
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
