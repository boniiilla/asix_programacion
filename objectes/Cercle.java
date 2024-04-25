package objectes;

class Cercle {
    private double radi;
    public Cercle(double radi){
        this.radi = radi;        
    }

    public double getRadi(){
        return this.radi;
    }

    public double getArea(){
        return (3.14 * (this.radi * this.radi));
    }

    public double getPerimetre(){
        return (2 * 3.14 * this.radi);
    }
}
