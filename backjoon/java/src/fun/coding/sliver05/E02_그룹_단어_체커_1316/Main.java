package fun.coding.sliver05.E02_그룹_단어_체커_1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // sliver05, 1316번 - 그룹 단어 체커
    // 문제
    //    - 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우
    //    - 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램
    // 주의
    //    - 단어는 알파벳 소문자로 구성, 중복되지 않는다.
    // 입력
    //    - 단어의 개수 N(N <= 100)
    //    - 둘째줄 부터 N개의 줄에 단어가 들어온다
    // 출력
    //    - 그룹 단어의 개수를 출력
    // 문제접근
    //    - 그룹 문자가 아닌 경우는 answer--를 가감하는 형태로 진행

    public int solution(int n, String[] words){

        int answer = n; // 그룹문자가 아닌 경우를 가감해줄 것이니 단어의 개수를 할당

        for (int i = 0; i < n; i++){
            int[] alphabets = new int[26]; // 각 단어마다 알파벳을 체크해줄 배열
            String word = words[i];        // 각 단어

            if (word.length() == 1) continue; // 1인 경우는 무조건 그룹단어이므로 continue;

            // word의 길이가 두 개 이상인 경우
            for (int j = 0; j < word.length() - 1; j++){ // word 문자열의 마지막 앞의 값까지 진행
                char alpha = word.charAt(j); // 앞의 문자
                alphabets[alpha - 'a'] += 1; // 앞 문자가 나온 횟수 증감

                char nextAlpha = word.charAt(j + 1); // 앞의 문자의 바로 뒤 문자
                // 앞과 뒤 문자가 다르고, 뒤 문자의 값이 한 번이라도 나온적이 있으면
                if (alpha != nextAlpha && alphabets[nextAlpha - 'a'] > 0) {
                    answer--; // 그룹 단어가 아니므로 answer를 가감
                    break;    // 멈추고, 다음 단어로 출발
                }
            }
        }

        return answer;
    }

   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main T = new Main();
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];

        for (int i = 0; i < n; i++){
            words[i] = br.readLine();
        }

        System.out.println(T.solution(n, words));
    }
}
