package arbol_binari;

import java.util.Hashtable;

public class ArbreBinari_Enters {
    Hashtable<Integer, Integer[]> arbol_enteros = new Hashtable<Integer, Integer[]>();

    public void registrarArbol(Integer numPadre, Integer[] fills){
        arbol_enteros.put(numPadre, fills);
    }

    public Integer[] mostrarArbol(Integer numPadre) {
        return arbol_enteros.get(numPadre);
    }
}
