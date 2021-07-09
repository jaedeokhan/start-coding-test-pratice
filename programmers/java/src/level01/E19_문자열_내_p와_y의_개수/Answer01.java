package level01.E19_문자열_내_p와_y의_개수;

public class Answer01 {

    public boolean solution(String s) {
        int pCount = 0, yCount = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'p') pCount++;
            else if(s.charAt(i) == 'y') yCount++;
        }

        return (pCount == yCount) ? true : false;
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        String s[] = {"pPoooyY", "Pyy"};

        for (int i = 0; i < s.length; i++){
            System.out.println(T.solution(s[i]));
        }
    }

}
