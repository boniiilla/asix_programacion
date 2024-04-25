package objectes;

import java.util.Dictionary;

class Tasques {
    private String descripcio;
    private String estat;
    public Tasques(String descripcio, String estat){
        this.descripcio = descripcio;
        this.estat = estat;
    }

    public String getDescripcio(){
        return this.descripcio;
    }

    public String getEstat(){
        return this.estat;
    }
}
