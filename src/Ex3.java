public class Ex3 {
    public static void main(String[] args) {
        int numeroInteiro = 13;
        float resto = numeroInteiro % 2;
        System.out.println(validacao(numeroInteiro, resto));
    }
    public static Boolean validacao(int numeroInteiro, float resto) {
        if (resto != 0 && numeroInteiro > 10) { return true; }
        else { return false; }
    }
}