import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> ocorrencias;

        ocorrencias = contar("Invista em conhecimento e colherás os melhores frutos");
        ocorrencias.forEach((chave, valor) -> System.out.print(chave + ":" + valor + " "));
    }

    private static Map<String, Integer> contar(String frase) {
        Map<String, Integer> resultado = new TreeMap<>();
        List<String> ocorrencias;
        Set<String> letras;

        ocorrencias = Arrays.asList(frase.replace(" ", "").split(""));
        letras = new TreeSet<>(ocorrencias);


        letras.forEach((String letra) -> {
            resultado.put(letra, Collections.frequency(ocorrencias, letra));
        });

        return resultado;
    }}
