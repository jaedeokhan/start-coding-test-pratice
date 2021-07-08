package level01.E10_최대공약수와_최소공배수;

import java.util.Arrays;

public class Answer02_GCD_LCD {

    public int GCD_UC(int n, int m){

        while (m != 0) {
            int temp = n % m;
            n = m;
            m = temp;
        }
        return n;
    }

    public int LCD_UC(int n, int m){
        return (n * m) / GCD_UC(n, m);
    }

    public int[] solution(int n, int m) {

        int[] answer = new int[2];

        answer[0] = GCD_UC(n, m);
        answer[1] = LCD_UC(n, m);

        return answer;

    }

    public static void main(String[] args) {

        Answer02_GCD_LCD T = new Answer02_GCD_LCD();
        int[] n = {3, 2, 12, 16};
        int[] m = {12, 5, 16, 20};

        for (int i = 0; i < n.length; i++){
            System.out.println(Arrays.toString(T.solution(n[i], m[i])));
        }

    }

}
