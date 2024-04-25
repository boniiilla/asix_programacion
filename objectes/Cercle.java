package objectes;

class Cercle {
    private double radi;
    private double area;
    private double perimetre;
    public Cercle(double radi, double area, double perimetre){
        this.radi = radi;
        this.area = (3.14 * (radi * radi));
        this.perimetre = (2 * 3.14 * radi);
    }

    public double getRadi(){
        return this.radi;
    }

    public double getArea(){
        return this.area;
    }

    public double getPerimetre(){
        return this.perimetre;
    }

    public void setRadi(double r){
        this.radi = r;
    }
}
