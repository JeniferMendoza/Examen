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
public class AlumnoEmpleado extends Participante  {
    //HEREDA DE LA CLASE PARTICIPANTE
    //Y AL MISMO TIEMPO DE LA CLASE PERSONA YA QUE PARTICIPANTE HEREDA DE ELLA.
    private String Numero;
    private String Carrera;
    private String Sueldo;
    @Override
    public void setNumeroCuenta(String n){
        Numero=n;
    }
    @Override
    public String getNumeroCuenta(){
        return Numero;
    }
    @Override
    public void setCarrera(String c){
        Carrera=c;
    }
    @Override
    public String getCarrera(){
        return Carrera;
    }
    
    public void setSueldo(String S){
        Sueldo=S;
    }
    public String getSueldo(){
        return Sueldo;
    }
}