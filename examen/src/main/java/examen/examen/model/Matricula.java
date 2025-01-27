/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.examen.model;

/**
 *
 * 
 */
public class Matricula {
    private Cursoaperturado cursoMatriculado;
    private Alumno alumno;
    private boolean pagado;
    private Fecha fechaPago;

    
    public Matricula(Cursoaperturado cursoMatriculado, Alumno alumno, boolean pagado,Fecha fechaPago) {
        this.cursoMatriculado = cursoMatriculado;
        this.alumno = alumno;
        this.pagado = pagado;
        this.fechaPago = fechaPago; 
    }

    
    public Cursoaperturado getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(Cursoaperturado cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public Fecha getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Fecha fechaPago) {
        this.fechaPago = fechaPago;
    }

   
    public void pagar() {
        if (!pagado) {
            pagado = true;
            fechaPago = new Fecha(); // Set the payment date to the current date
        } else {
            System.out.println("La matrícula ya está pagada.");
        }
    }
}