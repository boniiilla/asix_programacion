package interficies;

abstract interface FiguraGeometrica{
    abstract void calcularArea();
    abstract void calcularPerimetre();

}

abstract class Figura2D implements FiguraGeometrica {
    private int base;
    private int altura;

    public Figura2D(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return this.base;
    }

    public int getArea() {
        return this.altura;
    }
}