package fun.coding.bronze02.E04_단어의_개수_1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3_StringTokenizer {
    // bronze2 1152번, 단어의 개수[https://www.acmicpc.net/problem/1152]
    // 문제 - 영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다.
    // 이 문자열에는 몇 개의 단어가 있을까?
    // 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
    // 주의 - 문자열의 앞과 뒤에는 공백이 있을 수도 있다.

    public int solution(String string){
        StringTokenizer st = new StringTokenizer(string, " ");

        return st.countTokens();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main_3_StringTokenizer T = new Main_3_StringTokenizer();
        String string = br.readLine();

        System.out.println(T.solution(string));
    }
}
