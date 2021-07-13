package coding.section05.E08_응급실;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {

     int id;
     int priority;

     public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Main_A {


    public int solution(int n, int m, int[] danger) {

        int answer = 0;
        Queue<Person> person = new LinkedList<>();
        for (int i = 0; i < n; i++){
            person.offer(new Person(i, danger[i]));
        }

        while (!person.isEmpty()){
            Person nowPerson = person.poll();
            for (Person x : person){
                if (x.priority > nowPerson.priority){
                    person.offer(nowPerson);
                    nowPerson = null;
                    break;
                }
            }
            if (nowPerson != null){
                answer++;
                if(nowPerson.id == m) return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int m = scan.nextInt();
//        int[] danger = new int[n];
//        for (int i = 0; i < n; i++){
//            danger[i] = scan.nextInt();
//        }
//        System.out.println(T.solution(n, m, danger));

        int[] n = {5, 6};
        int[] m = {2, 3};
        int[][] danger = {
        {60,50, 70, 80, 90}, {70, 60, 90, 60, 60, 60}
        };

        for (int i = 0; i < n.length; i++){
            System.out.println(T.solution(n[i], m[i], danger[i]));
        }
    }
}
