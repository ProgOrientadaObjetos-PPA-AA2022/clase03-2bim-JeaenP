/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;
/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {
    double promedioMatriculas;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(ArrayList<Estudiante> lista, String codigo) {
        super(codigo);
        this.lista = lista;
    }

    public void setLista(ArrayList<Estudiante> lista) {
        this.lista = lista;
    }
    
    public void calcularPromedioMatriculas() {
        double promedio = 0;
        for (int i = 0; i < lista.size(); i++) {
            promedio += lista.get(i).getMatricula();
        }
        promedioMatriculas = promedio/lista.size();
    }

    public ArrayList<Estudiante> getLista() {
        return lista;
    }
    
    public double getPromedioMatriculas() {
        return promedioMatriculas;
    }
    
    public String toString() {
        String cadena = String.format("Reporte Estudiante\n\n");
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s%s\n", cadena, lista.get(i));
        }
        cadena = String.format("%sPromedio Matriculas: %.2f\n",cadena, getPromedioMatriculas());
        return cadena;
    }
    
}
