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
public class Triangulo extends Figura{
    double base;
    double altura;

    public Triangulo(double base, double altura, String caracteristicas) {
        super(caracteristicas);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void calcularArea() {
        area = (base * altura)/2;
    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
