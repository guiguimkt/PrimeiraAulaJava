import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(1);
        listaDeNumeros.add(2);
        listaDeNumeros.add(3);
        listaDeNumeros.add(4);

        
        Integer resultado = 0;

        for (int i = 0; i < listaDeNumeros.size(); i++) {
            resultado += listaDeNumeros.get(i);
        }

        System.out.println(resultado);
    }
}
