package level01.E16_자릿수_더하기;

public class Answer03_Char_toCharArray {

    public int solution(int num) {

        int answer = 0;

        for (char number : String.valueOf(num).toCharArray()){
            answer += (number - 48);
        }

        return answer;
    }

    public static void main(String[] args) {

        Answer03_Char_toCharArray T = new Answer03_Char_toCharArray();
        int[] n = {123, 987};

        for (int i = 0; i < n.length; i++){
            System.out.println(T.solution(n[i]));
        }

    }

}
