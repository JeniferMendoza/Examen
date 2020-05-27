/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_e1;

import java.util.List;

/**
 *
 * @author estef
 */
public class Seccion implements Cloneable {
    private String Salon;
    private String Hora;
    private int TotalAlumnos;
    private LineaAlumno[] LineaA;
    private LineaAlumno oLinea;
    private int i;
    
    public Seccion(){
        LineaA= new LineaAlumno[3];
        i=0;
    }
    
    public void setSalon(String s){
        Salon=s;
    }
    
    public String getSalon(){
        return Salon;
    }
    
    public void setHora(String h){
        Hora=h;
    }
    
    public String getHora(){
        return Hora;
    }
   
   
   public int getTotalAlumnos(){
       Total();
       return TotalAlumnos;
   } 
   
   public void Total(){
       TotalAlumnos=i;
   }
   
   //Clona el objeto LineaAlumno para hacer la composicion
   public void Matricular(LineaAlumno L){
       oLinea= new LineaAlumno();
       oLinea=(LineaAlumno) L.clone();
       LineaA[i]=oLinea;
       i++;
   }
   
   //Muestra los datos de un alumno en particular
   //el valor entero que esta comp parametro es la posicion en la que se encuentra el alumno
   public void ObtenerDatos(int n){
       if (n<=i && n>=0)
       LineaA[n].getDatos();
       System.out.println("Fecha: " + LineaA[n].getFecha());
       
   }
   //Lista todos los alumnos de la seccion
   //getDatos() imprime directamente los datos personales del alunmno
   public void listarAlumnos(){
       for (int j=0;j<i;j++){
           LineaA[j].getDatos();
           System.out.println("Fecha: "+ LineaA[j].getFecha());
       }
   }
   public void EliminarAlumno(int a){
       LineaA[a]=null;
       i--;
       ordenar();
       
   }
   //Ordena el arreglo cuando algun objeto lineaAlumno se ha eliminado
   public void ordenar(){
       int j=0;
       while(j<=i){
           if (LineaA[j]==null){
               LineaA[j]=LineaA[j+1];
           }
           j++;
       }
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
}
