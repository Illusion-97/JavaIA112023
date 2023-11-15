package c_object; // pas de majuscules dans les noms de package

import java.util.Random;

// Pas d'espace, Commence par une majuscule et on en met une autre a chaque nouveau mot
public class BergerAllemand extends Animal implements Chien {
    // Même principe pour les attributs et les méthodes, hormis la première lettre en minuscule
    /*
    *
    *
    * */
    private int pride;

    public BergerAllemand(String nom, int age, Animal parent, Animal otherParent) {
        super(nom, age, parent, otherParent);
        pride = 10;
    }


    /**
     * Représente la fierté de l'animal
     */
    public int getPride() {
        return pride;
    }

    public void displayPride() {
        System.out.println(nom + " démontre sa fierté");
    }

    /**
     * Le Berger Allemand fait un cri de chien battu si sa fierté est inférieure à 10
     * sinon il aboie autant de fois qu'il a de fierté
     */
    @Override
    public void bark() {
        if(pride < 10) {
            bark("Awww");
        } else  {
            String wooff = "WOOFF";
            bark(wooff.repeat(pride));
        }
        //bark(pride < 10 ? "Awww" : "WOOFF".repeat(pride));
    }

    /**
     * Le Berger Allemand se bat pour sa fierté
     * Il utilise displayPride s'il gagne
     * @param enemy
     */
    @Override
    public void fight(Chien enemy) {
        System.out.println(nom + " se bat pour sa fierté");
        if (this == getWinner(enemy)) displayPride();
    }
}
