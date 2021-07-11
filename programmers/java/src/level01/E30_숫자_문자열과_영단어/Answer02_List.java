package level01.E30_숫자_문자열과_영단어;

import java.util.HashMap;

public class Answer02_List {

    // 일부 자릿수를 영단어로 바꾼 카드 => 원래 숫자 찾는 게임
    
    public int solution(String s) {

        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] alpabets = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        // 숫자만 존재하면 바로 숫자로 변환 후 리턴
        if (s.matches("^[0-9]*$")) return Integer.parseInt(s);

        for (int i = 0; i < 10; i++){
            // s 문장에 alphabets[i]가 포함되어 있지 않으면 replace를 진행하지 않기에 continue
            if (!s.contains(alpabets[i])) continue;

            s = s.replace(alpabets[i], numbers[i]);
        }

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {

        Answer02_List T = new Answer02_List();
        String[] s = {
                "one4seveneight", "23four5six7", "2three45sixseven", "123"
        };
        for (int i = 0; i < s.length; i++){
            System.out.println(T.solution(s[i]));
        }


    }

}
