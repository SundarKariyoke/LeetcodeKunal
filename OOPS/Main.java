package OOPS;

public class Main {
    public static void main(String[] args) {
        Humans sundar = new Humans("Sundar", 26, "Male");
        Humans manoj = new Humans("Manoj",26,"Male");
        Humans bharani = new Humans("Bharani", 25, "Male");

        System.out.println(sundar.name);
        System.out.println(manoj.name);
        System.out.println(bharani.name);
        System.out.println(Humans.population);
    }
}
