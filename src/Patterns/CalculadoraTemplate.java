package Patterns;

//patron de diseño Template
//clase abstracta que define los metodos a ser sobrescritos
public  abstract class CalculadoraTemplate {
    protected Operacion operacion;

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    public double calcular(double numero1, double numero2) {
        validarOperandos(numero1, numero2);
        return realizarOperacion(numero1, numero2);
    }

    protected abstract void validarOperandos(double numero1, double numero2);

    protected abstract double realizarOperacion(double numero1, double numero2);
}

class CalculadoraEnteros extends CalculadoraTemplate {
    @Override
    protected void validarOperandos(double numero1, double numero2) {
        if (numero1 != (int) numero1 || numero2 != (int) numero2) {
            throw new IllegalArgumentException("Los operandos deben ser números enteros.");
        }
    }

    @Override
    protected double realizarOperacion(double numero1, double numero2) {
        return Math.round(operacion.ejecutar(numero1, numero2));
    }
}

class CalculadoraReales extends CalculadoraTemplate {
    @Override
    protected void validarOperandos(double numero1, double numero2) {
        // No se requiere validación adicional para números reales
    }

    @Override
    protected double realizarOperacion(double numero1, double numero2) {
        System.out.println(numero1+"-"+numero2);
        return operacion.ejecutar(numero1, numero2);
    }
}
