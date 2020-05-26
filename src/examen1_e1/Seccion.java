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
public class Seccion {
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
   public void Matricular(LineaAlumno L){
       oLinea= new LineaAlumno();
       oLinea=(LineaAlumno) L.clone();
       LineaA[i]=oLinea;
       i++;
   }
   
   public void ObtenerDatos(int n){
       if (n<=i && n>=0)
       LineaA[n].getDatos();
       System.out.println("Fecha: " + LineaA[n].getFecha());
       
   }
   public void listarAlumnos(){
       for (int j=0;j<=i;j++){
           LineaA[j].getDatos();
           System.out.println("Fecha: "+ LineaA[j].getFecha());
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
