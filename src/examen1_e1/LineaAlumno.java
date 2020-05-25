/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_e1;
import java.util.Scanner;
/**
 *
 * @author estef
 */
public class LineaAlumno  {
    private String fecha;
    private Persona Alum;
    private String op;
    Scanner sc=new Scanner(System.in);
    
    public LineaAlumno(){
        
    }
    
    public void setFecha(String F){
        fecha=F;
    }
    
    public void AgregarAlumno(Persona A){
        System.out.println("1. ALUMNO EMPLEADO  2. ALUMNO EMPLEADO");
        op=sc.next();
        if(op=="1"){
            Alum= new Alumno();
            Alum=A;
        }
        else if(op=="2"){
            Alum=new AlumnoEmpleado();
            Alum=A;
        }
        
    }
    
}

