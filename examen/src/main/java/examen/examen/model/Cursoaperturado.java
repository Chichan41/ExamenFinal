/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.examen.model;

/**
 *
 * 
 */
public class Cursoaperturado {
    private int cod_curso_aperturado;
    private Docente docente;
    private Curso curso;
    private Fecha fecha_inicio;
    private int costo;

    
    public Cursoaperturado(int cod_curso, Docente docente, Curso curso, Fecha fecha_inicio) {
        this.cod_curso_aperturado = cod_curso;
        this.docente = docente;
        this.curso = curso;
        this.fecha_inicio = fecha_inicio;
    }

    public Cursoaperturado(int cod_curso, Docente docente, Curso curso) {
        this.cod_curso_aperturado = cod_curso;
        this.docente = docente;
        this.curso = curso;
    }

   
    public int getCod_curso_aperturado() {
        return cod_curso_aperturado;
    }

    public void setCod_curso_aperturado(int cod_curso_aperturado) {
        this.cod_curso_aperturado = cod_curso_aperturado;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Fecha getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Fecha fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}