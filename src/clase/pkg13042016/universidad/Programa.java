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
public class Programa {
    
    public String nombre;
    public String departamento;
    public ArrayList<Curso> cursos;

    public Programa(String nombre, String departamento) {
        this.departamento = departamento;
        this.cursos = new ArrayList<>();
    }
    
    public void agregarCurso(String nombre, int creditos){
        Curso c = new Curso(nombre, creditos);
        this.cursos.add(c);
    }
}
