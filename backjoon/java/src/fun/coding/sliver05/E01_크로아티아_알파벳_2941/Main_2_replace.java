package fun.coding.sliver05.E01_크로아티아_알파벳_2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2_replace {
    // sliver05 - 2941번 - 크로아티아 알파벳
    // 처음에 문제를 너무 어렵게 접근을 했다...음
    // 운영체제에서 입력할 수 없는 크로아티아 알파벳은 하나의 문자로 replace() 치환해주고
    // 다른 알파벳은 개수를 하나씩 세어주면 된다...이런

    public int solution(String word){
        int answer = 0;
        String[] croatiaAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String croatiaAlphabet : croatiaAlphabets){
            word = word.replace(croatiaAlphabet, "0");
        }

        return word.length();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main_2_replace T = new Main_2_replace();
        String word = br.readLine();

        System.out.println(T.solution(word));
    }
}
