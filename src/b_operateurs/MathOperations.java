package b_operateurs;

import java.util.Random;

public class MathOperations {
    public static void main(String[] args) {

        // region Auto Affectation
        int i = 0;
        // je calcule la nouvelle valeur
        int j = i + 1;
        // puis, je la réaffecte à la variable
        i = j;

        // ceci fait la même chose
        i = i + 1;
        // également la même chose
        i += 1;

        // dans le cas d'une incrémentation de 1 :
        i++;

        // Tout ceci est également valable sur la soustraction
        i--;

        System.out.println("Valeur de i : ");
        System.out.println("départ : " + i);
        // Pour les calculs auto affectés :
        i -= 5;
        System.out.println("i -= 5 : ");
        System.out.println("résultat : " + i);
        i *= 2;
        System.out.println("i *= 2 : ");
        System.out.println("résultat : " + i);
        i /= 3;
        System.out.println("i /= 3 : ");
        System.out.println("résultat : " + i);

        // endregion

        // region String
        // Pour les String le symbole '+' est utilisé pour la 'concaténation'
        // le principe étant d'ajouter du texte à la suite;

        String texte = "String Content";
        System.out.println(texte + " String Added");
        System.out.println(texte + " And i = " + i);
        System.out.println("Texte avant auto affectation : ");
        System.out.println(texte);
        texte += " And i = "; // Réaffecte automatiquement la valeur de texte avec la concaténation
        texte += i; // Ici meme principe tout en changeant l'entier en texte
        System.out.println("Texte après auto affectation : ");
        System.out.println(texte);
        // Substring permet de récupérer une partie d'un String en précisant l'index de départ et celui d'arrivée
        System.out.println(texte.substring(7,14));
        System.out.println("Texte après substring : ");
        System.out.println(texte);
        // Réaffectation du résultat
        texte = texte.substring(0,14);
        System.out.println("Texte après réaffectation du substring : ");
        System.out.println(texte);

        System.out.println("\nEmail : ");
        // Pour obtenir des éléments d'un String de part et d'autre d'un caractère
        String email = "yadekalom@jehann.fr";
        String[] splitResult = email.split("@");
        String nomPrenom = splitResult[0];
        // limite le nombre de données au cas ou il y aurait plusieurs séparations possibles
        String[] hoteAndDomain = splitResult[1].split("\\.", 2);
        System.out.println("Nom et Prenom : " + nomPrenom);
        System.out.println("Hote : " + hoteAndDomain[0]);
        System.out.println("Domaine : " + hoteAndDomain[1]);


        System.out.println("\nFormatage de texte : ");
        // Formatage de String avec des variables
        /*
        * Dans le cadre de cette méthode :
        * %s représente une variable de type String
        * %d représente une variable numérique
        * %n représente un saut de ligne
        * %t pour une tabulation
        * %10.2f pour un nombre à virgule (je demande ici 10 chiffres avant et 2 apres la virgule)
        * */
        String texteFormatte = String.format("%s --- %s === %d $$$ %n", texte, "And i =", i);
        System.out.print(texteFormatte);

        // Ceci fera la même chose :
        System.out.print(String.format("%s --- %s === %d $$$ %n", texte, "And i =", i));

        // C'est exactement ce que fait printf
        System.out.printf("%s --- %s === %d $$$ %n",texte, "And i =", i);
        //endregion

        //region Random
        Random random = new Random();
        //endregion
    }
}
