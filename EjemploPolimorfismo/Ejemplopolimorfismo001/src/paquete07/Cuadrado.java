/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

/**
 *
 * @author reroes
 */
public class Cuadrado extends Figura {
      double lado;

    public Cuadrado(double lado, String caracteristicas) {
        super(caracteristicas);
        this.lado = lado;
    }
    
    public void calcularArea() {
        area = lado * lado;
    }
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
      
}
