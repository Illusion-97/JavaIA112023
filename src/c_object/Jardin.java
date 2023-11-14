package c_object;

import java.util.Arrays;

public class Jardin {

    public static void main(String[] args) {
        // Une Déclaration d'objet telle que ci-dessous crée une instance de la classe
        System.out.println("Animal.nomStatic = " + Animal.nomStatic);
        Animal unAnimal = new Animal(); // new fait appel au constructeur de la classe
        System.out.println("unAnimal.id = " + unAnimal.id);
        System.out.println("unAnimal.nom = " + unAnimal.nom);

        System.out.println("Animal.count = " + Animal.count);
        System.out.println("Animal.nomStatic = " + Animal.nomStatic);
        unAnimal.test();
        System.out.println("Après test");
        System.out.println("unAnimal.id = " + unAnimal.id);
        System.out.println("unAnimal.nom = " + unAnimal.nom);
        Animal unAutreAnimal = new Animal();
        System.out.println("unAutreAnimal.id = " + unAutreAnimal.id);
        System.out.println("unAutreAnimal.nom = " + unAutreAnimal.nom);
        System.out.println("Animal.count = " + Animal.count);
        System.out.println("Animal.nomStatic = " + Animal.nomStatic);

        Animal bambino = new Animal("Bambino");
        System.out.println("bambino.id = " + bambino.id);
        System.out.println("bambino.nom = " + bambino.nom);
        System.out.println("Animal.count = " + Animal.count);

        Animal petiot = new Animal("Petiot", 3, bambino, null);
        System.out.println("petiot.id = " + petiot.id);
        System.out.println("petiot.nom = " + petiot.nom);
        System.out.println("petiot.parents = " + Arrays.toString(petiot.parents));
        System.out.println("Animal.count = " + Animal.count);

    }
}
