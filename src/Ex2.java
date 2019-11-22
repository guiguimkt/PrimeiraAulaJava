public class Ex2 {
    public static void main(String[] args) {
        int numeroA = 20;
        int numeroB = 13;
        System.out.println(analisar(numeroA, numeroB));
    }

    public static Boolean analisar(int numA, int numB) {
        if (numA < numB) { return true; }
        else { return false; }
    }
}
