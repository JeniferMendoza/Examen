/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_e1;

/**
 *
 * @author estef
 */
public class Materia {
    private String Codigo;
    private String Nombre;
    private Integer Creditos;
    
    public void setCodigo(String c){
        Codigo=c;
    }
    String getCodigo(){
        return Codigo;
    }
    
    public void setNombre(String n){
        Nombre=n;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setCreditos(Integer cr){
        Creditos=cr;
    }
    public Integer getCreditos(){
        return Creditos;
    }
}
