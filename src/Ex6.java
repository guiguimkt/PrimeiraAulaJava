import java.util.ArrayList;
import java.util.List;

public class Ex6 {

    public static List<Integer> listaDeNumerosPares = new ArrayList<>();

    public static void main(String[] args) {
        List<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(1);
        listaDeNumeros.add(2);
        listaDeNumeros.add(3);
        listaDeNumeros.add(4);

        System.out.println(pares(listaDeNumeros));
    }

    public static List<Integer> pares(List<Integer> ls) {

        for (int i = 0; i < ls.size(); i++) {
            float resto = ls.get(i) % 2;
            if (resto == 0) { listaDeNumerosPares.add(ls.get(i)); }
        }
        return listaDeNumerosPares;
    }
}
