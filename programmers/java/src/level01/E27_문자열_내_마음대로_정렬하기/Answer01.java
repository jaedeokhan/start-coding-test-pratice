package level01.E27_문자열_내_마음대로_정렬하기;

import java.util.Arrays;
import java.util.Comparator;

public class Answer01 {

    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) > o2.charAt(n)) return 1;
                else if (o1.charAt(n) == o2.charAt(n)) return o1.compareTo(o2);
                else return -1;
            }
        });

        return strings;
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        String[][] strings = { {"sun", "bed", "car"}, {"abce", "abcd", "cdx"}};
        int[] n = {1, 2};

        for (int i = 0; i < strings.length; i++){
            System.out.println(Arrays.toString(T.solution(strings[i], n[i])));
        }
    }

}
