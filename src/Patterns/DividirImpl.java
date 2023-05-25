/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patterns;

import javax.swing.JOptionPane;

/**
 *
 * @author tecnologynomads
 */
public class DividirImpl implements Operacion {
    @Override
    public double ejecutar(double numero1, double numero2) {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            JOptionPane.showMessageDialog(null,"No es posible dividir por cero");
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
    }
}