package interficies;

abstract interface FiguraGeometrica{
    abstract void calcularArea();
    abstract void calcularPerimetre();

}

abstract class Figura2D implements FiguraGeometrica {
    private double base;
    private double altura;

    public Figura2D(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public double getArea() {
        return this.altura;
    }
}