/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_e2;
import java.util.Scanner;
/**
 *
 * @author estef
 */
public class LineaAlumno implements Cloneable  {
    private String fecha;
    private Persona oAlum;
    private Alumno Alum;
    private AlumnoEmpleado AlumE;
    private int op;
    Scanner sc=new Scanner(System.in);
    
    public LineaAlumno(){
        
    }
    
    public void setFecha(String F){
        fecha=F;
    }
    public String getFecha(){
        return fecha;
    }
     //Instancia un Objeto Alumno
    public void AgregarAlumno(Alumno A){
            Alum= new Alumno();
            Alum=A;
        op=1;
    }
    //Instancia un Objeto AlumnoEmpleado
    public void AgregarAlumnoEmpleado(AlumnoEmpleado A){
            AlumE=new AlumnoEmpleado();
            AlumE=A;
            op=2;
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
    
    //Imprime todos los datos de Alumno
    public void getDatos(){
        //Si OP=1 El Alumno no es emplado
        
        if (op==1){
            System.out.println("Alumno_ ");
        System.out.println("Nombre Completo: "+ Alum.getNombreCompleto()+" ");
        System.out.println("No Cuenta:"+ Alum.getNumeroCuenta());
        System.out.println("Carrera: "+ Alum.getCarrera());
        System.out.println("Credito: " + Alum.getCredito());
        }
        else{
            System.out.println("Alumno Empleado_ ");
            System.out.println("Nombre Completo: "+ AlumE.getNombreCompleto()+" ");
            System.out.println("No Cuenta:"+ AlumE.getNumeroCuenta());
            System.out.println("Carrera: "+ AlumE.getCarrera());
            System.out.println("Sueldo: "+ AlumE.getSueldo());
            
        }
        
    }
}

