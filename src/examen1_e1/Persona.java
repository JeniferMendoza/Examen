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
public class Persona {
    private String NombreCompleto;
    private String Direccion;
    private String id;
    
    public void setNombreCompleto(String nombre){
        NombreCompleto=nombre;
    }
    
    public String getNombreCompleto(){
        return NombreCompleto;
    }
    
    public void setDireccion(String direccion){
        Direccion=direccion;
    }
    
    public String getDireccion(){
        return Direccion;
    }
    
    public void setId(String id){
        this.id=id;
    }
    
    public String getId(){
        return id;
    }
}
