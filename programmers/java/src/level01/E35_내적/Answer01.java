package level01.E35_내적;

public class Answer01 {

    // n을 3진법 상에서 앞뒤로 뒤집은 후, 다시 10진법으로 표현한 수 return
    // n(10진법) -> n(3진법)  ->  앞뒤 반전(3진법)  -> 10진법
    //   45      ->  1200     ->     2100           ->  7

    public int solution(int[] a, int[]  b) {

        int answer = 0;

        for (int i = 0; i < a.length; i++){
            answer += a[i] * b[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        int[][] a = {
                {1,2,3,4}, {-1,0,1}
        };
        int[][] b = {
                {-3,-1,0,2}, {1,0,-1}
        };

        for (int i = 0; i < a.length; i++){
            System.out.println(T.solution(a[i], b[i]));
        }
    }

}
