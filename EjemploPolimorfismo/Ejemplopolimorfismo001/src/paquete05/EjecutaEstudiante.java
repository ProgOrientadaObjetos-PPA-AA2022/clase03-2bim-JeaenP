
package paquete05;

import java.util.ArrayList;
import java.util.Scanner;


public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
        */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        // se crea una variable(op) para usarla en el ciclo do-while
        int op;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
        // inicio de solución
        System.out.println("Elija una opcion");
        System.out.println("1) Ingresar un Estudiante Presencial");
        System.out.println("2) Ingresar un Estudiante Distancia");
        System.out.println("0) Salir");
        op = entrada.nextInt();
        entrada.nextLine();
        
        while ( op != 0 && ( op == 1 || op == 2)) {
            // se solicita el ingreso de los valores para atributos de la super clase
            // fuera de los siguientes if debido a que son los mismos en ambos casos
            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();

            if (op == 1) {

                // crear objeto de ripo estudiante presencial
                EstudiantePresencial estudianteP = new EstudiantePresencial();
                
                //pedir daatos y establecerlos dentro del objeto de tipo
                //estudiante presencial previamente creado
                System.out.println("Ingrese el número de créditos");
                numeroCreds = entrada.nextInt();
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = entrada.nextDouble();
                
                estudianteP.establecerNombresEstudiante(nombresEst);
                estudianteP.establecerApellidoEstudiante(apellidosEst);
                estudianteP.establecerIdentificacionEstudiante(identificacionEst);
                estudianteP.establecerEdadEstudiante(edadEst);
                estudianteP.establecerNumeroCreditos(numeroCreds);
                estudianteP.establecerCostoCredito(costoCred);
                
                // se añade el objeto creado a el array list estudiantes
                estudiantes.add(estudianteP);
                
            } else {
                
                
                    // se crea una instandia de tipo estudiante a distancia
                    EstudianteDistancia estudianteD = new EstudianteDistancia();
                    
                    // se piden datos para llenar el objeto de tipo estudiante distancia
                    System.out.println("Ingrese el número de asignaturas");
                    numeroAsigs = entrada.nextInt();
                    System.out.println("Ingrese el costo de cada cada asignatura");
                    costoAsig = entrada.nextDouble();

                    
                    estudianteD.establecerNombresEstudiante(nombresEst);
                    estudianteD.establecerApellidoEstudiante(apellidosEst);
                    estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                    estudianteD.establecerEdadEstudiante(edadEst);
                    estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                    estudianteD.establecerCostoAsignatura(costoAsig);
                    
                    // se añade el objeto creado a el array list estudiantes
                    estudiantes.add(estudianteD);
                    
                                                      
            }
            
            // se solicita al usuario decidir si ingresar otro estudiante o no
            System.out.println("Desea ingresar otro estudiante?");
            System.out.println("1) Si");
            System.out.println("0) No");
            op = entrada.nextInt();
            if (op == 1) {
                System.out.println("Elija una opcion");
                System.out.println("1) Ingresar un Estudiante Presencial");
                System.out.println("2) Ingresar un Estudiante Distancia");
                op = entrada.nextInt();
            }
            //se limpia el buffer del scanner para evitar saltos de linea inconvenientes
            entrada.nextLine();
        }
       
        
        
        
        
        // se establece un ciclo que calcula el costo matricula y presenta a 
        // cada estudiante
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();
            
            System.out.printf("Datos Estudiante\n"
                        + "%s\n",                        
                  estudiantes.get(i));
            
        }
    }

}