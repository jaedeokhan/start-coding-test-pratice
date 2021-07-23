package coding.section06.E05_중복_확인;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main_2_HashMap {

    public String solution(int n, int[] array) {

        String answer = "U";
        HashMap<Integer, Integer> students = new HashMap<>();

        for (int i = 0; i < n; i++){

            students.put(array[i], students.getOrDefault(array[i], 0) + 1);
            if (students.get(array[i]) == 2){
                return "D";
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_2_HashMap T = new Main_2_HashMap();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = scan.nextInt();
        System.out.println(T.solution(n, array));

//        int n = 8;
//        int[] array = {20, 25, 52, 30, 39, 33, 43, 33};
//        System.out.println(T.solution(n, array));

    }
}
