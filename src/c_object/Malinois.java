package c_object;

// implements indique qu'une classe respecte la structure déclarée dans une interface
public class Malinois extends Animal implements Chien {

    public Malinois(String nom) {
        super(nom);
    }

    public Malinois(String nom, int age, Animal parent, Animal otherParent) {
        super(nom, age, parent, otherParent);
    }

    @Override // Réécrit le comportement d'une méthode déjà déclarée
    public void bark() { // une méthode dont le comportement n'est pas défini dans une interface
        // doit être explicitement écrite dans la classe qui l'implémente
    }

    @Override
    public void fight(Chien enemy) {

    }
}
