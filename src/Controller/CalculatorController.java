
package Controller;
import Modelo.CalculatorModelo;
public class CalculatorController {
    private CalculatorModelo modelo;
   // private CalculadoraVista vista;

    public CalculatorController(CalculatorModelo modelo) {
        this.modelo = modelo;
     //   this.vista = vista;
    }

    public double calcular() {
        double resultado = modelo.calcular();
        
        System.out.println(resultado);
        return resultado;
       // vista.mostrarResultado(resultado);
    }   
}
