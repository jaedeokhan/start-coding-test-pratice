package level01.E34_3진법_뒤집기;

public class Answer01 {

    // n을 3진법 상에서 앞뒤로 뒤집은 후, 다시 10진법으로 표현한 수 return
    // n(10진법) -> n(3진법)  ->  앞뒤 반전(3진법)  -> 10진법
    //   45      ->  1200     ->     2100           ->  7

    public int solution(int n) {

        int answer = 0;
        StringBuilder number = new StringBuilder();

        while (n > 0){
            number.append(n % 3);
            n /= 3;
        }

        return Integer.parseInt(number.toString(), 3);
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        int[] n = {45, 125};

        for (int i = 0; i < n.length; i++){
            System.out.println(T.solution(n[i]));
        }
    }

}
