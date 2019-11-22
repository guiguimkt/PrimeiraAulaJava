import java.util.Random;

public class Ex3L2 {
    public static void main(String[] args) {
        Random gerador = new Random();
        Integer umNumero = gerador.nextInt();
        System.out.println(umNumero);
        System.out.println(par(umNumero));
    }

    public static Boolean par(Integer umNumero) {
        int resto = umNumero % 2;
        if (resto > 0) { return false; }
        else { return true; }
    }
}