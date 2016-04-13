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
public class Estudiante {
    
    public String nombre;
    public int edad;
    public char genero;
    public Fecha fechaDeNacimiento;
    public int codigo;

    public Estudiante(String nombre, int edad, char genero, Fecha fechaDeNacimiento, int codigo) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.codigo = codigo;
    }
 
    
}
