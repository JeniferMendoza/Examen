/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_e1;


public class Alumno extends Participante  {
    private boolean CreditoActivo;
    private String Numero;
    private String Carrera;
    
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
    
    public void setCredito(boolean C){
        CreditoActivo=C;
    }
    public boolean getCredito(){
        return CreditoActivo;
    }
}
