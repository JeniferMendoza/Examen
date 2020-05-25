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
    private String TotalAlumnos;
    private LineaAlumno[] LineaA;
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
    
   public void setTotalAlumnos(String t){
       TotalAlumnos=t;
   }
   
   
   public String getTotalAlumnos(){
       return TotalAlumnos;
   } 
   
   
   public void FechaMatricula(String f){
       LineaA[i].setFecha(f);
       
   }
}
