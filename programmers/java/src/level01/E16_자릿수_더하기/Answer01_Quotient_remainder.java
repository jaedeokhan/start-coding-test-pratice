package level01.E16_자릿수_더하기;

public class Answer01_Quotient_remainder {

    public int solution(int num) {

        int answer = 0;

        while (num > 0){
            answer += num % 10;
            num /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {

        Answer01_Quotient_remainder T = new Answer01_Quotient_remainder();
        int[] n = {123, 987};

        for (int i = 0; i < n.length; i++){
            System.out.println(T.solution(n[i]));
        }

    }

}
