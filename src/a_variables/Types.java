package a_variables;

public class Types {
    public static void main(String[] args) {
        // region PRIMITIFS
        boolean aBoolean = false;   // 1 bit    : type le plus simple pour effectuer des vérifications
        byte aByte = 0;             // 8 bits   : pour des nombres cours ou pour la constitution de fichiers
        short aShort = 0;           // 16 bits  : pour des données plus lourdes qu'un type byte
        char aChar = '\u0000';      // 16 bits  : corresponds à l'ensemble des caractères textuels possibles
        int anInt = 0;              // 32 bits  : communément utilisé pour les entiers
        float aFloat = 0.0f;        // 32 bits  : type utilisable pour les nombres à virgule flottante
        long aLong = 0;             // 64 bits  : pour des entiers dont la taille peut excéder la limite du type int
        double aDouble = 0.0d;      // 64 bits  : type par défaut utilisé pour les nombres à virgule
        // endregion
    }
}