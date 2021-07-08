package level02.E01_가장_큰_수.Comparator_tutorial;

public class ScooerPlayer implements Comparable<ScooerPlayer>{

    private String name;
    private String position;
    private int age;

    public ScooerPlayer(String name, String position, int age) {
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(ScooerPlayer player) {
        return name.compareTo(player.getName());
    }
}
