package level01.E25_서울에서_김서방_찾기;

import java.util.Arrays;

public class Answer02_Arrays_asList_indexOf {

    public String solution(String[] seoul) {

        return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
    }

    public static void main(String[] args) {

        Answer02_Arrays_asList_indexOf T = new Answer02_Arrays_asList_indexOf();
        String[] seoul = {"Jane", "Kim"};

        System.out.println(T.solution(seoul));
    }

}
