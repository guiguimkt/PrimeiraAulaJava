import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex6L2 {
    public static void main(String[] args) {
        List<Integer> fila = new ArrayList<>();
        fila = listaDePrimeirosCemPositivos();
        for (int i = 0; i < fila.size(); i++) {
            System.out.println("Index " + i + ": Valor " + fila.get(i));
        }
    }

    public static ArrayList<Integer> listaDePrimeirosCemPositivos() {
        Random gerador = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 100;) {
            Integer umNumero = gerador.nextInt();
            if (umNumero > 0) {
                lista.add(umNumero);
                i++;
            }
        }

        return lista;
    }
}
