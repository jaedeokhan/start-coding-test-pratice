package section02.E02_보이는_학생;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public int solution(int n, int[] students){

        // 입력 : n명(5 <= n <=100,000), n명의 학생들
        // 출력 : 선생님이 볼 수 있는 최대학생수

        // - 조건1
        // 앞에 서 있는 사람들 보다 크면 보이고,
        // 작거나 같으면 보이지 않는다.

        // 0. 첫 번째는 무조건 보이니 answer = 1로 할당,
        //    현재 최댓값 int maxHeight = students[0] 할당
        // 1. for i in range(1, n)
        // 1.1. if maxHeight < students[i]
        // 1.1.1. answer++;
        // 1.1.2. maxHeight = students[i];

        int answer = 1;
        int maxHeight = students[0];

        for (int i = 1; i < n; i++){
            int currentStudentHeight = students[i];

            if (currentStudentHeight > maxHeight){
                answer++;
                maxHeight = currentStudentHeight;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] students = new int[n];

        for (int i = 0; i < n; i++){
            students[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(T.solution(n, students)));

        bw.flush();
        bw.close();
    }
}
