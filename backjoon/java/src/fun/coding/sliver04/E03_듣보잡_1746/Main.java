package fun.coding.sliver04.E03_듣보잡_1746;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

public class Main {
    // sliver04 1764번 - 듣보잡[https://www.acmicpc.net/problem/1764]
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
        Set<String> nPeople = new HashSet<>();    // 듣도 못한 사람
        Set<String> mPeople = new HashSet<>();    // 보도 못한 사람

        for (int i = 0; i < n; i++){ // 듣도 못한 사람 추가
            nPeople.add(br.readLine());
        }

        for (int i = 0; i < m; i++){ // 보도 못한 사람 추가
            mPeople.add(br.readLine());
        }

        nPeople.retainAll(mPeople); // 듣도 못한 사람과 보도 못한 사람 교집합
        ArrayList<String> peoples = new ArrayList<>(nPeople);

        Collections.sort(peoples); // 단어 오름차순 정렬

        System.out.println(peoples.size()); // 듣도 보도 못한 사람 수 출력
        for (String people : peoples){
            System.out.println(people);
        }
    }
}
