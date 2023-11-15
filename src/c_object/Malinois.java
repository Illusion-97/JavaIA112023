package c_object;

public class Malinois extends Animal {

    public Malinois(String nom) {
        super(nom);
    }

    public Malinois(String nom, int age, Animal parent, Animal otherParent) {
        super(nom, age, parent, otherParent);
    }
}
