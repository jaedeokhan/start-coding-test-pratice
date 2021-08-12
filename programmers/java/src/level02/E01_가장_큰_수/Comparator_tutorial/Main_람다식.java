package level02.E01_가장_큰_수.Comparator_tutorial;

import java.util.Arrays;
import java.util.Comparator;

public class Main_람다식 {

    public String solution(int[] numbers){

        StringBuilder answer = new StringBuilder();
        String[] stringNumbers = new String[numbers.length];

        for (int i = 0; i < stringNumbers.length; i++){
            stringNumbers[i] = String.valueOf(numbers[i]);
        }

        Comparator<String> comparator =
                (o1, o2) -> (o2 + o1).compareTo(o1 + o2);
        Arrays.sort(stringNumbers, comparator);

        // 0만 있는 배열의 경우 하나의 0만 리턴
        if ("0".equals(stringNumbers[0])) return "0";

        for (int j = 0; j < stringNumbers.length; j++){
            answer.append(stringNumbers[j]);
        }

        return answer.toString();
    }

    public static void main(String[] args){

        Main_람다식 T = new Main_람다식();
        int[][] numbers = {{6, 10, 2}, {3, 30, 34, 5, 9}};
        for (int i = 0; i < numbers.length; i++){
            System.out.println(T.solution(numbers[i]));
        }
    }

}
