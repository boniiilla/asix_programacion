package arbol_binari;

import java.util.Hashtable;

public class ArbreBinari_String {
    Hashtable<String, String[]> arbol_string = new Hashtable<String, String[]>();

    public void registrarArbol(String strPadre, String[] fills){
        arbol_string.put(strPadre, fills);
    }

    public String[] mostrarArbol(String strPadre) {
        return arbol_string.get(strPadre);
    }
}
