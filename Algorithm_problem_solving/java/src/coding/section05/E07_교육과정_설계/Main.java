package coding.section05.E07_교육과정_설계;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    // 수업 설계가 잘 된 것이면 "YES" 잘못된 것이면 "NO"
    // 필수과목을 반드시 이수해야한다. => 그 순서도 정해져 있다.
    // 필수과목 CBA ==> C -> B -> A의 순서를 지켜야 한다.


    public String solution(String necessaryClass, String pickClass) {

        String answer = "YES";
        int[] indexArray = new int[necessaryClass.length()];

        int i = 0;
        for (char x : necessaryClass.toCharArray()){
            indexArray[i++] = pickClass.indexOf(x);
        }

        for (int j = 0; j < indexArray.length - 1; j++){
            if (indexArray[j] > indexArray[j + 1]){
                return "NO";
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
//        Scanner scan = new Scanner(System.in);
//        String n = scan.next();
//        String k = scan.next();
//        System.out.println(T.solution(n, k));

        String currentClass = "CBA";
        String pickClass = "CBDAGE";

        System.out.println(T.solution(currentClass, pickClass));
    }
}
