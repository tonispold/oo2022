public class Info {
    String name;
    String lastname;
    int age;
    String nationality;
    int points;

    public Info(String name, String lastname, int age, String nationality, int points) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.nationality = nationality;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", points=" + points +
                '}';
    }
}
