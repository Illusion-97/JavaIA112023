package a_variables;

import java.util.Objects;

public class Types {
    public static void main(String[] args) {
        // region PRIMITIFS
        // Les types primitifs ont des tailles mémoire prédéfinies ce qui leur permet d'avoir des valeurs par défaut.
        boolean aBoolean = false;   // 1 bit    : type le plus simple pour effectuer des vérifications
        byte aByte = 0;             // 8 bits   : pour des nombres cours ou pour la constitution de fichiers
        short aShort = 0;           // 16 bits  : pour des données plus lourdes qu'un type byte
        char aChar = '\u0000';      // 16 bits  : corresponds à l'ensemble des caractères textuels possibles
        int anInt = 0;              // 32 bits  : communément utilisé pour les entiers
        float aFloat = 0.0f;        // 32 bits  : type utilisable pour les nombres à virgule flottante
        long aLong = 0;             // 64 bits  : pour des entiers dont la taille peut excéder la limite du type int
        double aDouble = 0.0d;      // 64 bits  : type par défaut utilisé pour les nombres à virgule
        // endregion

        double nombreAVirgule = 5.36;
        aBoolean = true;

        // region Déclaration et Initialisation
        // Ceci est une déclaration, {type} {nomDeVariable} : je déclare une variable que je pourrais utiliser par la suite dans mon code
        // Attention une déclaration n'affecte pas automatiquement une valeur par défaut (dans une méthode l'initialisation est obligatoire)
        boolean anotherBoolean;
        // La premiere affectation d'une valeur à une variable déclarée, est appelée initialisation
        anotherBoolean = true;
        // Ici, je déclare et initialise une variable en une seule ligne {type} {nomDeVariable} = {valeur}
        int anotherInt = 52;
        //

        // region REFERENCE
        // Les types référence n'ont pas de taille mémoire prédéfinie, de ce fait, leur valeur par défaut est 'null'
        String aString = null;
        aString = "Je suis une chaine de caractères";
        aString = "Je suis une autre chaine de caractères";

        // Différence avec les primitifs :
        // byte étant forcément sur 8 bits, dans la mémoire une référence de ce type serait par défaut : 00000000
        // String n'ayant pas de taille, tant qu'une valeur "réelle" ne lui est pas affectée, par défaut (considérant une taille de 0) : '' traduit par null

        // Cette fonction me permet d'afficher quelque chose dans le terminal de mon application
        System.out.println("J'affiche une ligne"); // raccourci 'sout'
        System.out.println(aBoolean); // la fonction fait automatiquement la conversion vers du texte lisible


        // En java tous les types référence SONT des Objets (sont de type Object)
        Object anObject = null;
        System.out.println("aString Value :");
        System.out.println(aString);
        // Cette fonction demande, à l'intérieur de ma variable de type String, de changer tous les espaces en -
        System.out.println("Appel de la fonction Replace");
        aString.replace(" ", "-");
        System.out.println("Résultat après appel : ");
        System.out.println(aString);
        // Les String sont dit Immutable : la valeur affectée ne peut pas se modifier
        System.out.println("Retour de la fonction Replace : ");
        System.out.println(aString.replace(" ", "-"));
        aString = aString.replace(" ", "-");
        System.out.println("Nouvelle valeur de aString après réaffectation :");
        System.out.println(aString);
        // Point particulier avec les String, pour conserver un changement effectué via une méthode
        // il faut réaffecter la variable avec le résultat de la méthode
        // endregion

        System.out.printf("%n%n%n");
        test();

        // region WRAPPER
        Integer anIntWrapper = 0; // int anInt = 0;
        int anIntFromWrapper = new Integer(0); // Déprécié
        // WRAPPER.valueOf({value}) permet d'obtenir une donnée du type primitif associé au wrapper
        int anIntFromWrapperValue = Integer.valueOf(0); // Situationnel : vérifier une correspondance de type
        int anIntFromWrapperStringValue = Integer.valueOf("0"); // Déprécié
        int anIntFromWrapperParseStringValue = Integer.parseInt("0"); // Utile pour valider des saisies utilisateur
        // end


    }


    private static void test() {
        // une valeur de type String s'écrit entre "
        // une valeur de type char s'écrit entre '
        String aString = "String Content";
        System.out.println("Before Replace : " + aString); // Concaténation
        aString = aString.replace(" ", "");
        String afterReplace = "After Replace : ";
        System.out.println(afterReplace + aString);
    }
}