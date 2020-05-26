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
    private Persona Alum ;
    private String op;
    Scanner sc=new Scanner(System.in);
    
    public LineaAlumno(){
        if(op=="1"){
            Alum= new Alumno();
        }
        else if(op=="2"){
            Alum=new AlumnoEmpleado();
        }
        else
            System.out.println("Digiste 1 o 2");
        
    }
    
    public void setFecha(String F){
        fecha=F;
    }
    public String getFecha(){
        return fecha;
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
        else
            System.out.println("Digiste 1 o 2");
        
    }
    public Object clone(){ 
        Object obj= null;
        try{
            obj= super.clone();
        }
        catch(CloneNotSupportedException e){
            System.out.println(" no se puede duplicar");
        }
        return obj;
    }
    
    
    public void getDatos(){
        if (op=="1"){
            System.out.println("Alumno");
        }
        else
            System.out.println("Alumno Empleado");
        System.out.print("Nombre Completo: "+ Alum.getNombreCompleto());
    }
}

