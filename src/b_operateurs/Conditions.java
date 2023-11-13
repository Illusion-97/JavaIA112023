package b_operateurs;

import java.util.Random;

public class Conditions {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt();
        int b = random.nextInt(5);
        int c = random.nextInt(2, 5);

        System.out.println("a = " + a + "; b = " + b + "; c = " + c);
/*
        // region Two Case (true/false)
        System.out.println("If-Else :");
        if (a == b) { // = fait une affectation, == fait une comparaison, != fait une comparaison inverse
            System.out.println("a == b");
        } else if (a == c) {
            System.out.println("a == c");
        } else if (b == c) {
            System.out.println("b == c");
        } else {
            System.out.println("a != b != c");
        }

        System.out.println();
        System.out.println("If Imbriqués :");

        if (a == b && b == c) { // OU : || ; ET : &&
            System.out.println("a == b == c");
        } else {
            if (a == b) {
                System.out.println("a == b");
            } else {
                System.out.println("a != b");
            }
            if (a == c) {
                System.out.println("a == c");
            } else {
                System.out.println("a != c");
            }
            if (b == c) {
                System.out.println("b == c");
            } else {
                System.out.println("b != c");
            }
        }



        System.out.println();
        System.out.println("If-Else Imbriqués :");
        // Si Tous égaux : a == b && a == c
        // Sinon Si Tous différents : a != b && a != c && b != c
        // Sinon : où est l'égalité ?
            // Si ce n'est pas la première, c'est peut-être la seconde, sinon c'est la dernière
        if (a == b && a == c) {
            System.out.println("a == b && a == c");
        } else if (a != b && a != c && b != c) {
            System.out.println("a != b && a != c && b != c");
        } else {
            if (a == b) {
                System.out.println("a == b");
            } else if (b == c) {
                System.out.println("b == c");
            } else {
                System.out.println("a == c");
            }
        }

        boolean condition = random.nextBoolean();
        // Ce qui est écrit dans les parenthèses après if, est évalué (calculé) pour obtenir un booléen
        // De ce fait une variable de type booléen peut être utilisée dans un if
        if (condition) {
            System.out.println("Condition vraie");
        } else {
            System.out.println("Condition fausse");
        }

        if (random.nextBoolean()) {
            System.out.println("Condition vraie");
        } else {
            System.out.println("Condition fausse");
        }

        // Syntaxe de la ternaire :
        // {condition} ? {valeurVraie} : {valeurFausse}
        String result = condition ? "Condition vraie" : "Condition fausse";
        System.out.println(result);

        System.out.println(random.nextBoolean() ? "Condition vraie" : "Condition fausse");
        // endregion
        */
        //region multiple case
        // b est compris entre 0 et 4
        /*
        * b == 0 : Origin Value
        * b == 2 : Mid Value
        * b == 4 : Bound Value
        * sinon : Impair
        * */
        switch (b) {
            case 0 : { // b == 0
                System.out.println("Origin Value");
                break;
            }
            case 2 :
                System.out.println("Mid Value");
                break;
            case 4:
                System.out.println("Bound Value");
                break;
            default:
                System.out.println("Impair");
        }
        System.out.println();
        // Lorsque TOUS les cas d'un switch ont un break, on peut simplifier la syntaxe
        switch (b) {
            case 0 -> System.out.println("Origin Value");
            case 2 -> System.out.println("Mid Value");
            case 4 -> System.out.println("Bound Value");
            default -> System.out.println("Impair");
        }
        System.out.println();
        /*
         * b == 0 : Origin Value
         *          Lower Half
         * b == 1 : Lower Half
         * b == 2 : Mid Value
         * b == 3 : Upper Half
         * b == 4 : Bound Value
         *          Upper Half
        * */

        // Dans un case de switch, toutes les instructions suivantes sont exécutées tant qu'il n'y a pas de break
        switch (b) {
            case 0 :
                System.out.println("Origin Value");
            case 1:
                System.out.println("Lower Half");
                break;
            case 4 :
                System.out.println("Bound Value");
            case 3:
                System.out.println("Upper Half");
                break;
            default:
                System.out.println("Mid Value");
        }
        //endregion
    }


}
