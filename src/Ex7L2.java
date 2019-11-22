import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex7L2 {
    public static void main(String[] args) {
        Random gerador = new Random();
        Integer minimo = 1;
        Integer maximo = 6;
        List<Integer> fila = listaDeNumerosEntre(minimo, maximo);
        System.out.println("Exibindo números entre " + minimo + " e " + maximo);
        for (int i = 0; i < fila.size(); i++) { System.out.println(fila.get(i)); }
    }

    public static ArrayList<Integer> listaDeNumerosEntre(Integer minimo, Integer maximo) {
        ArrayList<Integer> lista = new ArrayList<>();
        Integer prox = minimo;
        while (prox != maximo) {
            prox++;
            if (prox == maximo) { break; }
            else {
                lista.add(prox);
            }
        }
        return lista;
    }
}