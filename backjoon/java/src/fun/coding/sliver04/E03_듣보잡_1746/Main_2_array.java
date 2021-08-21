package fun.coding.sliver04.E03_듣보잡_1746;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_2_array {
    // sliver04 1764번 - 듣보잡[https://www.acmicpc.net/problem/1764]
    // 해당 방식은 O(n * m) 방식으로 접근하면 n과 m의 최악의 경우에 길이가 500,000이기에 실패!
    // 문제
    //  - 듣도 못한 사람의 명단과, 보도 못한 사람의 명단이 주어질 때,
    //    듣도 보도 못한 사람의 명단을 구하기
    // 입력
    //  - 첫째 줄에 듣도 못한 사람의 수 N, 보도 못한사람의 수 M
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()); // 듣도 못한 사람의 수
        int m = Integer.parseInt(st.nextToken()); // 보도 못한 사람의 수
        String[] nPeoples = new String[n];    // 듣도 못한 사람
        String[] mPeoples = new String[m];    // 보도 못한 사람

        for (int i = 0; i < n; i++){ // 듣도 못한 사람 추가
            nPeoples[i] = br.readLine();
        }

        for (int i = 0; i < m; i++){ // 보도 못한 사람 추가
            mPeoples[i] = br.readLine();
        }
        
        ArrayList<String> peoples = new ArrayList<>();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (nPeoples[i].equals(mPeoples[j])){
                    peoples.add(nPeoples[i]);
                }
            }
        }

        Collections.sort(peoples);

        System.out.println(peoples.size());
        for (String people : peoples) {
            System.out.println(people);
        }
    }
}
