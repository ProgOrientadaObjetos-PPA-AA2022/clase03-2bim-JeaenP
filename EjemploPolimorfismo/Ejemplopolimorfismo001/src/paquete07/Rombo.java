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
public class Rombo extends Figura{
    double diagonal_menor;
    double diagonal_mayor;

    public Rombo(double diagona_menor, double diagonal_mayor, String caracteristicas) {
        super(caracteristicas);
        this.diagonal_menor = diagona_menor;
        this.diagonal_mayor = diagonal_mayor;
    }
    
    @Override
    public void calcularArea() {
        area = (diagonal_menor * diagonal_mayor)/2;
        
    }
    public double getDiagonal_menor() {
        return diagonal_menor;
    }

    public void setDiagonal_menor(double diagona_menor) {
        this.diagonal_menor = diagona_menor;
    }

    public double getDiagonal_mayor() {
        return diagonal_mayor;
    }

    public void setDiagonal_mayor(double diagonal_mayor) {
        this.diagonal_mayor = diagonal_mayor;
    }
    
    
}
