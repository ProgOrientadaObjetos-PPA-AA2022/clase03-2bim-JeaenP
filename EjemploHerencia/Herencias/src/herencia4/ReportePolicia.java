/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte{
    double promedioEdades;
    ArrayList<Policia> lista;
    
    public ReportePolicia(ArrayList<Policia> lista, String codigo) {
        super(codigo);
        this.lista = lista;
    }
    
    public void setLista(ArrayList<Policia> lista) {
        this.lista = lista;
    }
    
    public void calcularPromedioEdades() {
        double promedio = 0;
        for (int i = 0; i < lista.size(); i++) {
            promedio += lista.get(i).getEdad();
        }
        promedioEdades = promedio/lista.size();
    }
    
    public double getPromedioEdades() {
        return promedioEdades;
    }
    
    public ArrayList<Policia> getLista() {
        return lista;
    }
    
    public String toString() {
        String cadena = String.format("Reporte Policia\n\n");
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s%s\n", cadena, lista.get(i));
        }
        cadena = String.format("%sPromedio Edades: %.2f\n",cadena, getPromedioEdades());
        return cadena;
    }
}
