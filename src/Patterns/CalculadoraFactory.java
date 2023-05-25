/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patterns;

/**
 *
 * @author tecnologynomads
 */
//patron de diseño factory
public class CalculadoraFactory {
    
    //para deteminar si es de tipo entero o real
    public CalculadoraTemplate crearCalculadora(boolean enteros) {
        if (enteros) {
            return new CalculadoraEnteros();
        } else {
            return new CalculadoraReales();
        }
    }
}
