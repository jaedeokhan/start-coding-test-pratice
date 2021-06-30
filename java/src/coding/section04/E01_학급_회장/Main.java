package coding.section04.E01_학급_회장;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public char solution(int n, String students) {

        char answer = '\u0000';
        char[] studentsArray = students.toCharArray();
        HashMap<Character, Integer> studentAndCount = new HashMap<>();

        for (char value : studentsArray){
            if (!studentAndCount.containsKey(value)){ // 학생이 HashMap에 존재하지 X
                studentAndCount.put(value, 1);
            } else {
                studentAndCount.put(value, studentAndCount.get(value) + 1);
            }
        }

        int max = Collections.max(studentAndCount.values());
        for (Map.Entry<Character, Integer> entry : studentAndCount.entrySet()){
            if (entry.getValue() == max) answer = entry.getKey();
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String students = scan.next();

        System.out.print(T.solution(n, students));

    }
}
