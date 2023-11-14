package a_variables;

import java.util.ArrayList;
import java.util.List;
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

        // region COLLECTIONS
        System.out.println("\nCollections :");
        // Tableaux
        int[] anIntArray = {150,17,29,93,46}; // Je crée un tableau avec des valeurs préféfinies
        String aStringArray[] = {"A String Value", "Another String Value"};
        String[] aDefaultStringArray = new String[10]; // Je crée un tableau de 10 chaines de caractères
        boolean[] aDefaultBooleanArray = new boolean[5]; // [false,false,false,false,false]
        System.out.println(aDefaultStringArray[0]); // Affiche la premiere valeur de mon tableau
        System.out.println(anIntArray[3]); // Les index commencent à 0; (ceci affiche la 4e valeur)

        boolean[][] aBooleanTable = {{true,false},{false,true, true},{}};
        // aBooleanTable[0] : {true,false}
        // aBooleanTable[1] : {false,true, true}
        // aBooleanTable[2] : {}
        System.out.println(aBooleanTable[1][2]);
        //System.out.println(aBooleanTable[2][0]); OutOfBound
        boolean[][] aDafaultBooleanTable = new boolean[3][3];
        /*
        * {false,false,false}
        * {false,false,false}
        * {false,false,false}
        * */
        // La taille d'un tableau est immutable, en cas de besoin il faut réaffecter la variable

        // Les listes sont des collections d'un type dont la taille est variable
        // la déclaration d'une liste se fait via 'la classe' List
        // dont on viens préciser entre <> (chevrons) le type d'éléments contenus
        List<String> aStringList = new ArrayList<>(); // ArrayList est un type de List
        // Particularité pour les types primitifs
        List<Boolean> aBooleanList = new ArrayList<>();
        List<Integer> anIntList = new ArrayList<>();

        anIntArray[1] = 153;
        System.out.println("List : ");
        // Ajout de la valeur 153 dans la liste anIntList
        anIntList.add(153);
        // Affiche la valeur a l'index 0 dans anIntList
        System.out.println(anIntList.get(0));



        System.out.println();
        System.out.println("aStringList:");
        aStringList = new ArrayList<>();

        // Ajout de la valeur 'first' dans aStringList
        aStringList.add("first");
        String second = "second";
        // la fonction add ajoute la valeur en fin de liste
        aStringList.add(second);

        // Affiche la premiere valeur de la liste
        System.out.println("Première valeur : " + aStringList.get(0));
        // first
        String third = "third";
        // Ceci ajoute third dans la liste à l'index 0
        aStringList.add(0,third);
        aStringList.add(1,"fourth");

        System.out.println("Première valeur après ajouts indexés : " + aStringList.get(0)); // third
        // Pour connaitre la position d'un élément dans la liste on utilise la fonction indexOf()
        System.out.println("Index de 'first' : " + aStringList.indexOf("first"));

        //Pour connaitre la taille de la liste
        System.out.println("Taille de la liste : " + aStringList.size());

        // Si jamais on cherche l'index d'un élément qui n'est pas dans la liste j'obtiens '-1'
        System.out.println("Index de 'fifth' : " + aStringList.indexOf("fifth"));

        // Pour supprimer le premier element de la liste (ou à un index particulier)
        aStringList.remove(0);
        System.out.println("Première valeur après suppression : " + aStringList.get(0)); // third
        System.out.println("Taille de la liste après suppression : " + aStringList.size());

        // Pour supprimer un object directement
        aStringList.remove(second);
        // vérification de la suppression
        System.out.println("Index de 'second' : " + aStringList.indexOf(second));

        // Une liste peut contenir des doublons :
        aStringList.add("doublon");
        aStringList.add("doublon");
        aStringList.add("doublon");
        aStringList.add("doublon");
        aStringList.add("doublon");
        System.out.println("Taille de la liste après ajout de doublons : " + aStringList.size());


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