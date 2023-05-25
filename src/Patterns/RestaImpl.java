package Patterns;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Patterns.Operacion;

/**
 *
 * @author tecnologynomads
 */
public class RestaImpl implements Operacion {
    @Override
    public double ejecutar(double numero1, double numero2) {
        return numero1 - numero2;
    }
}