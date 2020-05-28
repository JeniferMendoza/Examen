/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_e2;

/**
 *
 * @author estef
 */
public abstract class Participante extends Persona{
    //SE CONVIERTE EN UNA CLASE ABSTRACTA
    //HEREDANDO DE LA CLASE PERSONA
    private String Numero;
    private String Carrera;
    
    public abstract void setNumeroCuenta(String n);
    public abstract String getNumeroCuenta();
    public abstract void setCarrera(String c);
    public abstract String getCarrera();
    
}
