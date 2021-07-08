package level01.E08_평균_구하기;

public class Answer01 {

    public double solution(int[] arr) {

        double answer = 0;

        for (int i = 0; i < arr.length; i++){
            answer += arr[i];
        }

        return answer / arr.length;
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        int[][] arr = {{1,2,3,4}, {5,5}};

        for (int i = 0; i < arr.length; i++){
            System.out.println(T.solution(arr[i]));
        }

    }

}
