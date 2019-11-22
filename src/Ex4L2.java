import java.util.Random;

public class Ex4L2 {
    public static void main(String[] args) {
        Random gerador = new Random();
        for (int i = 0; i < 100; ) {
            Integer umNumero = gerador.nextInt();
            int resto = umNumero % 2;
            if (resto > 0 && umNumero > 0) {
                System.out.println(umNumero);
                i++;
            }
        }
    }
}
