package estudio;

class Auxiliar {
    public static void main(String[] args) {
        MyClass.num_instancias++;
        System.out.println(MyClass.num_instancias);
        
        MyClass x = new MyClass();
        System.out.println(MyClass.num_instancias);
        System.out.println(x.num_instancias);

        MyClass y = new MyClass();
        System.out.println(MyClass.num_instancias);
        System.out.println(x.num_instancias);
    }
}

class MyClass {
    public static int num_instancias = 0;

    public MyClass() {
        num_instancias++;
    }
}
