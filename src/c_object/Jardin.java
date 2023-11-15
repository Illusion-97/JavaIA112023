package c_object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jardin {

    public static void main(String[] args) {
        // Une Déclaration d'objet telle que ci-dessous crée une instance de la classe
        System.out.println("Animal.nomStatic = " + Animal.nomStatic);
        Animal unAnimal = new Animal(); // new fait appel au constructeur de la classe
        System.out.println("unAnimal.id = " + unAnimal.id);
        System.out.println("unAnimal.nom = " + unAnimal.nom);
        unAnimal.happyBirthday();
        System.out.println("Animal.count = " + Animal.count);
        System.out.println("Animal.nomStatic = " + Animal.nomStatic);
        unAnimal.test();
        System.out.println("Après test");
        System.out.println("unAnimal.id = " + unAnimal.id);
        System.out.println("unAnimal.nom = " + unAnimal.nom);
        System.out.println("unAnimal.getAgeRange().name() = " + unAnimal.getAgeRange().name());
        Animal unAutreAnimal = new Animal();
        System.out.println("unAutreAnimal.id = " + unAutreAnimal.id);
        System.out.println("unAutreAnimal.nom = " + unAutreAnimal.nom);
        System.out.println("Animal.count = " + Animal.count);
        System.out.println("Animal.nomStatic = " + Animal.nomStatic);
        unAutreAnimal.happyBirthday();
        Animal bambino = new Animal("Bambino");
        bambino.happyBirthday();
        bambino.happyBirthday();
        bambino.happyBirthday();
        System.out.println("bambino.id = " + bambino.id);
        System.out.println("bambino.nom = " + bambino.nom);
        System.out.println("Animal.count = " + Animal.count);

        Animal petiot = new Animal("Petiot", 3, bambino, null);
        System.out.println("petiot.id = " + petiot.id);
        System.out.println("petiot.nom = " + petiot.nom);
        System.out.println("petiot.getAgeRange().name() = " + petiot.getAgeRange().name());
        System.out.println("petiot.parents = " + Arrays.toString(petiot.parents));
        System.out.println("Animal.count = " + Animal.count);
        petiot.happyBirthday();

        System.out.println("\nHéritage : ");

        Malinois era = new Malinois("Era");
        System.out.println("era.nom = " + era.nom);

        BergerAllemand unBergerAllemand = new BergerAllemand("berger", 8, null, null);
        System.out.println(unBergerAllemand.getAgeRange());
        Animal leo = new BergerAllemand("leo", 5, null, null);
        leo.happyBirthday();
        Animal eraAnimal = castVersAnimal(era);
        System.out.println(eraAnimal.getAgeRange().name());
        // System.out.println(leo.getPride()); N'est pas possible puisque leo est considéré actuellement comme un Animal
        BergerAllemand leoBerger = castAnimalVersBergerAllemand(leo); // Cast (conversion) : Animal leo -> BergerAllemand leoBerger
        // Une fois la conversion effectuée entre la classe Animal et la classe BergerAllemand
        System.out.println(leoBerger.getPride()); // je peux afficher la fierté de leo


        System.out.println("\nChenil : ");
        /*int nbBerger = 0;
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
        System.out.println("nbBerger = " + nbBerger);*/
        Veterinaire.bilanDeSante();

        System.out.println("\nFightClub :");
        Chien chienMalinois = new Malinois("chienMalinois", 2, null, null);
        Chien chienBerger = castVersChien(leoBerger);
        chienMalinois.bark();
        //chienBerger.displayPride(); leoBerger est actuellement considéré comme un Chien
        BergerAllemand chienBergerEnBerger = castChienVersBergerAllemand(chienBerger);
        chienBergerEnBerger.displayPride();

        FightClub.afficherCombattants();



    }

    private static Chien castVersChien(BergerAllemand bergerAllemand) {
        return (Chien) bergerAllemand; // Convertis un BergerAllemand en Chien
    }

    private static Animal castVersAnimal(Malinois malinois) {
        return (Animal) malinois; // Convertis un Malinois en Animal
    }

    private static BergerAllemand castChienVersBergerAllemand(Chien chien) {
        return (BergerAllemand) chien; // Convertis un Chien en BergerAllemand
    }

    private static BergerAllemand castAnimalVersBergerAllemand(Animal animal) {
        return (BergerAllemand) animal; // Convertis un Animal en BergerAllemand
    }
}
