package c_object;

import java.util.Random;

// Une interface est "plan de plan", définis une structure (un contrat) que doit respecter une classe
public interface Chien {
    public void bark();
    // Surcharge : une déclaration de la même méthode avec des paramètres différents
    default void bark(String voice) {
        // une méthode par défaut dans une interface fournit un comportement
        // tout en laissant le choix aux classes de le réécrire ou non
        System.out.println(voice);
    }
    public void fight(Chien enemy);
    default Chien getWinner(Chien enemy) {
        Chien winner = new Random().nextBoolean() ? this : enemy;
        winner.bark(winner + " remporte la bataille !");
        return winner;
    }
}
