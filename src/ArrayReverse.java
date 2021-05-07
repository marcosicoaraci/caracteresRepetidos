import java.util.ArrayList;
import java.util.List;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] numeros = {10,20,30,40,50};
        List<Integer> numerosReversos = new ArrayList<>();

        for ( int i =  numeros.length - 1 ; i >= 0 ; i-- ) {
            numerosReversos.add(numeros[i]);
        }

        int [] arrayreverso = numerosReversos.stream().mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < arrayreverso.length; i++) {
            System.out.println(arrayreverso[i]);
        }

    }
}
