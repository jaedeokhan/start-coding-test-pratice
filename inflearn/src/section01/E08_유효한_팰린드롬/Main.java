package section01.E08_유효한_팰린드롬;

import java.io.*;

public class Main {

    public String solution(String words){

        // 입력 : words >= 100 공백이 없는 문자열
        // 출력 : 팰린드롬이면 "YES" else "NO"
        // 1. 알파벳 이외의 문자들은 replaceAll로 "" 치환
        // 2. while leftIndex와 rightIndex로 비교하면서 일치하지 않으면 return "NO"

        String answer = "YES";
        String lowerWord = words.toLowerCase();
        String onlyAlphaBetWord = lowerWord.replaceAll("[^a-zA-Z]", "");
        int leftIndex = 0, rightIndex = onlyAlphaBetWord.length() - 1;

        while (leftIndex < rightIndex){
            if (onlyAlphaBetWord.charAt(leftIndex) != onlyAlphaBetWord.charAt(rightIndex)){
                answer = "NO";
                break;
            }
            leftIndex++;
            rightIndex--;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String words = br.readLine();
        bw.write(T.solution(words));

        bw.flush();
        bw.close();
    }
}
