package level01.E29_신규_아이디_추천;

import java.util.Arrays;
import java.util.HashMap;

public class Answer01 {

    // 규칙
    // 1. newId의 모든 대문자 => 소문자 치환
    //

    public String solution(String newId) {

        // 1. 모든 대문자 => 소문자
        newId = newId.toLowerCase();

        // 2. 소문자 , 숫자 , (- , _ , .)를 제외한 모든 문자를 제거
        newId = newId.replaceAll("[^-_.a-z0-9]", "");

        // 3. 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표로 치환
        while(newId.contains("..")){
            newId = newId.replace("..", ".");
        }

        // 4. 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        if (newId.length() > 0 && newId.charAt(0) == '.') {
            if (newId.length() == 1){
                newId = "";
            } else {
                newId = newId.substring(1);
            }
        }
        if (newId.length() > 1 && newId.charAt(newId.length()-1) == '.')  newId = newId.substring(0, newId.length()-1);

        // 5. id가 빈 문자열이라면 new_id에 a를 대입
        if (newId.length() == 0) newId = "a";

        // 6. 길이가 16자 이상이면 0~15까지를 제외한 나머지 문자 모두 제거
        if (newId.length() >= 16) {
            newId = newId.substring(0, 15);
            if (newId.charAt(newId.length()-1) == '.') newId = newId.substring(0, 14);
        }

        // 7. newId 길이가 2자 이하라면, newId의 마지막 문자를 newId의 길이가 3이될때까지 끝에 붙인다.
        if (newId.length() <= 2){
            char lastChar = newId.charAt(newId.length()-1);
            while (newId.length() != 3){
                newId += lastChar;
            }
        }

        return newId;
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        String[] newId = {"...!@BaT#*..y.abcdefghijklm", "z-+.^.", "=.=", "123_.def", "abcdefghijklmn.p"};

        for (int i = 0; i < newId.length; i++){
            System.out.println(T.solution(newId[i]));
        }


    }

}
