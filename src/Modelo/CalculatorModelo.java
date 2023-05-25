package Modelo;
import Patterns.*;

public class CalculatorModelo {

    public CalculatorModelo() {
    }
    private double numero1;
    private double numero2;
    private CalculadoraTemplate calculadora;

    public void setNumeros(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void setCalculadora(CalculadoraTemplate calculadora, Operacion ope) {
        this.calculadora = calculadora;
        this.calculadora.setOperacion(ope);
    }

    public double calcular() {
        return calculadora.calcular(numero1, numero2);
    }
}

