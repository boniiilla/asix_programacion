package gestor_tasques;

import java.util.HashMap;

public class GestorTasques {

    HashMap<String, HashMap<String, String>> tasques = new HashMap<String, HashMap<String, String>>();

    public void afegirTasca(String tasca, String prioritat, String estat){
        HashMap<String, String> prioritat_estat = new HashMap<String, String>();

        prioritat_estat.put(prioritat, estat);

        tasques.put(tasca, prioritat_estat);
    }
}
