package level01.E18_문자열을_정수로_바꾸기;

public class Answer01 {

    public int solution(String s) {

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        String s = "1234";
        
        System.out.println(T.solution(s));
    }

}
