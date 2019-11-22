import java.util.Random;

public class Ex1L2 {
    public static void main(String[] args) {
        Random gerador = new Random();
        Integer umNumeroA = gerador.nextInt();
        Integer umNumeroB = gerador.nextInt();
        Integer umNumeroC = gerador.nextInt();
        System.out.println("\nMaior número: " + maiorDeTresNumeros(umNumeroA, umNumeroB, umNumeroC));
    }
    public static Integer maiorDeTresNumeros(Integer umNumeroA,Integer umNumeroB,Integer umNumeroC) {
        Integer maior = umNumeroA;
        if (umNumeroB > maior) { maior = umNumeroB; }
        else { maior = maior; }
        if (umNumeroC > maior) { maior = umNumeroC; }
        else { maior = maior; }
        return maior;
    }
}