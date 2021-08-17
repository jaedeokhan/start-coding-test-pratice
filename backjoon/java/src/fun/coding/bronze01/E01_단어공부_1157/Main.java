package fun.coding.bronze01.E01_단어공부_1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // bronze1 - 1157번 - 단어 공부[https://www.acmicpc.net/problem/1157]
    // 문제 - 알파벳 대소문자로 된 단어가 주어지면 이 단어에서 가장 많이 사용되는 알파벳을 찾아내는 프로그램
    // 주의 - 대소문자 구별 x

    // 최댓값의 인덱스를 구하는 함수
    public int getMaxValueIndex(int[] answer){
        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < answer.length; i++){
            if (answer[i] > max){
                max = answer[i];
                index = i;
            }
        }

        return index;
    }

    // 최댓값이 중복되는지 체크하는 함수
    public boolean checkDuplicateMaxValue(int maxIndex, int[] answer){
        int duplicateCount = 0;

        for (int i = 0; i < answer.length; i++){
            if (answer[maxIndex] == answer[i]) duplicateCount++;
        }

        // 최댓값(maxIndex) 이외에 동일한 값이 있으면 카운트는 2개 이상이기에 true
        if (duplicateCount > 1) return true;

        return false;
    }

    public char solution(String word){

        int[] answer = new int[26]; // A-Z를 담을 26개의 공간 할당
        word = word.toUpperCase();  // 모두 대문자화

        for (int i = 0; i < word.length(); i++){
            char alphabet = word.charAt(i);
            answer[alphabet - 'A'] += 1;   // Ex) A가  65이면  => (65 - 65) == 0는 0이다.
        }

        // 최댓값의 인덱스 구하는 메서드
        int maxIndex = getMaxValueIndex(answer);

        // 최댓값이 중복되는지 구하는 메서드
        if (checkDuplicateMaxValue(maxIndex, answer)) return '?'; // 중복되는 최댓값이 있으면 ?를 리턴

        // 여기까지 오면 최댓값이 중복되지 않기에 maxIndex + 65를 하고
        // (char) 명시적 형변환하면 해당 대문자 출력
        return (char) (maxIndex + 65);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Main T = new Main();
        String word = br.readLine();
        System.out.println(T.solution(word));
    }
}
