package OOPS;

public class Humans {
    String name;
    int age;
    String gender;
    static long population;

    Humans(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        Humans.population += 1;
    }
}
