package level02.E01_가장_큰_수.Comparator_tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StudyJava {

    public static void main(String[] args) {

        String[] sports = new String[]{"Scooer", "Baseball", "Tennis", "Football", "Basketball", "Ski", "Hockey", "Aerobics"};
        String[] names = new String[]{"하정우", "장돈건", "김수현", "박보검", "송중기", "송승헌", "강동원", "박서준", "김우빈"};

        // Comparable : 기본 정렬기준을 구현하는데 사용용
       Arrays.sort(sports); // ABC
        Arrays.sort(names);  // 가나다

        for (int i = 0; i < sports.length; i++){
            System.out.print(sports[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < names.length; i++){
            System.out.print(names[i] + " ");
        }

        System.out.println();

        ArrayList<String> sportsList = new ArrayList<>();

        sportsList.add("Scooer");
        sportsList.add("Baseball");
        sportsList.add("Tennis");
        sportsList.add("Hockey");
        sportsList.add("Ski");
        sportsList.add("Aerobics");
        sportsList.add("Football");

        Collections.sort(sportsList);

        for (int i = 0; i < sportsList.size(); i++){
            System.out.print(sportsList.get(i) + " ");
        }

        System.out.println();
        // Error Test

        ArrayList<ScooerPlayer> lists = new ArrayList<>();

        lists.add(new ScooerPlayer("안정환", "MF", 21));
        lists.add(new ScooerPlayer("기성용", "MF", 25));
        lists.add(new ScooerPlayer("설기현", "MF", 24));

        Collections.sort(lists);

        for (int i = 0; i < lists.size(); i++){
            System.out.println(lists.get(i).getName());
        }

        System.out.println();

        // Comparable을 implements하지 않고도 오브젝트의 특정 변수를 기준으로 정렬하는 방법이 존재
        // Comparator를 사용하면 정렬 기준을 본인이 원하는대로 바꾸는 것이 가능!
        Collections.sort(lists, new Comparator<ScooerPlayer>() {
            @Override
            public int compare(ScooerPlayer o1, ScooerPlayer o2) {
                if (o1.getAge() > o2.getAge()){
                    return 1;
                } else if (o1.getAge() < o2.getAge()){
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        for (int i = 0; i < lists.size(); i++){
            System.out.println(lists.get(i).getName() + " " + lists.get(i).getAge());
        }

    }
}
