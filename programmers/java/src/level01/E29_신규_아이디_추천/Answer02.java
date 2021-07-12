package level01.E29_신규_아이디_추천;

public class Answer02 {

    public String solution(String newId) {

        // 규칙 1. 대문자 -> 소문자
        newId = newId.toLowerCase();

        // 규칙 2. (-, _, .), a-z, 0-9 제외하고 나머지 공백으로
        newId = newId.replaceAll("[^-_.a-z0-9]", "");

        // 규칙 3. .. -> .
        newId = newId.replaceAll("[.]{2,}", ".");
        System.out.println(newId);

        // 규칙 4. 맨 앞(^)에 .과 |(or) 맨 뒤($) .을 공백으로
        newId = newId.replaceAll("^[.]|[.]$", "");

        // 규칙 5. 공백이면 a를 추가
        if (newId.equals("")) newId += "a";

        // 규칙 6. 신규아이디가 16자리 이상이면 15자리까지! &&
        // 제거 후 마침표(.)가 맨 끝에 있으면 제거
         if (newId.length() >= 16){
            newId = newId.substring(0, 15).replaceAll("[.]$", "");
         }

         // 규칙 7. 아이디의 길이가 2자 이하라면, newId의 마지막 문자로 길이가 3이 될때까지 붙인다.
         if (newId.length() <= 2){
             while (newId.length() != 3){
                 newId += newId.charAt(newId.length() - 1);
             }
         }

        return newId;
    }

    public static void main(String[] args) {

        Answer02 T = new Answer02();
        String[] newId = {"...!@BaT#*..y.abcdefghijklm", "z-+.^.", "=.=", "123_.def", "abcdefghijklmn.p"};

        for (int i = 0; i < newId.length; i++){
            System.out.println(T.solution(newId[i]));
        }


    }

}
