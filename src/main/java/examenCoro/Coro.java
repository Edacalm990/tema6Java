package examenCoro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author eli
 */
public class Coro {

    public Coro() {

    }

    public List<Voz> generarVoces(int numero) {
        List<Voz> listaVoces = new ArrayList<>();
        if (numero < 6) {
            throw new IllegalArgumentException();
        } else {

            for (int i = 0; i < numero; i++) {
                listaVoces.add(Voz.getAleatorio());
            }
        }
        return listaVoces;

    }

    public int getNumeroCorosMixtos(List<Voz> listaVoces) {
        int contador = 0;
        ArrayList<Voz> listaCorosMixtos = new ArrayList<>();
        if (!listaVoces.isEmpty()) {
            for (int i = 0; i < listaVoces.size(); i++) {
                Voz get = listaVoces.get(i);
                if (!listaCorosMixtos.contains(get)) {
                    listaCorosMixtos.add(get);
                    if (listaCorosMixtos.size() == 6) {
                        contador++;
                        listaCorosMixtos.clear();
                    }
                }
            }
        }
        return contador;
    }

    public Set<Voz> buscarVozMasRepetida(List<Voz> listaVoces) {
        
        Map<Voz, Integer> mapVoces = new TreeMap();
        Map<Voz, Integer> mapVocesFinales = new TreeMap();

        for (int i = 0; i < listaVoces.size(); i++) {
            if (mapVoces.containsKey(listaVoces.get(i))) {
                mapVoces.put(listaVoces.get(i), mapVoces.get(listaVoces.get(i)) + 1);
            } else {
                mapVoces.put(listaVoces.get(i), 1);
            }
        }
        
        for (Map.Entry<Voz, Integer> entry : mapVoces.entrySet()) {
            Voz key = entry.getKey();
            Integer value = entry.getValue();
            mapVocesFinales.put(key, value);
            for (Map.Entry<Voz, Integer> entry1 : mapVoces.entrySet()) {
                Integer value1 = entry1.getValue();
                if(value<value1 ){
                mapVocesFinales.remove(key);
                }
            }
            
        }
        
        return mapVocesFinales.keySet();
    }
}
