package section01.E11_문자열_압축;

import java.io.*;

public class Main {

    public String solution(String word){

        // 입력 : 대문자로 이루어진 문자열 word <= 100
        // 출력 : 압축된 문자열

        StringBuilder answer = new StringBuilder();
        int wordLength = word.length();
        int equalCount = 1;

        for (int i = 0; i < wordLength - 1; i++){
            char currentChar = word.charAt(i);
            char nextChar = word.charAt(i + 1);

            if (currentChar == nextChar){
                equalCount++;
            } else {
                if (equalCount == 1){
                    answer.append(currentChar);
                } else {
                    answer.append(currentChar + "" + equalCount);
                }
                equalCount = 1;
            }
        }

        // Ex) KKHSSSSSSSE => 맨 뒤에서 2번째 값 != 맨 뒤 값
        // S != E
        char rear = word.charAt(wordLength - 1);
        char secondOfRear = word.charAt(wordLength - 2);
        if (secondOfRear != rear){
            answer.append(rear);
        } else {
            answer.append(secondOfRear + "" + equalCount);
        }

        return answer.toString();
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
