package c_object;

import java.util.ArrayList;
import java.util.List;

/*
* Une classe est une définition de structure (modèle) pour représenter un concept
* on y retrouvera des attributs pour en exprimer l'apparence
* et des comportement (méthodes)
* */
public class Animal {
    public static String nomStatic = "Animal";
    public static List<String> registre = new ArrayList<>();
    public static List<Animal> chenil = new ArrayList<>();
    /*
    * Une variable déclarée directement dans une classe (et non dans une méthode) est appelée attribut de cette classe
    * Cette déclaration implique une précision : la visibilité de cet attribut au sein du programme
    * Il existe 4 types de visibilité :
    *   public  : visible dans toutes les classes du programme
    *   default : visible que dans le même package
    *   protected : visible dans le package et par les classes enfant (ou qu'elles soient)
    *   private : visible uniquement dans la classe elle-même
    *
    * En supplément des informations peuvent être ajoutées qui viendront altérer le 'statut' de l'attribut
    *  static : rends l'attribut propre à la classe et la partage avec toutes les instances
    * */
    public static long count = 0;
    public enum AgeRange { // enum est static par défaut
        JEUNE,ADULTE,SENIOR
    }
    Animal[] parents; // visibilité : default
    protected String nom;
    public long id;
    private int age;

    //{visibilité} {nomDeClasse}() {} -> constructeur
    public Animal() {
        System.out.println("Dans le constructeur d'Animal");
        parents = new Animal[2];
        count++;
        id = count;
        chenil.add(this);
    }

    public Animal(String nom) {
        this(); // Cherche un constructeur qui ne prends aucun parametres
        this.nom = nom;
        registre.add(nom);
    }

    public Animal(String nom, int age) {
        this(nom); // Cherche un constructeur qui ne prend qu'un parametre du meme type que 'nom'
        // Type de nom ? -> String
        // On va donc chercher un constructeur avec un seul parametre, de type String
        this.age = age;
    }

    public Animal (String nom, int age, Animal parent, Animal otherParent) {
        this(nom,age);
        parents[0] = parent;
        parents[1] = otherParent;
    }

    public void test() {
        age = 0;
        id = 5;
        nom = "Toto";
    }

    public AgeRange getAgeRange() {
        if(age < 3) {
            return AgeRange.JEUNE;
        } else if (age > 6) {
            return AgeRange.SENIOR;
        } else {
            return AgeRange.ADULTE;
        }
    }

    public void happyBirthday() {
        age++;
        System.out.printf("Happy Birthday to %s : %d an(s)%n",nom,age);
    }

    @Override
    public String toString() {
        return nom;
    }
}
