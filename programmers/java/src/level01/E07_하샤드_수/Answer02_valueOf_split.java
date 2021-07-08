package level01.E07_하샤드_수;

public class Answer02_valueOf_split {

    public boolean solution(int x) {

        String[] numbers = String.valueOf(x).split("");
        int sum = 0;

        for (String num : numbers){
            sum += Integer.parseInt(num);
        }

        return (x % sum == 0)  ? true : false;
    }

    public static void main(String[] args) {

        Answer02_valueOf_split T = new Answer02_valueOf_split();
        int[] arr = {10, 12, 11, 13};

        for (int i = 0; i < arr.length; i++){
            System.out.println(T.solution(arr[i]));
        }

    }

}
