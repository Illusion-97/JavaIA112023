package b_operateurs;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class Boucles {
    public static void main(String[] args) {
        // Pour chaque valeur de i (déclaré dans le for)
        // en partant de 0 et tant que i est inférieur à 10
        // avec un pas de +1 à chaque action (itération) (i++ est équivalent à : i = i + 1)
        for (int i = 0; i < 10; i ++) {
            System.out.println("Itération : " + i);
        }
        // Dans les parenthèses de for, je déclare en premier la variable qui servira à l'itération avec sa valeur initiale
        // Ensuite je définis la limite à atteindre par cette variable
        // et enfin je définis le pas, communément ++ pour une incrémentation de 1, sinon += {pas}

        Random random = new Random();
        // Déclaration de plusieurs variables du même type
        int origin = random.nextInt(1,10),
                bound = origin + random.nextInt(1, origin + 1);
        int[] anIntArray = random.ints(origin,origin,bound).toArray();

        System.out.println("Origin (taille du tableau): " + origin + "; Bound (valeur max exclusive) : " + bound);
        for (int i = 0; i < anIntArray.length; i++) {
            // printf permet d'afficher du texte formaté avec des variables -> String.format()
            // Pour définir des variables dans le texte à formater : %d représente un nombre, %s du texte, %n un saut de ligne
            System.out.printf("Index : %d, Value : %d  %n", i, anIntArray[i]);
        }

        System.out.println("Foreach : ");
        // Syntaxe du foreach (pour chaque valeur dans une collection) for ({type} {valueName} : {collectionName})
        System.out.print("anIntArray : {"); // Ne saute pas de ligne
        for (int value : anIntArray) {
            System.out.printf("%d, ", value);
        }
        System.out.println("}");

        // Solution 'ForEach'
        int interation = 0;
        System.out.print("anIntArray : {"); // Ne saute pas de ligne
        for (int value : anIntArray) {
            interation++;
            //System.out.print(value + (interation == anIntArray.length ? "}\n" : ", "));
            if (interation == anIntArray.length) {
                System.out.print(value + "}\n");
            } else {
                System.out.print(value + ", ");
            }
        }

        // Solution 'Fori'
        System.out.print("anIntArray : {"); // Ne saute pas de ligne
        for (int i = 0; i < anIntArray.length; i++) {
            System.out.print(anIntArray[i] + (i == anIntArray.length -1 ? "}\n" : ", "));
        }

        // Solution 3
        System.out.printf("anIntArray : {%s}%n", Arrays.stream(anIntArray)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")));


        /*
        aRandomBooleanTable[1][1] = true;
        System.out.println(aRandomBooleanTable[0][0]);
        */
        // Je crée une table dont toutes les lignes ont le même nombre de colonnes
        boolean[][] aRandomBooleanTable = new boolean[random.nextInt(origin,bound)][random.nextInt(origin,bound)];
        /*
         * {false,false,false}
         * {false,false,false}
         * {false,false,false}
         * {false,false,false}
        * */
        // aBooleanTable[0] : {true,false}
        // aBooleanTable[1] : {false,true, true}
        // aBooleanTable[2] : {}
        // affectation d'un boolean aléatoire = random.nextBoolean();
        // aRandomBooleanTable[2][1] = random.nextBoolean();
        // 1er objectif : affecter une valeur aléatoire a tous les emplacements de 'aRandomBooleanTable'
        for (int i = 0; i < aRandomBooleanTable.length; i++) {
            // i représente l'index d'une ligne de la table
            //boolean[] line = aRandomBooleanTable[i];
            for (int j = 0; j < aRandomBooleanTable[i].length; j++) {
                // j représente l'index d'une colonne
                aRandomBooleanTable[i][j] = random.nextBoolean();
            }
        }
        /*
         * {false,true,false}
         * {true,true,true}
         * {true,false,true}
         * {false,false,false}
         * */
        /*
         * {X,O,X}
         * {O,O,O}
         * {O,X,O}
         * {X,X,X}
         * */

    }
}
