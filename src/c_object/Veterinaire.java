package c_object;

public class Veterinaire {

    public static void bilanDeSante() {
        int nbBerger = 0;
        for (Animal animal : Animal.chenil) {
            System.out.println(animal + " passe un bilan de santé : ");
            System.out.println("Tranche d'age : " + animal.getAgeRange());
            System.out.println("Espece : " + animal.getClass().getSimpleName());
            try {
                BergerAllemand berger = (BergerAllemand) animal;
                berger.displayPride();
                nbBerger++;
            } catch (Exception e){}
            System.out.println();
        }
        System.out.println("nbBerger = " + nbBerger);
    }
}
