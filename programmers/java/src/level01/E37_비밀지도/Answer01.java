package level01.E37_비밀지도;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Answer01 {

    // 문제 : 네오가 프로도가 비상금을 숨겨놓은 장소를 알려줄 비밀지도의 위치 찾기!
    // 1. 지도는 한 변의 길이가 n인 정사각형 배열 => 공백(" "), 벽("#") 두 종류
    //    - 벽("#") => 1, 공백(" ") => 0
    // 2. 전체 지도는 두 장의 지도 겹쳐서 획득 가능
    //   - 지도1, 지도2 어느 하나다로 벽인 부분은 전체지도에서도 벽이다. => OR 연산

    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] answer = new String[n]; // n만큼 크기 할당

        for (int i = 0; i < n; i++){
            int orValue = arr1[i] | arr2[i]; // or 연산을 한 값
            String orString = Integer.toBinaryString(orValue);

            while (orString.length() < n){
                orString = "0" + orString;
            }

            orString = orString.replace("1","#").replace("0", " ");
            answer[i] = orString;
        }

        return answer;
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        int[] n = {5, 6};
        int[][] arr1 = {
                {9, 20, 28, 18, 11}, {46, 33, 33 ,22, 31, 50}
        };
        int[][] arr2 = {
                {30, 1, 21, 17, 28}, {27 ,56, 19, 14, 14, 10}
        };

        for (int i = 0; i < n.length; i++){
            System.out.println(Arrays.toString(T.solution(n[i], arr1[i], arr2[i])));
        }
    }

}
