/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte{
    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente( ArrayList<Docente> lista, String codigo) {
        super(codigo);
        this.lista = lista;
    }
    
    public void calcularPromedioSueldos() {
        double promedio = 0;
        for (int i = 0; i < lista.size(); i++) {
            promedio += lista.get(i).getSueldo();
        }
        promedioSueldos = promedio/lista.size();
    }
    
    public void setLista(ArrayList<Docente> lista) {
        this.lista = lista;
    }
    
    public ArrayList<Docente> obtenerLista() {
        return lista;
    }
    
    public double obtenerPromedioSueldos() {
        return promedioSueldos;
    }
    
    public String toString() {
        String cadena = String.format("Reporte Docente\n\n");
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s%s\n", cadena, lista.get(i));
        }
        cadena = String.format("%sPromedio sueldos: %.2f\n",cadena, obtenerPromedioSueldos());
        return cadena;
    }
    

    
    
    
}
