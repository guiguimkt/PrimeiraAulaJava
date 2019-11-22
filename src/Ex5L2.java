import java.util.Random;

public class Ex5L2 {
    public static void main(String[] args) {
        Random gerador = new Random();
        Integer umNumeroA = gerador.nextInt();
        Integer umNumeroB = gerador.nextInt();
        Integer umNumeroC = gerador.nextInt();
        Integer umNumeroD = gerador.nextInt();

        System.out.println("A: " + umNumeroA);
        System.out.println("B: " + umNumeroB);
        System.out.println("C: " + umNumeroC);
        System.out.println("D: " + umNumeroD);

        System.out.println(algumMaior(umNumeroA, umNumeroB, umNumeroC, umNumeroD));
    }

    public static Boolean algumMaior(Integer umNumeroA, Integer umNumeroB, Integer umNumeroC, Integer umNumeroD) {
        if ((umNumeroA > umNumeroC && umNumeroA > umNumeroD) || (umNumeroB > umNumeroC && umNumeroB > umNumeroD)) { return true; }
        else { return false; }
    }
}
