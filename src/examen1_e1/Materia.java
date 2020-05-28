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
    //ATRIBUTOS 
    private String Codigo;
    private String Nombre;
    private Integer Creditos;
    private Seccion oSeccion;
    private Seccion[] LSeccion;
    private int i=0;
    
    public Materia(){
        
    }
    
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
    
    public void Agregarseccion(Seccion s){
        oSeccion=new Seccion();
        oSeccion=(Seccion)s.clone();
        LSeccion[i]=oSeccion;
        i++;
    }
    
    public void ListarSecciones(){
        for(int j=0;j<=i;j++){
            System.out.println(j+1);
        System.out.println(LSeccion[j].getHora());
        System.out.println(LSeccion[j].getSalon());
        System.out.println(LSeccion[j].getTotalAlumnos());
        }
    }
    
    public void listarDatosSeccion(int n){
        System.out.println("Hora: "+LSeccion[n].getHora());
        System.out.println("Salon: "+LSeccion[n].getSalon());
        System.out.println(LSeccion[n].getTotalAlumnos());
        System.out.println("Lista de Alumnos: ");
        LSeccion[n].listarAlumnos();
    }
}
