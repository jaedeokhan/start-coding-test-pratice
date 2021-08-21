package fun.coding.sliver04.E03_듣보잡_1746;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_3_binarySearch {
    // sliver04 1764번 - 듣보잡[https://www.acmicpc.net/problem/1764]
    // 해당 방식은 ArrayList<String>와 indexOf(), get()으로 해결하려 했으나 O(n)방식도 당연히 실패
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
        ArrayList<String> nPeoples = new ArrayList<>();    // 듣도 못한 사람
        ArrayList<String> commonPeoples = new ArrayList<>(); // 듣도 보도 못한 사람의 담을 리스트

        for (int i = 0; i < n; i++){ // 듣도 못한 사람 추가
            nPeoples.add(br.readLine());
        }

        // 이진검색을 하기 위해서는 정렬이 되어있어야 한다!
        Collections.sort(nPeoples);

        for (int i = 0; i < m; i++){
            String mPeople = br.readLine(); // 보도 못한 사람 입력
            int index = Collections.binarySearch(nPeoples, mPeople); // 듣도 못한 사람의 리스트에서 보도 못한 사람있는지 검색
            if (index >= 0){
                commonPeoples.add(nPeoples.get(index));
            }
        }

        // 듣도 보도 못한 사람 정렬
        Collections.sort(commonPeoples);

        System.out.println(commonPeoples.size());
        for (String people : commonPeoples){
            System.out.println(people);
        }
    }
}
