package section01.E07_회문문자열;

import java.io.*;

public class Main {

    public String solution(String word){

        // 입력  : gooG, word.length() >= 100
        // 출력  : 회문 문자열이면 "YES" else "NO"
        // 1. 대소문자를 구분하지 않기에 입력값인 word를 toLowerCase()
        // 2. while문으로 leftIndex가 rightIndex보다 작을때 까지 반복한다.
        // 2.1. word의 leftIndex의 값과 rightIndex의 값이 다르면 answer를 "NO"로 변경 후 break
        String answer = "YES";

        String lowerWord = word.toLowerCase();
        int leftIndex = 0, rightIndex = lowerWord.length() - 1;

        while (leftIndex < rightIndex){
            if (lowerWord.charAt(leftIndex) != lowerWord.charAt(rightIndex)){
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

        String word = br.readLine();
        bw.write(T.solution(word));

        bw.flush();
        bw.close();
    }
}
