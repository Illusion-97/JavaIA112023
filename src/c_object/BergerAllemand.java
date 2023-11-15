package c_object; // pas de majuscules dans les noms de package

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

    @Override
    public void bark() {

    }

    @Override
    public void fight(Chien enemy) {

    }
}
