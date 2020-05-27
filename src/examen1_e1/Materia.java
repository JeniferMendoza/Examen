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
    private int Creditos;
    private Seccion oSeccion;
    private Seccion[] LSeccion;
    private int i=0;
    
    public Materia(){
     LSeccion=new Seccion[3];   
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
    public int getCreditos(){
        return Creditos;
    }
    
    public void Agregarseccion(Seccion s){
        oSeccion=new Seccion();
        oSeccion=s;
        LSeccion[i]=oSeccion;
        i++;
    }
    
    public void ListarSecciones(){
        if(i<=0){
            System.out.println("NO HAY SECCIONES");
        }
        else{
        System.out.println(getNombre());
        for(int j=0;j<i;j++){
        System.out.print((j+1) + " ");
        System.out.print("Hora: " + LSeccion[j].getHora());
        System.out.print(" Salon: " + LSeccion[j].getSalon());
        System.out.println(" Total Alumos: " + LSeccion[j].getTotalAlumnos());
        }
        }
    }
    
    public void listarDatosSeccion(int n){
        System.out.println("Hora: "+LSeccion[n].getHora());
        System.out.println("Salon: "+LSeccion[n].getSalon());
        System.out.println("Total Alumnos: " + LSeccion[n].getTotalAlumnos());
        System.out.println("Lista de Alumnos: ");
        LSeccion[n].listarAlumnos();
    }
    //Borra las secciones
    //
    public void BorrarSeccion(int a){
        LSeccion[a]=null;
        i--;
        ordenar();
    }
    
    //Ordena el Arreglo Seccion cuando algun objeto seccio sea eliminado
    public void ordenar(){
       int j=0;
       while(j<=i){
           if (LSeccion[j]==null){
               LSeccion[j]=LSeccion[j+1];
           }
           j++;
       }
   }
}
