package app;

public class Fraccion {
    public int numerador, denominador;

    public Fraccion(int n, int d){
        this.numerador=n;
        this.denominador=d;
    }
    
    public String toString(){
        return numerador + "/" + denominador;
    }
}
