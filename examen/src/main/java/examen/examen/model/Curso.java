/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.examen.model;

/**
 *
 * 
 */
public class Curso {
    
    private int cod_curso;
    private String nombre;
    private boolean curso_vigente;
    private int años_experiencia;


    public Curso(int cod_curso, String nombre, int años_experiencia) {
        this.cod_curso = cod_curso;
        this.nombre = nombre;
        this.curso_vigente = true; // Inicialmente vigente
        this.años_experiencia = años_experiencia;
    }

    
    public int getCod_curso() {
        return cod_curso;
    }

    public void setCod_curso(int cod_curso) {
        this.cod_curso = cod_curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCurso_vigente() {
        return curso_vigente;
    }

    public void setCurso_vigente(boolean curso_vigente) {
        this.curso_vigente = curso_vigente;
    }

    public int getAños_experiencia() {
        return años_experiencia;
    }

    public void setAños_experiencia(int años_experiencia) {
        this.años_experiencia = años_experiencia;
    }
}