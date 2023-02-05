package classWork;

public class People {

    int age;
    String name;

    People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name+" "+age;
    }

}
