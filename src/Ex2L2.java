import java.util.Random;

public class Ex2L2 {
    public static void main(String[] args) {
        Random gerador = new Random();

        String umTextoA = "teste";
        String umTextoB = "teste";

        System.out.println(cadeiasDeTextoDiferentes(umTextoA, umTextoB));
    }

    public static Boolean cadeiasDeTextoDiferentes(String umTextoA, String umTextoB) {
        if (umTextoA.equals(umTextoB)) { return false; }
        else { return true; }
    }
}
