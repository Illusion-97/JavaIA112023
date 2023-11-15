package c_object;

import java.util.ArrayList;
import java.util.List;

public class FightClub {
    public static List<Chien> combattants = new ArrayList<>();

    public static void afficherCombattants() {
        System.out.println("\nCombattants :");
        for (Chien chien : combattants) {
            System.out.print(chien + " aboie : ");
            chien.bark();
        }
    }
}
