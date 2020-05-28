/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_e1;
import java.util.Scanner;

/**
 *
 * @author estef
 */
public class Examen1_E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Alumno oAlumno;
        AlumnoEmpleado oAlumnoE;
        Materia oMateria;
        Seccion oSeccion;
        LineaAlumno oLinea;
        
        oAlumno=new Alumno();
        oAlumno.setNombreCompleto("Jenifer M");
        oAlumno.setId("08011999");
        oAlumno.setDireccion("Tegucigalpa");
        oAlumno.setNumeroCuenta("2017100");
        oAlumno.setCarrera("IS");
        oAlumno.setCredito(false);
        
        oLinea=new LineaAlumno();
        oLinea.AgregarAlumno(oAlumno);
        oLinea.setFecha("HOY");
        
        oSeccion=new Seccion();
        oSeccion.Matricular(oLinea);
        oSeccion.setHora("1900");
        oSeccion.setSalon("210");
        
        oMateria=new Materia();
        
        oMateria.setNombre("POO");
        oMateria.setCodigo("IS410");
        oMateria.setCreditos(20);
        oMateria.Agregarseccion(oSeccion);
        
        oAlumnoE = new AlumnoEmpleado();
        oAlumnoE.setNombreCompleto("Daniel C");
        oAlumnoE.setId("0801");
        oAlumnoE.setDireccion("Tegucigalpa");
        oAlumnoE.setNumeroCuenta("201...");
        oAlumnoE.setCarrera("IS");
        oAlumnoE.setSueldo("23000");
        
        oLinea=new LineaAlumno();
        oLinea.AgregarAlumnoEmpleado(oAlumnoE);
        oLinea.setFecha("27/5/20");
        oSeccion.Matricular(oLinea);
        
        oMateria.BorrarSeccion(0);
        oMateria.ListarSecciones();
        oSeccion.EliminarAlumno(0);
        
        oSeccion.listarAlumnos();
        
    }
    
}
