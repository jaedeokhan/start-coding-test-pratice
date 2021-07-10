package level01.E23_수박수박수박수박수박수;

public class Answer01_Ternary_operator {

    // (n = 3, answer = "수박수") , (n = 4, answer = "수박수박")

    public String solution(int n) {

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++){
            answer.append((i % 2 == 0) ? "수" : "박");
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        Answer01_Ternary_operator T = new Answer01_Ternary_operator();
        int[] n = {3, 4};

        for (int i = 0; i < n.length; i++){
            System.out.println(T.solution(n[i]));
        }
    }

}
