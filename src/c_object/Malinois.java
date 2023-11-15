package c_object;

import java.util.Random;

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
        //AgeRange trancheAge = getAgeRange();
        switch (getAgeRange()) {
            case JEUNE -> bark("HawHaw");
            case ADULTE -> bark("WafWaf");
            case SENIOR -> bark("Wouf");
            default -> bark("aww");
        }
    }

    /**
     * Le malinois se bat pour l'honneur de son maître
     * S'il gagne il lui saute dessus, sinon il part se cacher
     * @param enemy
     */
    @Override
    public void fight(Chien enemy) {
        System.out.println(nom + " se bat pour l'honneur de son maître");

        /*if (this == getWinner(enemy)) System.out.println(nom + " saute sur son maître !");
        else System.out.println(nom + " part se cacher !");*/

        System.out.println(nom + (this == getWinner(enemy) ? " saute sur son maître !" : " part se cacher !"));
    }
}
