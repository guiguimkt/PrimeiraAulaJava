import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(1);
        listaDeNumeros.add(2);
        listaDeNumeros.add(3);
        listaDeNumeros.add(4);

        System.out.println(pares(listaDeNumeros));
    }

    public static int pares(List<Integer> ls) {
        Integer resultado = 0;
        for (int i = 0; i < ls.size(); i++) {
            float resto = ls.get(i) % 2;
            if (resto == 0) { resultado += ls.get(i); }
        }
        return resultado;
    }
}
