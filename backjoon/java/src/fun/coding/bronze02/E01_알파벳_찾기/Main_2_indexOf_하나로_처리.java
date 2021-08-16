package fun.coding.bronze02.E01_알파벳_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2_indexOf_하나로_처리 {
    // bronze2 - 10809번 - 알파벳 찾기[https://www.acmicpc.net/problem/10809]
    // 알파벳 소문자로만 이루어진 단어 s가 주어진다.
    // 각각 알파벳에 대해 단어에 포함되어 있는 경우에는 처음 등장하는 위치, 없는 경우 -1을 출력

    // 아스키 코드 (a)97 - (z)122까지 반복을 한다.
    // if (s.indexOf(i) == -1) -1 출력
    // else s.indexOf(i) 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        // indexOf(i)가 만약 존재하지 않는다면 반환값은 -1이다.
        for (int i = 97; i <= 122; i++) {
            System.out.print(s.indexOf(i) + " ");
        }
    }
}
