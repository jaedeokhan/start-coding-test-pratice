package level01.E30_숫자_문자열과_영단어;

import java.util.HashMap;

public class Answer01_HashMap {

    // 일부 자릿수를 영단어로 바꾼 카드 => 원래 숫자 찾는 게임

    public int solution(String s) {

        int answer = 0;
        HashMap<Integer, String> numbers = new HashMap<>(){{
           put(0, "zero");
           put(1, "one");
           put(2, "two");
           put(3, "three");
           put(4, "four");
           put(5, "five");
           put(6, "six");
           put(7, "seven");
           put(8, "eight");
           put(9, "nine");
        }};

        // 숫자만 존재하면 바로 숫자로 변환 후 리턴
        if (s.matches("^[0-9]*$")) return Integer.parseInt(s);

        for (int i = 0; i < 10; i++){
            if (!s.contains(numbers.get(i))){
                continue;
            }

            s = s.replace(numbers.get(i), String.valueOf(i));
        }

        answer = Integer.parseInt(s);

        return answer;
    }

    public static void main(String[] args) {

        Answer01_HashMap T = new Answer01_HashMap();
        String[] s = {
                "one4seveneight", "23four5six7", "2three45sixseven", "123"
        };
        for (int i = 0; i < s.length; i++){
            System.out.println(T.solution(s[i]));
        }


    }

}
