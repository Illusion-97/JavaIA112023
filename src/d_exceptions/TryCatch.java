package d_exceptions;

import a_variables.Types;
import c_object.Jardin;

import java.util.Random;

public class TryCatch {
    public static void main(String[] args) {
        String nullString = null;
        try {
            // try permet de tester du code susceptible de générer des erreurs
            nullString.replace(";", "!");
            System.out.println("Opération réussie");
        } catch (NullPointerException nullPointerException) {
            // catch permet d'effectuer des traitements afin d'empêcher le programme de planter
            System.out.println("Opération échouée");
        } finally {
            // finally définis un traitement à effectuer dans tous les cas
            System.out.println("Fin d'action replace");
        }
        System.out.println();
        try {
            Types.nullReplace();
        } catch (NullPointerException e) {
            System.out.println("Classe d'exception : " + e.getClass().getSimpleName());
            System.out.println("Message d'exception : " + e.getMessage());
            e.printStackTrace(System.out);
        } finally {
            System.out.println("Probleme reglé");
        }

        try {
            throwRuntimeException();
            throwException();
        } catch (RuntimeException e) {
            System.out.println("Classe d'exception : " + e.getClass().getSimpleName());
            System.out.println("Message d'exception : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception gérée : " + e.getMessage());
        }

    }



    /*
     * Il y a 3 type de classes pouvant faire planter un programme, ces 3 types héritent de Throwable
     * Error : StackOverflowError
     * Exception : Les problèmes les plus courants dont on impose la gestion
     * RuntimeException : Ce sont des Exceptions dites 'légères'
     * */

    private static void throwException() throws Exception {
        throw new Exception("Exception Générique");
    }

    private static void throwRuntimeException() {
        if(new Random().nextInt(0,101) >= 500) {
            throw new RuntimeException("Exception Générique");
        }
    }

    private static void throwError() {
        throw new Error("Erreur générique");
    }



}
