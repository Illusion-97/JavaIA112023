package b_operateurs;

import java.util.Random;

public class Conditions {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt();
        int b = random.nextInt(5);
        int c = random.nextInt(2, 5);

        System.out.println("a = " + a + "; b = " + b + "; c = " + c);

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
    }


}
