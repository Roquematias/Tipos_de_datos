package Punto_20;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion sumarFracciones(Fraccion f2) {
        int nuevoNumerador = this.numerador * f2.denominador + f2.numerador * this.denominador;
        int nuevoDenominador = this.denominador * f2.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion restarFracciones(Fraccion f2) {
        int nuevoNumerador = this.numerador * f2.denominador - f2.numerador * this.denominador;
        int nuevoDenominador = this.denominador * f2.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion multiplicarFracciones(Fraccion f2) {
        int nuevoNumerador = this.numerador * f2.numerador;
        int nuevoDenominador = this.denominador * f2.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion dividirFracciones(Fraccion f2) {
        if (f2.numerador == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
        int nuevoNumerador = this.numerador * f2.denominador;
        int nuevoDenominador = this.denominador * f2.numerador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }
    public String toString() {
        return numerador + "/" + denominador;
    }
}
