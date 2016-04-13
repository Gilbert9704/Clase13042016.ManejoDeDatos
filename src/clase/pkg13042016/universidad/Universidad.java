/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg13042016.universidad;

import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Universidad {
 
    public String nombre;
    public String nit;
    public ArrayList<Programa> programas;
    public ArrayList<Estudiante> estudiantes;

    public Universidad(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.programas = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }
    
    public void agregarEstudiante(String nombre, int edad, char genero, Fecha fechaDeNacimiento, int codigo){
        Estudiante e = new Estudiante(nombre, edad, genero, fechaDeNacimiento, codigo);
        this.estudiantes.add(e);
    }
  
    public void agregarPrograma(String nombre, String departamento){
        Programa p = new Programa(nombre, departamento);
        this.programas.add(p);
    }

    
}
