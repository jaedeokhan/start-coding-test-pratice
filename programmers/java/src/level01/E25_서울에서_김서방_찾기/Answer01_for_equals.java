package level01.E25_서울에서_김서방_찾기;

public class Answer01_for_equals {

    public String solution(String[] seoul) {

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer.append("김서방은 " + i + "에 있다");
                break;
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        Answer01_for_equals T = new Answer01_for_equals();
        String[] seoul = {"Jane", "Kim"};

        System.out.println(T.solution(seoul));
    }

}
