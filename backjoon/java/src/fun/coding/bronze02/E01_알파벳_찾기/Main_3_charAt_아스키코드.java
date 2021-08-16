package fun.coding.bronze02.E01_알파벳_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_3_charAt_아스키코드 {
    // bronze2 - 10809번 - 알파벳 찾기[https://www.acmicpc.net/problem/10809]
    // 알파벳 소문자로만 이루어진 단어 s가 주어진다.
    // 각각 알파벳에 대해 단어에 포함되어 있는 경우에는 처음 등장하는 위치, 없는 경우 -1을 출력

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] array = new int[26]; // a ~ z는 26개이므로 26개의 배열 생성
        for (int i = 0; i < 26; i++){
            array[i] = -1; // -1로 모두 초기화
        }

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            // "backjoon"과 같은 경우에서 'o'가 두 번 나오기에 'j'뒤에 있는 앞의 'o'의 인덱스를 기록해야 한다.
            // 첫 번째 o는 array의 해당 인덱스가 -1인 경우 성립하기에 i를 대입해준다.
            // 두 번째 o는 array[ch - 'a']가 5이기에 if문에 성립되지 않고 지나간다.
            if (array[ch - 'a'] == -1) array[ch - 'a'] = i;
        }

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
