/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.examen.model;

/**
 *
 * 
 */
public class Alumno {
       private Fecha fec_registro;
    private boolean alumno_vigente;
    private String telefono;
    private Persona persona;
    
    public Alumno(Persona persona, String telefono, Fecha fec_registro) {
        this.fec_registro = fec_registro;
        this.alumno_vigente = true;
        this.telefono = telefono;
        this.persona= persona;
    }

    public Alumno(Persona persona) {
        this.alumno_vigente = true;
    }

   
    public int getAntiguedad() {
       
        return 0;
    }

    public Fecha getFec_registro() {
        return fec_registro;
    }

    public boolean isAlumno_vigente() {
        return alumno_vigente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setFec_registro(Fecha fec_registro) {
        this.fec_registro = fec_registro;
    }

    public void setAlumno_vigente(boolean alumno_vigente) {
        this.alumno_vigente = alumno_vigente;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Alumno{" + "fec_registro=" + fec_registro + ", alumno_vigente=" + alumno_vigente + ", telefono=" + telefono + ", persona=" + persona + '}';
    }
    
           
    }