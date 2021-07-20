package level01.E39_두_개_뽑아서_더하기;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Answer01 {

    public int[] solution(int[] numbers) {

        Set<Integer> nonDuplicateNumbers = new TreeSet<>();

        for (int i = 0; i < numbers.length - 1; i++){
            for (int j = i + 1; j < numbers.length; j++){
                nonDuplicateNumbers.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[nonDuplicateNumbers.size()];
        int i = 0;
        for (int x : nonDuplicateNumbers){
            answer[i++] = x;
        }

        return answer;

    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        int[][] numbers = {
                {2,1,3,4,1}, {5,0,2,7}
        };


        for (int i = 0; i < numbers.length; i++){
            for (int x : T.solution(numbers[i])){
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }

}
